DROP TABLE EMPLOYEE1;
DROP TABLE DEPARTMENT;

CREATE TABLE EMPLOYEE1
(
  EMPLOYEE1_ID      NUMBER(4),
  DEPARTMENT_ID    NUMBER(2),
  ENAME            VARCHAR2(10 BYTE),
  JOB              VARCHAR2(9 BYTE)  NOT NULL,
  HIREDATE         DATE,
  SALARY           NUMBER(7,2),
  COMMISSION       NUMBER(7,2)
);

CREATE TABLE DEPARTMENT
(
  DEPARTMENT_ID    NUMBER(2),
  DNAME            VARCHAR2(14 BYTE),
  LOCATION         VARCHAR2(13 BYTE)
);

ALTER TABLE DEPARTMENT ADD (
  CONSTRAINT PK_DEPARTMENT
 PRIMARY KEY
 (DEPARTMENT_ID));
 
 ALTER TABLE EMPLOYEE1 ADD (
   CONSTRAINT PK_EMPLOYEE1	
  PRIMARY KEY
 (EMPLOYEE1_ID));
 
 ALTER TABLE EMPLOYEE1 ADD (
   CONSTRAINT FK_EMPLOYEE1_DEPARTMENT_ID
  FOREIGN KEY (DEPARTMENT_ID) 
 REFERENCES DEPARTMENT (DEPARTMENT_ID));
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 