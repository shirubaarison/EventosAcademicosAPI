CREATE TABLE usuario (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(60) NOT NULL,
    cpf VARCHAR(30) NOT NULL,
    instituicao VARCHAR(60) NOT NULL,
    email VARCHAR(60) NOT NULL,
    PRIMARY KEY(id)
);

ALTER TABLE usuario ADD CONSTRAINT uk_usuario_cpf UNIQUE (cpf);
ALTER TABLE usuario ADD CONSTRAINT uk_email UNIQUE (email);
