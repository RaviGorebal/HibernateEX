DROP USER HIBERNATE CASCADE;


CREATE USER "HIBERNATE" IDENTIFIED BY "hibernate";

GRANT ADMINISTER DATABASE TRIGGER TO HIBERNATE WITH ADMIN OPTION;

BEGIN
SYS.Dbms_Resource_Manager_Privs.GRANT_SYSTEM_PRIVILEGE
  (GRANTEE_NAME   => 'HIBERNATE', 
   PRIVILEGE_NAME => 'ADMINISTER_RESOURCE_MANAGER',
   ADMIN_OPTION   => TRUE);
END;
/

GRANT ADMINISTER ENCRYPTION TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER ANY CLUSTER TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER ANY DIMENSION TO HIBERNATE WITH ADMIN OPTION;

BEGIN
SYS.Dbms_Rule_Adm.GRANT_SYSTEM_PRIVILEGE(
  PRIVILEGE    => SYS.Dbms_Rule_Adm.ALTER_ANY_EVALUATION_CONTEXT,
  Grantee      => 'HIBERNATE',
  GRANT_OPTION => TRUE);
END;
/

GRANT ALTER ANY INDEX TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER ANY INDEXTYPE TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER ANY LIBRARY TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER ANY OPERATOR TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER ANY OUTLINE TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER ANY PROCEDURE TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER ANY ROLE TO HIBERNATE WITH ADMIN OPTION;

BEGIN
SYS.Dbms_Rule_Adm.GRANT_SYSTEM_PRIVILEGE(
  PRIVILEGE    => SYS.Dbms_Rule_Adm.ALTER_ANY_RULE,
  Grantee      => 'HIBERNATE',
  GRANT_OPTION => TRUE);
END;
/

BEGIN
SYS.Dbms_Rule_Adm.GRANT_SYSTEM_PRIVILEGE(
  PRIVILEGE    => SYS.Dbms_Rule_Adm.ALTER_ANY_RULE_SET,
  Grantee      => 'HIBERNATE',
  GRANT_OPTION => TRUE);
END;
/

GRANT ALTER ANY ENCRYPTION PROFILE TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER ANY SEQUENCE TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER ANY SNAPSHOT TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER ANY TABLE TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER ANY TRIGGER TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER ANY TYPE TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER DATABASE TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER PROFILE TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER RESOURCE COST TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER ROLLBACK SEGMENT TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER SESSION TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER SYSTEM TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER TABLESPACE TO HIBERNATE WITH ADMIN OPTION;

GRANT ALTER USER TO HIBERNATE WITH ADMIN OPTION;

GRANT ANALYZE ANY TO HIBERNATE WITH ADMIN OPTION;

GRANT AUDIT ANY TO HIBERNATE WITH ADMIN OPTION;

GRANT AUDIT SYSTEM TO HIBERNATE WITH ADMIN OPTION;

GRANT BACKUP ANY TABLE TO HIBERNATE WITH ADMIN OPTION;

GRANT BECOME USER TO HIBERNATE WITH ADMIN OPTION;

GRANT COMMENT ANY TABLE TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ANY CLUSTER TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ANY CONTEXT TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ANY DIMENSION TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ANY DIRECTORY TO HIBERNATE WITH ADMIN OPTION;

BEGIN
SYS.Dbms_Rule_Adm.GRANT_SYSTEM_PRIVILEGE(
  PRIVILEGE    => SYS.Dbms_Rule_Adm.CREATE_ANY_EVALUATION_CONTEXT,
  Grantee      => 'HIBERNATE',
  GRANT_OPTION => TRUE);
END;
/

GRANT CREATE ANY INDEX TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ANY INDEXTYPE TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ANY LIBRARY TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ANY OPERATOR TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ANY OUTLINE TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ANY PROCEDURE TO HIBERNATE WITH ADMIN OPTION;

BEGIN
SYS.Dbms_Rule_Adm.GRANT_SYSTEM_PRIVILEGE(
  PRIVILEGE    => SYS.Dbms_Rule_Adm.CREATE_ANY_RULE,
  Grantee      => 'HIBERNATE',
  GRANT_OPTION => TRUE);
END;
/

