-- Table: accounts

-- DROP TABLE accounts;

CREATE TABLE accounts
(
  id serial NOT NULL,
  username character varying(100) NOT NULL,
  email character varying(255) NOT NULL,
  password character varying(255) NOT NULL,
  CONSTRAINT accounts_pkey PRIMARY KEY (id )
)
WITH (
  OIDS=FALSE
);
ALTER TABLE accounts
  OWNER TO learningspring;
