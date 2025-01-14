CREATE TABLE enderecos (
    id BIGINT NOT NULL AUTO_INCREMENT,
    cep VARCHAR(8) NOT NULL,
    logradouro VARCHAR(255) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    bairro VARCHAR(100) NOT NULL,
    estado VARCHAR(2) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE colaboradores (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    cargo VARCHAR(100) NOT NULL,
    endereco_id BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (endereco_id) REFERENCES enderecos(id)
);