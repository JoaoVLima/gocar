CREATE DATABASE IF NOT EXISTS GoCar;
USE GoCar;

-- Criação das tabelas
CREATE TABLE cliente (
                         id int PRIMARY KEY,
                         cpf varchar(14),
                         nome varchar(50),
                         email varchar(50),
                         telefone varchar(50),
                         data_nasc date
);

CREATE TABLE funcionario (
                             id int PRIMARY KEY,
                             nome varchar(50),
                             cargo varchar(50),
                             data_contratacao date,
                             data_nasc date
);

CREATE TABLE orcamento (
                           id int PRIMARY KEY,
                           data date,
                           valor float,
                           fk_Carro_id int,
                           fk_Funcionario_id int
);

CREATE TABLE carro (
                       id int PRIMARY KEY,
                       marca varchar(50),
                       modelo varchar(50),
                       ano int,
                       renavam int,
                       placa varchar(7),
                       fk_Cliente_id int
);

CREATE TABLE servico (
                         id int PRIMARY KEY,
                         tipo varchar(50),
                         nome varchar(50),
                         valor float
);

CREATE TABLE itemsOrcamento (
                                fk_Servico_id int,
                                fk_Orcamento_id int
);

-- Definição das chaves estrangeiras
ALTER TABLE orcamento ADD CONSTRAINT FK_Orcamento_Carro
    FOREIGN KEY (fk_Carro_id)
        REFERENCES carro (id)
        ON DELETE RESTRICT;

ALTER TABLE orcamento ADD CONSTRAINT FK_Orcamento_Funcionario
    FOREIGN KEY (fk_Funcionario_id)
        REFERENCES funcionario (id)
        ON DELETE CASCADE;

ALTER TABLE carro ADD CONSTRAINT FK_Carro_Cliente
    FOREIGN KEY (fk_Cliente_id)
        REFERENCES cliente (id)
        ON DELETE RESTRICT;

ALTER TABLE itemsOrcamento ADD CONSTRAINT FK_ItemsOrcamento_Servico
    FOREIGN KEY (fk_Servico_id)
        REFERENCES servico (id)
        ON DELETE SET NULL;

ALTER TABLE itemsOrcamento ADD CONSTRAINT FK_ItemsOrcamento_Orcamento
    FOREIGN KEY (fk_Orcamento_id)
        REFERENCES orcamento (id)
        ON DELETE SET NULL;

-- Inserção dos registros na tabela Cliente
INSERT INTO cliente (id, cpf, nome, email, telefone, data_nasc)
VALUES
    (1, '123.456.789-01', 'João Silva', 'joao.silva@email.com', '(11) 99999-1111', '1985-07-23'),
    (2, '987.654.321-99', 'Maria Oliveira', 'maria.oliveira@email.com', '(21) 98888-2222', '1990-05-14'),
    (3, '456.789.123-33', 'Carlos Santos', 'carlos.santos@email.com', '(31) 97777-3333', '1978-02-28'),
    (4, '321.654.987-12', 'Patrícia Gomes', 'patricia.gomes@email.com', '(11) 98888-4444', '1995-09-17'),
    (5, '789.123.456-77', 'Roberto Lima', 'roberto.lima@email.com', '(21) 97777-5555', '1982-12-10'),
    (6, '159.753.486-10', 'Luciana Carvalho', 'luciana.carvalho@email.com', '(31) 96666-6666', '1991-03-08'),
    (7, '753.951.852-66', 'Guilherme Fonseca', 'guilherme.fonseca@email.com', '(41) 95555-7777', '1986-05-22'),
    (8, '963.258.741-99', 'Fernanda Souza', 'fernanda.souza@email.com', '(51) 94444-8888', '1989-07-30'),
    (9, '456.123.789-00', 'Eduardo Mendes', 'eduardo.mendes@email.com', '(61) 93333-9999', '1984-11-15'),
    (10, '741.852.963-22', 'Camila Barbosa', 'camila.barbosa@email.com', '(71) 92222-1010', '1993-01-25');

