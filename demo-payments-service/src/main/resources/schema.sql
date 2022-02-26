

  CREATE TABLE DISCOUNTS_BASE
   (	DISCOUNT_ID NUMBER(15,0) NOT NULL ,
	DISCOUNT_TYPE_CODE VARCHAR2(30 BYTE) NOT NULL ,
	DISCOUNT_AMOUNT NUMBER NOT NULL ,
	APPLY_AS_PERCENTAGE_FLAG VARCHAR2(1 BYTE) DEFAULT 'N' NOT NULL ,
	EASY_CODE VARCHAR2(20 BYTE),
	ADD_FREE_SHIPPING_FLAG VARCHAR2(1 BYTE) DEFAULT 'N' NOT NULL ,
	ONETIME_DISCOUNT_FLAG VARCHAR2(1 BYTE) DEFAULT 'Y' NOT NULL ,
	CREATED_BY VARCHAR2(60 BYTE) NOT NULL ,
	CREATION_DATE DATE NOT NULL ,
	LAST_UPDATED_BY VARCHAR2(60 BYTE) NOT NULL ,
	LAST_UPDATE_DATE DATE NOT NULL ,
	OBJECT_VERSION_ID NUMBER(15,0) NOT NULL ,
	 CONSTRAINT DISCOUNTS_PK PRIMARY KEY (DISCOUNT_ID) ,
	 CONSTRAINT DISCOUNT_AS_PERCENTAGE_CHK CHECK (APPLY_AS_PERCENTAGE_FLAG in ('Y','N')) ,
	 CONSTRAINT DISCOUNTS_FREE_SHIPPING_CHK CHECK (ADD_FREE_SHIPPING_FLAG in ('Y','N')) ,
	 CONSTRAINT DISCOUNTS_ONETIME_CHK CHECK (ONETIME_DISCOUNT_FLAG in ('Y','N'))
   )  ;

--    COMMENT ON COLUMN DISCOUNTS_BASE.DISCOUNT_ID IS 'Unique identifier for the discount';
--    COMMENT ON COLUMN DISCOUNTS_BASE.DISCOUNT_TYPE_CODE IS 'Type of discount referencing a lookup to the LOOKUP_TYPES table, domain DISCOUNT_TYPE_CODE';
--    COMMENT ON COLUMN DISCOUNTS_BASE.DISCOUNT_AMOUNT IS 'The value of the discount either as a dollar amount or as a percentage (see APPLY_AS_PERCENTAGE_FLAG) ';
--    COMMENT ON COLUMN DISCOUNTS_BASE.APPLY_AS_PERCENTAGE_FLAG IS 'Boolean flag (Y/N) to define if the DISCOUNT_AMOUNT is a percentage or an absolute value';
--    COMMENT ON COLUMN DISCOUNTS_BASE.EASY_CODE IS 'Short Code for use in marketing promos and email shots';
--    COMMENT ON COLUMN DISCOUNTS_BASE.ADD_FREE_SHIPPING_FLAG IS 'Boolean Y/N: deduct shipping cost when this flag set to Y';
--    COMMENT ON COLUMN DISCOUNTS_BASE.ONETIME_DISCOUNT_FLAG IS 'Boolean Y/N value. Can this discount only be applied once per customer?';
--    COMMENT ON COLUMN DISCOUNTS_BASE.CREATED_BY IS 'History column';
--    COMMENT ON COLUMN DISCOUNTS_BASE.CREATION_DATE IS 'History column';
--    COMMENT ON COLUMN DISCOUNTS_BASE.LAST_UPDATED_BY IS 'History column';
--    COMMENT ON COLUMN DISCOUNTS_BASE.LAST_UPDATE_DATE IS 'History column';
--    COMMENT ON COLUMN DISCOUNTS_BASE.OBJECT_VERSION_ID IS 'History column';
--    COMMENT ON TABLE DISCOUNTS_BASE  IS 'DISCOUNTS provides modifiers to an order. A particular order may have up to two discounts applied. The base discount resulting from customer membership  enrollment and a coupon discount for one-time savings';
--
--   CREATE OR REPLACE TRIGGER ASSIGN_DISCOUNT_ID BEFORE INSERT ON DISCOUNTS_BASE
-- FOR EACH ROW
-- BEGIN
--  IF :NEW.DISCOUNT_ID IS NULL OR :NEW.DISCOUNT_ID < 0 THEN
--    SELECT DISCOUNT_SEQ.NEXTVAL
--      INTO :NEW.DISCOUNT_ID
--      FROM DUAL;
--    END IF;
-- END;
-- /
-- ALTER TRIGGER ASSIGN_DISCOUNT_ID ENABLE;





  CREATE TABLE DISCOUNT_TRANSLATIONS 
   (	DISCOUNT_TRANSLATIONS_ID NUMBER(15,0) NOT NULL ,
	DISCOUNT_ID NUMBER(15,0) NOT NULL ,
	DESCRIPTION VARCHAR2(4000 BYTE) NOT NULL ,
	LANGUAGE VARCHAR2(30 BYTE) NOT NULL ,
	SOURCE_LANGUAGE VARCHAR2(15 BYTE) NOT NULL ,
	CREATED_BY VARCHAR2(60 BYTE) NOT NULL ,
	CREATION_DATE DATE NOT NULL ,
	LAST_UPDATED_BY VARCHAR2(60 BYTE) NOT NULL ,
	LAST_UPDATE_DATE DATE NOT NULL ,
	OBJECT_VERSION_ID NUMBER(15,0) NOT NULL ,
	 CONSTRAINT DISCOUNT_TRANSLATIONS_PK PRIMARY KEY (DISCOUNT_TRANSLATIONS_ID),
--   USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS
--   STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
--   PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
--   TABLESPACE USERS  ,
	 CONSTRAINT DISCOUNT_TRANSLATIONS_FK FOREIGN KEY (DISCOUNT_ID)
	  REFERENCES DISCOUNTS_BASE (DISCOUNT_ID)
   )  ;

