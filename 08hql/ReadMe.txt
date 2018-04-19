iterate() Vs list()

Occasionally, you might be able to achieve better performance by executing the query using the
iterate() method. This will usually be the case if you expect that the actual entity instances
returned by the query will already be in the session or second-level cache. If they are not already
cached, iterate() will be slower than list() and might require many database hits for a simple
query, usually 1 for the initial select which only returns identifiers, and n additional selects to
initialize the actual instances.

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

update()
*******
• the application loads an object in the first session
• the object is passed up to the UI tier
• some modifications are made to the object
• the object is passed back down to the business logic tier
• the application persists these modifications by calling update() in a second session

saveOrUpdate() does the following:
**********************************
• if the object is already persistent in this session, do nothing
• if another object associated with the session has the same identifier, throw an exception
• if the object has no identifier property, save() it
• if the object's identifier has the value assigned to a newly instantiated object, save() it
• if the object is versioned by a <version> or <timestamp>, and the version property value is the
  same value assigned to a newly instantiated object, save() it
• otherwise update() the object

merge() is very different:
*************************
• if there is a persistent instance with the same identifier currently associated with the session,
  copy the state of the given object onto the persistent instance
• if there is no persistent instance currently associated with the session, try to load it from the
  database, or create a new persistent instance
• the persistent instance is returned
• the given instance does not become associated with the session, it remains detached

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

save() vs persist()
*******************

If Cat has a generated identifier, the identifier is generated and assigned to the cat when save() 
is called. If Cat has an assigned identifier, or a composite key, the identifier should be assigned to 
the cat instance before calling save(). You can also use persist() instead of save(), with the semantics 
defined in the EJB3 early draft.

persist() makes a transient instance persistent. However, it does not guarantee that the identifier 
value will be assigned to the persistent instance immediately, the assignment might happen at flush time. 
persist() also guarantees that it will not execute an INSERT statement if it is called outside of 
transaction boundaries. This is useful in long-running conversations with an extended Session/persistence 
context. save() does guarantee to return an identifier. If an INSERT has to be executed to get the 
identifier ( e.g. "identity" generator, not "sequence"), this INSERT happens immediately, 
no matter if you are inside or outside of a transaction. This is problematic in a long-running 
conversation with an extended Session/persistence context.

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
get() vs load()
***************

Be aware that load() will throw an unrecoverable exception if there is no matching database row. 
If the class is mapped with a proxy, load() just returns an uninitialized proxy and does not actually hit 
the database until you invoke a method of the proxy. This is useful if you wish to create an association 
to an object without actually loading it from the database. It also allows multiple instances to be 
loaded as a batch if batch-size is defined for the class mapping.

If you are not certain that a matching row exists, you should use the get() method which hits the 
database immediately and returns null if there is no matching row.



