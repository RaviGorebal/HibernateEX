/* ---------------------------DROPS DB OBJECTS------------------------------*/
DROP TABLE STUDENT;

/* ---------------------------TABLES------------------------------*/
CREATE TABLE STUDENT
(
  STUDENT_ID  	  NUMBER(5),
  STUDENT_NAME    VARCHAR2(45 BYTE)                     NOT NULL,
  EMAIL           VARCHAR2(45 BYTE)                     NOT NULL,
  PHONE_NO        VARCHAR2(15 BYTE)                     NOT NULL 
);


/* ---------------------------PK CONSTRAINTS------------------------------*/
 
ALTER TABLE STUDENT ADD (
CONSTRAINT PK_STUDENT
PRIMARY KEY
(STUDENT_ID));

