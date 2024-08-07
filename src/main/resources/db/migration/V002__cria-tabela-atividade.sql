CREATE TABLE atividade (
    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    localizacao VARCHAR(60) NOT NULL,
    autor_id BIGINT NOT NULL,
    data DATETIME NOT NULL,
    max_inscricoes INT NOT NULL,
    PRIMARY KEY(id)
);

ALTER TABLE atividade
ADD CONSTRAINT fk_atividade_autor
FOREIGN KEY (autor_id) REFERENCES usuario(id);
