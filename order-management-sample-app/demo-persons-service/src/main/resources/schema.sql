
  CREATE TABLE PERSONS
   (PERSON_ID NUMBER(15,0) NOT NULL ,
	PRINCIPAL_NAME VARCHAR2(60 BYTE) NOT NULL ,
	TITLE VARCHAR2(12 BYTE),
	FIRST_NAME VARCHAR2(30 BYTE),
	LAST_NAME VARCHAR2(30 BYTE),
	PERSON_TYPE_CODE VARCHAR2(30 BYTE) NOT NULL ,
	SUPPLIER_ID NUMBER(15,0),
	PROVISIONED_FLAG VARCHAR2(1 BYTE) DEFAULT 'N',
	PRIMARY_ADDRESS_ID NUMBER(15,0),
	REGISTERED_DATE DATE,
	MEMBERSHIP_ID NUMBER(15,0),
	EMAIL VARCHAR2(25 BYTE) NOT NULL ,
	CONFIRMED_EMAIL VARCHAR2(25 BYTE),
	PHONE_NUMBER VARCHAR2(20 BYTE),
	MOBILE_PHONE_NUMBER VARCHAR2(20 BYTE),
	CREDIT_LIMIT NUMBER(9,2),
	DATE_OF_BIRTH DATE,
	MARITAL_STATUS_CODE VARCHAR2(30 BYTE) NOT NULL ,
	GENDER VARCHAR2(1 BYTE) NOT NULL ,
	CHILDREN_UNDER_18 NUMBER(2,0),
	APPROXIMATE_INCOME NUMBER(15,0),
	CONTACT_METHOD_CODE VARCHAR2(30 BYTE),
	CONTACTABLE_FLAG VARCHAR2(1 BYTE) DEFAULT 'Y' NOT NULL ,
	CONTACT_BY_AFFILLIATES_FLAG VARCHAR2(1 BYTE) DEFAULT 'Y' NOT NULL ,
	CREATED_BY VARCHAR2(60 BYTE) NOT NULL ,
	CREATION_DATE DATE NOT NULL ,
	LAST_UPDATED_BY VARCHAR2(60 BYTE) NOT NULL ,
	LAST_UPDATE_DATE DATE NOT NULL ,
	OBJECT_VERSION_ID NUMBER(15,0) NOT NULL ,
	 CONSTRAINT PERSONS_PK PRIMARY KEY (PERSON_ID) ,
--   USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS
--   STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
--   PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
--   TABLESPACE USERS  ,
	 CONSTRAINT PERSONS_GENDER_CHK CHECK (GENDER in ('M','F','D')) ,
	 CONSTRAINT PERSONS_CONTACT_CHK CHECK (CONTACTABLE_FLAG in ('Y','N')) ,
	 CONSTRAINT PERSONS_AFF_CONTACT_CHK CHECK (CONTACT_BY_AFFILLIATES_FLAG in ('Y','N')) ,
	 CONSTRAINT PERSONS_PROVISIONED_CHK CHECK (PROVISIONED_FLAG in ('Y','N'))
-- 	 CONSTRAINT PERSONS_ADDRESSES_FK FOREIGN KEY (PRIMARY_ADDRESS_ID)
-- 	  REFERENCES ADDRESSES (ADDRESS_ID) ,
-- 	 CONSTRAINT PERSONS_MEMBERSHIPS_BASE_FK FOREIGN KEY (MEMBERSHIP_ID)
-- 	  REFERENCES MEMBERSHIPS_BASE (MEMBERSHIP_ID) ,
-- 	 CONSTRAINT PERSON_SUPPLIER_FK FOREIGN KEY (SUPPLIER_ID)
-- 	  REFERENCES SUPPLIERS (SUPPLIER_ID) ENABLE
   )  ;