-- Inserção dos registros na tabela Funcionario
INSERT INTO funcionario (id, nome, cargo, data_contratacao, data_nasc)
VALUES
    (1, 'Ana Ferreira', 'Mecânico', '2022-01-15', '1980-11-10'),
    (2, 'Pedro Almeida', 'Atendente', '2021-03-05', '1992-04-18'),
    (3, 'Lucas Pereira', 'Gerente', '2019-06-20', '1983-08-25'),
    (4, 'Ricardo Andrade', 'Mecânico', '2022-05-01', '1984-04-14'),
    (5, 'Juliana Costa', 'Recepcionista', '2021-09-21', '1990-08-30'),
    (6, 'Marcos Silva', 'Mecânico', '2020-11-05', '1987-02-11'),
    (7, 'Sérgio Almeida', 'Supervisor', '2018-10-10', '1981-06-18'),
    (8, 'Carolina Rocha', 'Vendedora', '2022-03-14', '1993-09-02'),
    (9, 'Felipe Duarte', 'Mecânico', '2020-07-17', '1986-12-21'),
    (10, 'Rafael Moreira', 'Atendente', '2019-02-11', '1992-01-13');

-- Inserção dos registros na tabela Carro
INSERT INTO carro (id, marca, modelo, ano, renavam, placa, fk_Cliente_id)
VALUES
    (1, 'Toyota', 'Corolla', 2020, 123456789, 'BFA-9162', 1),
    (2, 'Honda', 'Civic', 2018, 987654321, 'LEQ-0230', 2),
    (3, 'Ford', 'Fusion', 2017, 456789123, 'AOB1CD2', 3),
    (4, 'Chevrolet', 'Onix', 2019, 852963741, 'DKG-4372', 4),
    (5, 'Volkswagen', 'Gol', 2016, 789456123, 'ABF-4532', 5),
    (6, 'Fiat', 'Palio', 2015, 951753456, 'CDE-7612', 6),
    (7, 'Hyundai', 'HB20', 2021, 456123789, 'ZXC-4820', 7),
    (8, 'Renault', 'Sandero', 2018, 123789456, 'GHY-2390', 8),
    (9, 'Nissan', 'Versa', 2020, 789123654, 'JUI-8492', 9),
    (10, 'Jeep', 'Renegade', 2022, 654789123, 'JKL-0157', 10);

-- Inserção dos registros na tabela Servico
INSERT INTO servico (id, tipo, nome, valor)
VALUES
    (1, 'Manutenção', 'Troca de Óleo', 200.00),
    (2, 'Reparo', 'Alinhamento e Balanceamento', 150.00),
    (3, 'Manutenção', 'Revisão Completa', 500.00),
    (4, 'Reparo', 'Troca de Pneu', 250.00),
    (5, 'Manutenção', 'Troca de Filtro de Ar', 120.00),
    (6, 'Manutenção', 'Troca de Velas', 180.00),
    (7, 'Reparo', 'Troca de Bateria', 400.00),
    (8, 'Manutenção', 'Troca de Pastilhas de Freio', 220.00),
    (9, 'Reparo', 'Conserto de Suspensão', 300.00),
    (10, 'Manutenção', 'Troca de Correia Dentada', 350.00);

-- Inserção dos registros na tabela Orcamento
INSERT INTO orcamento (id, data, valor, fk_Carro_id, fk_Funcionario_id)
VALUES
    (1, '2023-08-10', 850.00, 1, 1),
    (2, '2023-08-11', 350.00, 2, 2),
    (3, '2023-08-12', 500.00, 3, 3),
    (4, '2023-08-13', 370.00, 4, 4),
    (5, '2023-08-14', 480.00, 5, 5),
    (6, '2023-08-15', 600.00, 6, 6),
    (7, '2023-08-16', 250.00, 7, 7),
    (8, '2023-08-17', 950.00, 8, 8),
    (9, '2023-08-18', 300.00, 9, 9),
    (10, '2023-08-19', 450.00, 10, 10);

-- Inserção dos registros na tabela ItemsOrcamento
INSERT INTO itemsOrcamento (fk_Servico_id, fk_Orcamento_id)
VALUES
    (1, 1),
    (2, 1),
    (3, 2),
    (4, 3),
    (5, 4),
    (6, 5),
    (7, 6),
    (8, 7),
    (9, 8),
    (10, 9),
    (1, 10),
    (2, 4),
    (3, 5),
    (4, 6),
    (5, 7);