--    COMMENT ON COLUMN DISCOUNT_TRANSLATIONS.DISCOUNT_ID IS 'Link to the base discount table';
--    COMMENT ON COLUMN DISCOUNT_TRANSLATIONS.DESCRIPTION IS 'The translated description';
--    COMMENT ON COLUMN DISCOUNT_TRANSLATIONS.LANGUAGE IS 'The language that this translation row represents ';
--    COMMENT ON COLUMN DISCOUNT_TRANSLATIONS.SOURCE_LANGUAGE IS 'The actual language that this row is in - it may not match the LANGUAGE column if the row has not actually been translated yet';
--    COMMENT ON COLUMN DISCOUNT_TRANSLATIONS.CREATED_BY IS 'History column';
--    COMMENT ON COLUMN DISCOUNT_TRANSLATIONS.CREATION_DATE IS 'History column';
--    COMMENT ON COLUMN DISCOUNT_TRANSLATIONS.LAST_UPDATED_BY IS 'History column';
--    COMMENT ON COLUMN DISCOUNT_TRANSLATIONS.LAST_UPDATE_DATE IS 'History column';
--    COMMENT ON COLUMN DISCOUNT_TRANSLATIONS.OBJECT_VERSION_ID IS 'History column';
--    COMMENT ON TABLE DISCOUNT_TRANSLATIONS  IS 'Holds translations of the discount description text';
--
--   CREATE OR REPLACE TRIGGER ASSIGN_DISCOUNT_TRANS_ID BEFORE INSERT ON DISCOUNT_TRANSLATIONS
-- FOR EACH ROW
-- BEGIN
--  IF :NEW.DISCOUNT_TRANSLATIONS_ID IS NULL OR :NEW.DISCOUNT_TRANSLATIONS_ID < 0 THEN
--    SELECT DISCOUNT_TRANSLATIONS_SEQ.NEXTVAL
--      INTO :NEW.DISCOUNT_TRANSLATIONS_ID
--      FROM DUAL;
--    END IF;
-- END;
-- /
-- ALTER TRIGGER ASSIGN_DISCOUNT_TRANS_ID ENABLE;



  CREATE TABLE COUPON_USAGES 
   (	CUSTOMER_ID NUMBER(15,0) NOT NULL ,
	DISCOUNT_ID NUMBER(15,0) NOT NULL ,
	APPLIED_DATE DATE NOT NULL ,
	ORDER_ID NUMBER(15,0) NOT NULL ,
	CREATED_BY VARCHAR2(60 BYTE) NOT NULL ,
	CREATION_DATE DATE NOT NULL ,
	LAST_UPDATED_BY VARCHAR2(60 BYTE) NOT NULL ,
	LAST_UPDATE_DATE DATE NOT NULL ,
	OBJECT_VERSION_ID NUMBER(15,0) NOT NULL ,
	 CONSTRAINT COUPON_USAGES_PK PRIMARY KEY (CUSTOMER_ID, DISCOUNT_ID) ,
	 CONSTRAINT COUPON_USAGES_DISCOUNTS_FK FOREIGN KEY (DISCOUNT_ID)
	  REFERENCES DISCOUNTS_BASE (DISCOUNT_ID)
-- 	 CONSTRAINT COUPON_USAGES_ORDERS_FK FOREIGN KEY (ORDER_ID)
-- 	  REFERENCES ORDERS (ORDER_ID) ,
-- 	 CONSTRAINT COUPON_USAGES_PERSONS_FK FOREIGN KEY (CUSTOMER_ID)
-- 	  REFERENCES PERSONS (PERSON_ID) ENABLE
   )  ;
