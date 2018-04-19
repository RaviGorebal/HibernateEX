DROP TABLE STUDENT_121;
DROP TABLE ADDRESS_121;

CREATE TABLE STUDENT_121
(
  STUDENT_ID    NUMBER,
  ADDRESS_ID    NUMBER,
  STUDENT_NAME  VARCHAR2(50)
);

 
 CREATE TABLE ADDRESS_121
 (
   ADDRESS_ID  NUMBER,
   ZIPCODE     VARCHAR2(20)
 );
 
 
ALTER TABLE STUDENT_121 ADD (
CONSTRAINT PK_STUDENT_121
PRIMARY KEY
(STUDENT_ID));


ALTER TABLE ADDRESS_121 ADD (
CONSTRAINT PK_ADDRESS_121
PRIMARY KEY
(ADDRESS_ID));


ALTER TABLE STUDENT_121 ADD (
CONSTRAINT FK_STUDENT_121_ADDRESS_ID
FOREIGN KEY (ADDRESS_ID) 
REFERENCES ADDRESS_121 (ADDRESS_ID));