BEGIN
SYS.Dbms_Rule_Adm.GRANT_SYSTEM_PRIVILEGE(
  PRIVILEGE    => SYS.Dbms_Rule_Adm.CREATE_ANY_RULE_SET,
  Grantee      => 'HIBERNATE',
  GRANT_OPTION => TRUE);
END;
/

GRANT CREATE ANY ENCRYPTION PROFILE TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ANY SEQUENCE TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ANY SNAPSHOT TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ANY SYNONYM TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ANY TABLE TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ANY TRIGGER TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ANY TYPE TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ANY VIEW TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE CLUSTER TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE DATABASE LINK TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE DIMENSION TO HIBERNATE WITH ADMIN OPTION;

BEGIN
SYS.Dbms_Rule_Adm.GRANT_SYSTEM_PRIVILEGE(
  PRIVILEGE    => SYS.Dbms_Rule_Adm.CREATE_EVALUATION_CONTEXT_OBJ,
  Grantee      => 'HIBERNATE',
  GRANT_OPTION => TRUE);
END;
/

GRANT CREATE INDEXTYPE TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE LIBRARY TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE OPERATOR TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE PROCEDURE TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE PROFILE TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE PUBLIC DATABASE LINK TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE PUBLIC SYNONYM TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ROLE TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE ROLLBACK SEGMENT TO HIBERNATE WITH ADMIN OPTION;

BEGIN
SYS.Dbms_Rule_Adm.GRANT_SYSTEM_PRIVILEGE(
  PRIVILEGE    => SYS.Dbms_Rule_Adm.CREATE_RULE_OBJ,
  Grantee      => 'HIBERNATE',
  GRANT_OPTION => TRUE);
END;
/

BEGIN
SYS.Dbms_Rule_Adm.GRANT_SYSTEM_PRIVILEGE(
  PRIVILEGE    => SYS.Dbms_Rule_Adm.CREATE_RULE_SET_OBJ,
  Grantee      => 'HIBERNATE',
  GRANT_OPTION => TRUE);
END;
/

GRANT CREATE ENCRYPTION PROFILE TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE SEQUENCE TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE SESSION TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE SNAPSHOT TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE SYNONYM TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE TABLE TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE TABLESPACE TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE TRIGGER TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE TYPE TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE USER TO HIBERNATE WITH ADMIN OPTION;

GRANT CREATE VIEW TO HIBERNATE WITH ADMIN OPTION;

GRANT DEBUG ANY PROCEDURE TO HIBERNATE WITH ADMIN OPTION;

GRANT DEBUG CONNECT SESSION TO HIBERNATE WITH ADMIN OPTION;

GRANT DELETE ANY TABLE TO HIBERNATE WITH ADMIN OPTION;

BEGIN
SYS.Dbms_Aqadm.GRANT_SYSTEM_PRIVILEGE (
  PRIVILEGE    => 'DEQUEUE_ANY',
  Grantee      => 'HIBERNATE',
  ADMIN_OPTION => TRUE);
END;
/

GRANT DROP ANY CLUSTER TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ANY CONTEXT TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ANY DIMENSION TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ANY DIRECTORY TO HIBERNATE WITH ADMIN OPTION;

BEGIN
SYS.Dbms_Rule_Adm.GRANT_SYSTEM_PRIVILEGE(
  PRIVILEGE    => SYS.Dbms_Rule_Adm.DROP_ANY_EVALUATION_CONTEXT,
  Grantee      => 'HIBERNATE',
  GRANT_OPTION => TRUE);
END;
/

GRANT DROP ANY INDEX TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ANY INDEXTYPE TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ANY LIBRARY TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ANY OPERATOR TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ANY OUTLINE TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ANY PROCEDURE TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ANY ROLE TO HIBERNATE WITH ADMIN OPTION;

BEGIN
SYS.Dbms_Rule_Adm.GRANT_SYSTEM_PRIVILEGE(
  PRIVILEGE    => SYS.Dbms_Rule_Adm.DROP_ANY_RULE,
  Grantee      => 'HIBERNATE',
  GRANT_OPTION => TRUE);
END;
/

BEGIN
SYS.Dbms_Rule_Adm.GRANT_SYSTEM_PRIVILEGE(
  PRIVILEGE    => SYS.Dbms_Rule_Adm.DROP_ANY_RULE_SET,
  Grantee      => 'HIBERNATE',
  GRANT_OPTION => TRUE);
