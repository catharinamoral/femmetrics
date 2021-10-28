CREATE TABLE IF NOT EXISTS FORNECEDOR (
       	IDT INTEGER  PRIMARY KEY AUTO_INCREMENT,
        CATEGORIA varchar(255),
        CNPJ varchar(255),
        EMAIL varchar(255),
        ID_FORNECEDOR varchar(255),
        NOME_FANTASIA varchar(255),
        QTD_FUNCIONARIOS integer,
        RAZAO_SOCIAL varchar(255),
        TELEFONE varchar(255),
        ULTIMA_COMPRA timestamp,
		SITUACAO varchar(3)
);


CREATE TABLE IF NOT EXISTS DOCUMENTOS (
       	IDT INTEGER  PRIMARY KEY AUTO_INCREMENT,
        ID_FORNECEDOR varchar(255),
        FICHA_CADASTRAL boolean,
		CADASTRO_SOCIAL boolean,
		SINTEGRA        boolean,
		CONTA_BANCARIA  boolean
);