--
--    COMMENT ON COLUMN COUPON_USAGES.CUSTOMER_ID IS 'Link to the customer using the coupon (discount)';
--    COMMENT ON COLUMN COUPON_USAGES.DISCOUNT_ID IS 'Link to the discount being applied ';
--    COMMENT ON COLUMN COUPON_USAGES.APPLIED_DATE IS 'When was the discount used';
--    COMMENT ON COLUMN COUPON_USAGES.ORDER_ID IS 'The order for which this discount was used.';
--    COMMENT ON COLUMN COUPON_USAGES.CREATED_BY IS 'History column';
--    COMMENT ON COLUMN COUPON_USAGES.CREATION_DATE IS 'History column';
--    COMMENT ON COLUMN COUPON_USAGES.LAST_UPDATED_BY IS 'History column';
--    COMMENT ON COLUMN COUPON_USAGES.LAST_UPDATE_DATE IS 'History column';
--    COMMENT ON COLUMN COUPON_USAGES.OBJECT_VERSION_ID IS 'History column';
--    COMMENT ON TABLE COUPON_USAGES  IS 'Associates the use of One-time discounts (coupons) with a particular customer.  When the customer attempts to apply a coupon to a transaction, this table will be checked to see if they have already used this coupon.';
--

  CREATE TABLE ELIGIBLE_DISCOUNTS
   (	MEMBERSHIP_ID NUMBER(15,0) NOT NULL ,
	DISCOUNT_ID NUMBER(15,0) NOT NULL ,
	VALID_FROM_DATE DATE,
	VALID_TO_DATE DATE,
	CREATED_BY VARCHAR2(60 BYTE) NOT NULL ,
	CREATION_DATE DATE NOT NULL ,
	LAST_UPDATED_BY VARCHAR2(60 BYTE) NOT NULL ,
	LAST_UPDATE_DATE DATE NOT NULL ,
	OBJECT_VERSION_ID NUMBER(15,0) NOT NULL ,
	 CONSTRAINT ELIGIBLE_DISCOUNTS_PK PRIMARY KEY (DISCOUNT_ID, MEMBERSHIP_ID) ,
	 CONSTRAINT ELIGIBLE_DISCOUNTS_FK1 FOREIGN KEY (DISCOUNT_ID)
	  REFERENCES DISCOUNTS_BASE (DISCOUNT_ID)
-- 	 CONSTRAINT ELIGIBLE_DISCOUNTS_FK FOREIGN KEY (MEMBERSHIP_ID)
-- 	  REFERENCES MEMBERSHIPS_BASE (MEMBERSHIP_ID) ENABLE
   )  ;

--    COMMENT ON COLUMN ELIGIBLE_DISCOUNTS.MEMBERSHIP_ID IS 'Link to the membership table';
--    COMMENT ON COLUMN ELIGIBLE_DISCOUNTS.DISCOUNT_ID IS 'Link to the relevant discount';
--    COMMENT ON COLUMN ELIGIBLE_DISCOUNTS.VALID_FROM_DATE IS 'If the life of the discount is restricted, this is the start date (inclusive)';
--    COMMENT ON COLUMN ELIGIBLE_DISCOUNTS.VALID_TO_DATE IS 'If the life of the discount is restricted, this is the end date (inclusive)';
--    COMMENT ON COLUMN ELIGIBLE_DISCOUNTS.CREATED_BY IS 'History column';
--    COMMENT ON COLUMN ELIGIBLE_DISCOUNTS.CREATION_DATE IS 'History column';
--    COMMENT ON COLUMN ELIGIBLE_DISCOUNTS.LAST_UPDATED_BY IS 'History column';
--    COMMENT ON COLUMN ELIGIBLE_DISCOUNTS.LAST_UPDATE_DATE IS 'History column';
--    COMMENT ON COLUMN ELIGIBLE_DISCOUNTS.OBJECT_VERSION_ID IS 'History column';
--    COMMENT ON TABLE ELIGIBLE_DISCOUNTS  IS 'Maps the available discounts to a particular membership. Note that One-Time discounts (Coupons) cannot be allocated to memberships in this way.';
--
--


  CREATE TABLE PAYMENT_OPTIONS 
   (	PAYMENT_OPTION_ID NUMBER(16,0) NOT NULL ,
	CUSTOMER_ID NUMBER(15,0) NOT NULL ,
	PAYMENT_TYPE_CODE VARCHAR2(30 BYTE) NOT NULL ,
	BILLING_ADDRESS_ID NUMBER(38,0),
	ACCOUNT_NUMBER NUMBER(19,0) NOT NULL ,
	CARD_TYPE_CODE VARCHAR2(30 BYTE), 
	EXPIRE_DATE DATE, 
	CHECK_DIGITS NUMBER(4,0), 
	ROUTING_IDENTIFIER VARCHAR2(15 BYTE), 
	INSTITUTION_NAME VARCHAR2(120 BYTE), 
	VALID_FROM_DATE DATE, 
	VALID_TO_DATE DATE, 
	CREATED_BY VARCHAR2(60 BYTE) NOT NULL ,
	CREATION_DATE DATE NOT NULL ,
	LAST_UPDATED_BY VARCHAR2(60 BYTE) NOT NULL ,
	LAST_UPDATE_DATE DATE NOT NULL ,
	OBJECT_VERSION_ID NUMBER(15,0) NOT NULL ,
	 CONSTRAINT PAYMENT_OPTIONS_PK PRIMARY KEY (PAYMENT_OPTION_ID)
-- 	 CONSTRAINT PAYMENT_OPTIONS_PERSONS_FK FOREIGN KEY (CUSTOMER_ID)
-- 	  REFERENCES PERSONS (PERSON_ID) ENABLE
   ) ;