--    COMMENT ON COLUMN PERSONS.PERSON_ID IS 'Unique Identifier for a Person';
--    COMMENT ON COLUMN PERSONS.PRINCIPAL_NAME IS 'Associates this person record with a security username (principle name) from LDAP or whatever security credential store is in use. ';
--    COMMENT ON COLUMN PERSONS.PERSON_TYPE_CODE IS 'Descriminator column: Customer or Staff. References LOOKUP_CODES, domain PERSON_TYPE_CODE';
--    COMMENT ON COLUMN PERSONS.PROVISIONED_FLAG IS 'Boolean (Y/N) flag used to indicate if a person has been provisioned (created) in the security repository';
--    COMMENT ON COLUMN PERSONS.PRIMARY_ADDRESS_ID IS 'Main address of the person. This will be used as the default for filling in forms etc.';
--    COMMENT ON COLUMN PERSONS.REGISTERED_DATE IS 'The date that this person was registered on the system - note that this may not match the CREATION_DATE if the customer delays in confirming the registration.  The CREATION_DATE records when the record was created in the table, the REGISTERED_DATE records when the registration was finally confirmed. Implicitly a record with no REGISTRATION_DATE is a person who has begun, but not completed the registration process';
--    COMMENT ON COLUMN PERSONS.MEMBERSHIP_ID IS 'Customers may enroll in the membership program either using an ID unique to them or a shared Partner or Corporate ID';
--    COMMENT ON COLUMN PERSONS.EMAIL IS 'Contact email for the person. If this needs to be updated once the record is created then the user will either have to call customer support, or if they use the UI then they will have to confirm the email address change from the old email address (CONFIRMED_EMAIL) before it is finalised. Once the new address is confirmed both EMAIL and CONFIRMED_EMAIL will be set to the same value.';
--    COMMENT ON COLUMN PERSONS.CONFIRMED_EMAIL IS 'The confirmed email column holds the last known good email address for the user. This will be set during the confirmation (identity verification) stage of the registration and as part of the final step of an email change operation';
--    COMMENT ON COLUMN PERSONS.PHONE_NUMBER IS 'Primary contact number';
--    COMMENT ON COLUMN PERSONS.CREDIT_LIMIT IS 'Calculated credit limit for this person used by the various rules within the shipping process';
--    COMMENT ON COLUMN PERSONS.MARITAL_STATUS_CODE IS 'Link to the LOOKUP_CODES table, MARITAL_STATUS_DOMAIN';
--    COMMENT ON COLUMN PERSONS.GENDER IS 'Three way flag M - Male, F - Female, D - Decline to Answer';
--    COMMENT ON COLUMN PERSONS.APPROXIMATE_INCOME IS 'Income  rounded - no precision needed';
--    COMMENT ON COLUMN PERSONS.CONTACT_METHOD_CODE IS 'Link to the LOOKUP_CODES table, domain: CONTACT_METHOD_CODE';
--    COMMENT ON COLUMN PERSONS.CONTACTABLE_FLAG IS 'Can the person be contacted with great offers by us? ';
--    COMMENT ON COLUMN PERSONS.CONTACT_BY_AFFILLIATES_FLAG IS 'Can the person be contacted with great offers by our carefully chosen partners? ';
--    COMMENT ON COLUMN PERSONS.CREATED_BY IS 'History column';
--    COMMENT ON COLUMN PERSONS.CREATION_DATE IS 'History column';
--    COMMENT ON COLUMN PERSONS.LAST_UPDATED_BY IS 'History column';
--    COMMENT ON COLUMN PERSONS.LAST_UPDATE_DATE IS 'History column';
--    COMMENT ON COLUMN PERSONS.OBJECT_VERSION_ID IS 'History column';
--    COMMENT ON TABLE PERSONS  IS 'The core person information table';
--
--   CREATE OR REPLACE TRIGGER ASSIGN_PERSON_ID BEFORE INSERT ON PERSONS
-- FOR EACH ROW
-- BEGIN
--  IF :NEW.PERSON_ID IS NULL OR :NEW.PERSON_ID < 0 THEN
--    SELECT PERSON_SEQ.NEXTVAL
--      INTO :NEW.PERSON_ID
--      FROM DUAL;
--    END IF;
-- END;
-- /
-- ALTER TRIGGER ASSIGN_PERSON_ID ENABLE;
