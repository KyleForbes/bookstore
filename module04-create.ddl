CREATE TABLE CD (ID BIGINT NOT NULL, DESCRIPTION VARCHAR(3000), GENRE VARCHAR(255), TITLE VARCHAR(100), total_duration FLOAT, unit_cost FLOAT, PRIMARY KEY (ID))
CREATE TABLE MUSICIAN (ID BIGINT NOT NULL, BIO VARCHAR(5000), date_of_birth DATE, first_name VARCHAR(50), last_name VARCHAR(50), preferred_instrument VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE ITEM (ID BIGINT NOT NULL, DESCRIPTION VARCHAR(3000), TITLE VARCHAR(100), unit_cost FLOAT, PRIMARY KEY (ID))
CREATE TABLE CD_MUSICIAN (CD_ID BIGINT NOT NULL, musicians_ID BIGINT NOT NULL, PRIMARY KEY (CD_ID, musicians_ID))
ALTER TABLE CD_MUSICIAN ADD CONSTRAINT CD_MUSICIAN_CD_ID FOREIGN KEY (CD_ID) REFERENCES CD (ID)
ALTER TABLE CD_MUSICIAN ADD CONSTRAINT CDMSICIANmsciansID FOREIGN KEY (musicians_ID) REFERENCES MUSICIAN (ID)
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(15), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)