--    COMMENT ON COLUMN PAYMENT_OPTIONS.PAYMENT_OPTION_ID IS 'Unique Id for this payment option';
--    COMMENT ON COLUMN PAYMENT_OPTIONS.CUSTOMER_ID IS 'Link to the customer';
--    COMMENT ON COLUMN PAYMENT_OPTIONS.PAYMENT_TYPE_CODE IS 'Type of payment. Links to LOOKUP_CODES with the domain PAYMENT_TYPE_CODE';
--    COMMENT ON COLUMN PAYMENT_OPTIONS.BILLING_ADDRESS_ID IS 'Billing address ID if different from the primary address of the user';
--    COMMENT ON COLUMN PAYMENT_OPTIONS.ACCOUNT_NUMBER IS 'Account number of the Credit card, bank account etc.';
--    COMMENT ON COLUMN PAYMENT_OPTIONS.CARD_TYPE_CODE IS 'If this is a credit/debit card what type is it. Links to LOOKUP_CODES using the domain CARD_TYPE_CODE ';
--    COMMENT ON COLUMN PAYMENT_OPTIONS.EXPIRE_DATE IS 'For a card payment when does this card expire. Input will be in the form of MM/YY. We will store as a date at the end of that specified month';
--    COMMENT ON COLUMN PAYMENT_OPTIONS.CHECK_DIGITS IS 'For a card payment this is the verification code that is usually on the signature strip';
--    COMMENT ON COLUMN PAYMENT_OPTIONS.ROUTING_IDENTIFIER IS 'Used when the type is direct debit. Holds the routing (sort) code of the bank';
--    COMMENT ON COLUMN PAYMENT_OPTIONS.INSTITUTION_NAME IS 'If direct Debit is used the name of the bank.';
--    COMMENT ON COLUMN PAYMENT_OPTIONS.VALID_FROM_DATE IS 'From when is this payment option valid? Will defaul to the creation date of the record, but the user may set this to the future if creating a new payment option.';
--    COMMENT ON COLUMN PAYMENT_OPTIONS.VALID_TO_DATE IS 'When was this payment option valid to ( in the case of a credit card this will be the end of the expiry month on the card)';
--    COMMENT ON COLUMN PAYMENT_OPTIONS.CREATED_BY IS 'History column';
--    COMMENT ON COLUMN PAYMENT_OPTIONS.CREATION_DATE IS 'History column';
--    COMMENT ON COLUMN PAYMENT_OPTIONS.LAST_UPDATED_BY IS 'History column';
--    COMMENT ON COLUMN PAYMENT_OPTIONS.LAST_UPDATE_DATE IS 'History column';
--    COMMENT ON COLUMN PAYMENT_OPTIONS.OBJECT_VERSION_ID IS 'History column';
--    COMMENT ON TABLE PAYMENT_OPTIONS  IS 'The list of payment types defined for this particular customer';
--
--   CREATE OR REPLACE TRIGGER ASSIGN_PAYMENT_OPTION_ID BEFORE INSERT ON PAYMENT_OPTIONS
-- FOR EACH ROW
-- BEGIN
--  IF :NEW.PAYMENT_OPTION_ID IS NULL OR :NEW.PAYMENT_OPTION_ID < 0 THEN
--    SELECT PAYMENT_OPTION_SEQ.NEXTVAL
--      INTO :NEW.PAYMENT_OPTION_ID
--      FROM DUAL;
--    END IF;
-- END;
-- /
-- ALTER TRIGGER ASSIGN_PAYMENT_OPTION_ID ENABLE;