END;
/

GRANT DROP ANY ENCRYPTION PROFILE TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ANY SEQUENCE TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ANY SNAPSHOT TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ANY SYNONYM TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ANY TABLE TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ANY TRIGGER TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ANY TYPE TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ANY VIEW TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP PROFILE TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP PUBLIC DATABASE LINK TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP PUBLIC SYNONYM TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP ROLLBACK SEGMENT TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP TABLESPACE TO HIBERNATE WITH ADMIN OPTION;

GRANT DROP USER TO HIBERNATE WITH ADMIN OPTION;

BEGIN
SYS.Dbms_Aqadm.GRANT_SYSTEM_PRIVILEGE (
  PRIVILEGE    => 'ENQUEUE_ANY',
  Grantee      => 'HIBERNATE',
  ADMIN_OPTION => TRUE);
END;
/

BEGIN
SYS.Dbms_Rule_Adm.GRANT_SYSTEM_PRIVILEGE(
  PRIVILEGE    => SYS.Dbms_Rule_Adm.EXECUTE_ANY_EVALUATION_CONTEXT,
  Grantee      => 'HIBERNATE',
  GRANT_OPTION => TRUE);
END;
/

GRANT EXECUTE ANY INDEXTYPE TO HIBERNATE WITH ADMIN OPTION;

GRANT EXECUTE ANY LIBRARY TO HIBERNATE WITH ADMIN OPTION;

GRANT EXECUTE ANY OPERATOR TO HIBERNATE WITH ADMIN OPTION;

GRANT EXECUTE ANY PROCEDURE TO HIBERNATE WITH ADMIN OPTION;

BEGIN
SYS.Dbms_Rule_Adm.GRANT_SYSTEM_PRIVILEGE(
  PRIVILEGE    => SYS.Dbms_Rule_Adm.EXECUTE_ANY_RULE,
  Grantee      => 'HIBERNATE',
  GRANT_OPTION => TRUE);
END;
/

BEGIN
SYS.Dbms_Rule_Adm.GRANT_SYSTEM_PRIVILEGE(
  PRIVILEGE    => SYS.Dbms_Rule_Adm.EXECUTE_ANY_RULE_SET,
  Grantee      => 'HIBERNATE',
  GRANT_OPTION => TRUE);
END;
/

GRANT EXECUTE ANY TYPE TO HIBERNATE WITH ADMIN OPTION;

GRANT EXEMPT ACCESS POLICY TO HIBERNATE WITH ADMIN OPTION;

GRANT FLASHBACK ANY TABLE TO HIBERNATE WITH ADMIN OPTION;

GRANT FORCE ANY TRANSACTION TO HIBERNATE WITH ADMIN OPTION;

GRANT FORCE TRANSACTION TO HIBERNATE WITH ADMIN OPTION;

GRANT GLOBAL QUERY REWRITE TO HIBERNATE WITH ADMIN OPTION;

GRANT GRANT ANY OBJECT PRIVILEGE TO HIBERNATE WITH ADMIN OPTION;

GRANT GRANT ANY PRIVILEGE TO HIBERNATE WITH ADMIN OPTION;

GRANT GRANT ANY ROLE TO HIBERNATE WITH ADMIN OPTION;

GRANT INSERT ANY TABLE TO HIBERNATE WITH ADMIN OPTION;

GRANT LOCK ANY TABLE TO HIBERNATE WITH ADMIN OPTION;

BEGIN
SYS.Dbms_Aqadm.GRANT_SYSTEM_PRIVILEGE (
  PRIVILEGE    => 'MANAGE_ANY',
  Grantee      => 'HIBERNATE',
  ADMIN_OPTION => TRUE);
END;
/

GRANT MANAGE TABLESPACE TO HIBERNATE WITH ADMIN OPTION;

GRANT ON COMMIT REFRESH TO HIBERNATE WITH ADMIN OPTION;

GRANT QUERY REWRITE TO HIBERNATE WITH ADMIN OPTION;

GRANT RESTRICTED SESSION TO HIBERNATE WITH ADMIN OPTION;

GRANT RESUMABLE TO HIBERNATE WITH ADMIN OPTION;

GRANT SELECT ANY DICTIONARY TO HIBERNATE WITH ADMIN OPTION;

GRANT SELECT ANY SEQUENCE TO HIBERNATE WITH ADMIN OPTION;

GRANT SELECT ANY TABLE TO HIBERNATE WITH ADMIN OPTION;

GRANT SYSDBA TO HIBERNATE WITH ADMIN OPTION;

GRANT SYSOPER TO HIBERNATE WITH ADMIN OPTION;

GRANT UNDER ANY TABLE TO HIBERNATE WITH ADMIN OPTION;

GRANT UNDER ANY TYPE TO HIBERNATE WITH ADMIN OPTION;

GRANT UNDER ANY VIEW TO HIBERNATE WITH ADMIN OPTION;

GRANT UNLIMITED TABLESPACE TO HIBERNATE WITH ADMIN OPTION;

GRANT UPDATE ANY TABLE TO HIBERNATE WITH ADMIN OPTION;

GRANT "AQ_ADMINISTRATOR_ROLE" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "AQ_USER_ROLE" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "AUTHENTICATEDUSER" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "CONNECT" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "CTXAPP" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "DBA" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "DELETE_CATALOG_ROLE" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "EJBCLIENT" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "EXECUTE_CATALOG_ROLE" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "EXP_FULL_DATABASE" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "GATHER_SYSTEM_STATISTICS" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "HS_ADMIN_ROLE" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "IMP_FULL_DATABASE" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "JAVADEBUGPRIV" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "JAVAIDPRIV" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "JAVASYSPRIV" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "JAVAUSERPRIV" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "JAVA_ADMIN" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "JAVA_DEPLOY" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "LOGSTDBY_ADMINISTRATOR" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "OEM_MONITOR" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "OLAP_DBA" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "RECOVERY_CATALOG_OWNER" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "RESOURCE" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "SALES_HISTORY_ROLE" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "SELECT_CATALOG_ROLE" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "WKUSER" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "WM_ADMIN_ROLE" TO "HIBERNATE" WITH ADMIN OPTION;
GRANT "XDBADMIN" TO "HIBERNATE" WITH ADMIN OPTION;
ALTER USER "HIBERNATE" DEFAULT ROLE "AQ_ADMINISTRATOR_ROLE", "AQ_USER_ROLE", "AUTHENTICATEDUSER", "CONNECT", "CTXAPP", "DBA", "DELETE_CATALOG_ROLE", "EJBCLIENT", "EXECUTE_CATALOG_ROLE", "EXP_FULL_DATABASE", "GATHER_SYSTEM_STATISTICS", "HS_ADMIN_ROLE", "IMP_FULL_DATABASE", "JAVADEBUGPRIV", "JAVAIDPRIV", "JAVASYSPRIV", "JAVAUSERPRIV", "JAVA_ADMIN", "JAVA_DEPLOY", "LOGSTDBY_ADMINISTRATOR", "OEM_MONITOR", "OLAP_DBA", "RECOVERY_CATALOG_OWNER", "RESOURCE", "SALES_HISTORY_ROLE", "SELECT_CATALOG_ROLE", "WKUSER", "WM_ADMIN_ROLE", "XDBADMIN";

BEGIN
  SYS.Dbms_Resource_Manager.clear_pending_area();
  SYS.Dbms_Resource_Manager.create_pending_area();
  SYS.Dbms_Resource_Manager_Privs.GRANT_SWITCH_CONSUMER_GROUP (
   'HIBERNATE', 'DEFAULT_CONSUMER_GROUP', TRUE);
  SYS.Dbms_Resource_Manager.submit_pending_area();
END;
/

BEGIN
  SYS.Dbms_Resource_Manager.clear_pending_area();
  SYS.Dbms_Resource_Manager.create_pending_area();
  SYS.Dbms_Resource_Manager_Privs.GRANT_SWITCH_CONSUMER_GROUP (
   'HIBERNATE', 'SYS_GROUP', TRUE);
  SYS.Dbms_Resource_Manager.submit_pending_area();
END;
/

BEGIN
  SYS.Dbms_Resource_Manager.clear_pending_area();
  SYS.Dbms_Resource_Manager.create_pending_area();
  SYS.Dbms_Resource_Manager_Privs.GRANT_SWITCH_CONSUMER_GROUP (
   'HIBERNATE', 'LOW_GROUP', TRUE);
  SYS.Dbms_Resource_Manager.submit_pending_area();
END;
/
