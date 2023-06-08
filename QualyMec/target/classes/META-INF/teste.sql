-- Criação da tabela

--Tabela cadastro usuario 1
CREATE TABLE T_GS_CAD_USUARIO (
  id_usuario NUMERIC(6) PRIMARY KEY,
  nm_completo VARCHAR(100) NOT NULL,
  ds_email VARCHAR(150) NOT NULL,
  ds_senha VARCHAR(40) NOT NULL,
  dt_nasc DATE NOT NULL,
  nr_telefone VARCHAR(16) NOT NULL
);

--Tabela cadastro ONG 2
CREATE TABLE T_GS_CADASTRO_ONG (
  id_ong NUMERIC(6) PRIMARY KEY,
  nm_organizacao VARCHAR(200) NOT NULL,
  ds_email_respon VARCHAR(150) NOT NULL,
  ds_senha VARCHAR(150) NOT NULL,
  nr_tel_respon VARCHAR(16) NOT NULL,
  sg_estado CHAR(2) NOT NULL,
  nm_cidade VARCHAR(50) NOT NULL,
  ds_endereco VARCHAR(150) NOT NULL,
  tp_doc CHAR(4) NOT NULL,
  nr_doc NUMERIC(14) NOT NULL
);

--Tabela cadastro alimento que foi doado 3
CREATE TABLE T_GS_CAD_ALIMENTO (
  id_cad_alimento NUMERIC(10) PRIMARY KEY,
  nm_alimento VARCHAR(100) NOT NULL,
  dt_fabricacao DATE NOT NULL,
  dt_validade DATE NOT NULL,
  qtd_alimento NUMERIC(4) NOT NULL
  
);

--tabela cadastro da solicitaçao 4
CREATE TABLE T_GS_CAD_SOLICITACAO (
  id_solicitacao NUMERIC(8) PRIMARY KEY,
  nm_organizacao VARCHAR(200) NOT NULL,
  ds_necessidade TEXT NOT NULL,
  qtd_necessidade TEXT NOT NULL
);

--tabela controle da doaçao 5
CREATE TABLE T_GS_CONTROLE_DOACAO (
  st_entrega CHAR(14) NOT NULL,
  qtd_arrecadada NUMERIC(6) NOT NULL,
  nr_contribuente NUMERIC(2) NOT NULL
);

--tabela historico da solicitacao 6
CREATE TABLE T_GS_HIST_SOLICITACAO (
  id_historico NUMERIC(6) PRIMARY KEY,
  nm_organizacao VARCHAR(150) NOT NULL,
  sg_estado_orig CHAR(2) NOT NULL,
  nm_cidade_orig VARCHAR(50) NOT NULL,
  ds_endereco_orig VARCHAR(250) NOT NULL,
  sg_estado_dest CHAR(2) NOT NULL,
  nm_cidade_dest VARCHAR(50) NOT NULL,
  ds_endereco_dest VARCHAR(100) NOT NULL,
  nm_alimento TEXT NOT NULL,
  qtd_alimento NUMERIC(6) NOT NULL,
  st_entrega VARCHAR(20) NOT NULL
);

commit;

-- Inserção dos dados na tabela 

-- TABELA CADASTRO USUARIO 
INSERT INTO T_GS_CAD_USUARIO (id_usuario, nm_completo, ds_email, ds_senha, dt_nasc, nr_telefone)
VALUES (1, 'Marcos Silva', 'marcos.silva@example.com', 'senha123', TO_DATE('1980-01-01', 'YYYY-MM-DD'), '1234567890');

INSERT INTO T_GS_CAD_USUARIO (id_usuario, nm_completo, ds_email, ds_senha, dt_nasc, nr_telefone)
VALUES (2, 'Ana Oliveira', 'ana.oliveira@example.com', 'senha123', TO_DATE('1985-02-02', 'YYYY-MM-DD'), '2345678901');

INSERT INTO T_GS_CAD_USUARIO (id_usuario, nm_completo, ds_email, ds_senha, dt_nasc, nr_telefone)
VALUES (3, 'Roberto Santos', 'roberto.santos@example.com', 'senha123', TO_DATE('1990-03-03', 'YYYY-MM-DD'), '3456789012');

INSERT INTO T_GS_CAD_USUARIO (id_usuario, nm_completo, ds_email, ds_senha, dt_nasc, nr_telefone)
VALUES (4, 'Juliana Costa', 'juliana.costa@example.com', 'senha123', TO_DATE('1995-04-04', 'YYYY-MM-DD'), '4567890123');

INSERT INTO T_GS_CAD_USUARIO (id_usuario, nm_completo, ds_email, ds_senha, dt_nasc, nr_telefone)
VALUES (5, 'Paulo Souza', 'paulo.souza@example.com', 'senha123', TO_DATE('2000-05-05', 'YYYY-MM-DD'), '5678901234');


--TABELA CADASTRO ONG
INSERT INTO T_GS_CADASTRO_ONG (id_ong, nm_organizacao, ds_email_respon, ds_senha, nr_tel_respon, sg_estado, nm_cidade, ds_endereco, tp_doc, nr_doc)
VALUES (1, 'Organização 1', 'organizacao1@example.com', 'senha123', '1234567890', 'SP', 'São Paulo', 'Rua A, 1', 'CNPJ', 12345678901234);

INSERT INTO T_GS_CADASTRO_ONG (id_ong, nm_organizacao, ds_email_respon, ds_senha, nr_tel_respon, sg_estado, nm_cidade, ds_endereco, tp_doc, nr_doc)
VALUES (2, 'Organização 2', 'organizacao2@example.com', 'senha123', '2345678901', 'RJ', 'Rio de Janeiro', 'Rua B, 2', 'CNPJ', 23456789012345);

INSERT INTO T_GS_CADASTRO_ONG (id_ong, nm_organizacao, ds_email_respon, ds_senha, nr_tel_respon, sg_estado, nm_cidade, ds_endereco, tp_doc, nr_doc)
VALUES (3, 'Organização 3', 'organizacao3@example.com', 'senha123', '3456789012', 'MG', 'Belo Horizonte', 'Rua C, 3', 'CNPJ', 34567890123456);

INSERT INTO T_GS_CADASTRO_ONG (id_ong, nm_organizacao, ds_email_respon, ds_senha, nr_tel_respon, sg_estado, nm_cidade, ds_endereco, tp_doc, nr_doc)
VALUES (4, 'Organização 4', 'organizacao4@example.com', 'senha123', '4567890123', 'ES', 'Vitória', 'Rua D, 4', 'CNPJ', 45678901234567);

INSERT INTO T_GS_CADASTRO_ONG (id_ong, nm_organizacao, ds_email_respon, ds_senha, nr_tel_respon, sg_estado, nm_cidade, ds_endereco, tp_doc, nr_doc)
VALUES (5, 'Organização 5', 'organizacao5@example.com', 'senha123', '5678901234', 'BA', 'Salvador', 'Rua E, 5', 'CNPJ', 56789012345678);

INSERT INTO T_GS_CADASTRO_ONG (id_ong, nm_organizacao, ds_email_respon, ds_senha, nr_tel_respon, sg_estado, nm_cidade, ds_endereco, tp_doc, nr_doc)
VALUES (6, 'Organização 6', 'organizacao6@example.com', 'senha123', '6789012345', 'RS', 'Porto Alegre', 'Rua F, 6', 'CNPJ', 67890123456789);

INSERT INTO T_GS_CADASTRO_ONG (id_ong, nm_organizacao, ds_email_respon, ds_senha, nr_tel_respon, sg_estado, nm_cidade, ds_endereco, tp_doc, nr_doc)
VALUES (7, 'Organização 7', 'organizacao7@example.com', 'senha123', '7890123456', 'PR', 'Curitiba', 'Rua G, 7', 'CNPJ', 78901234567890);

INSERT INTO T_GS_CADASTRO_ONG (id_ong, nm_organizacao, ds_email_respon, ds_senha, nr_tel_respon, sg_estado, nm_cidade, ds_endereco, tp_doc, nr_doc)
VALUES (8, 'Organização 8', 'organizacao8@example.com', 'senha123', '8901234567', 'SC', 'Florianópolis', 'Rua H, 8', 'CNPJ', 89012345678901);

INSERT INTO T_GS_CADASTRO_ONG (id_ong, nm_organizacao, ds_email_respon, ds_senha, nr_tel_respon, sg_estado, nm_cidade, ds_endereco, tp_doc, nr_doc)
VALUES (9, 'Organização 9', 'organizacao9@example.com', 'senha123', '9012345678', 'GO', 'Goiânia', 'Rua I, 9', 'CNPJ', 90123456789012);

INSERT INTO T_GS_CADASTRO_ONG (id_ong, nm_organizacao, ds_email_respon, ds_senha, nr_tel_respon, sg_estado, nm_cidade, ds_endereco, tp_doc, nr_doc)
VALUES (10, 'Organização 10', 'organizacao10@example.com', 'senha123', '0123456789', 'PE', 'Recife', 'Rua J, 10', 'CNPJ', 10234567890123);


--TABELA CADASTRO ALIMENTO
INSERT INTO T_GS_CAD_ALIMENTO (id_cad_alimento, nm_alimento, dt_fabricacao, dt_validade, qtd_alimento) 
VALUES (1, 'Arroz', TO_DATE('2023-01-01', 'YYYY-MM-DD'), TO_DATE('2024-01-01', 'YYYY-MM-DD'), 500);

INSERT INTO T_GS_CAD_ALIMENTO (id_cad_alimento, nm_alimento, dt_fabricacao, dt_validade, qtd_alimento) 
VALUES (2, 'Feijão', TO_DATE('2023-02-02', 'YYYY-MM-DD'), TO_DATE('2024-02-02', 'YYYY-MM-DD'), 300);

INSERT INTO T_GS_CAD_ALIMENTO (id_cad_alimento, nm_alimento, dt_fabricacao, dt_validade, qtd_alimento) 
VALUES (3, 'Macarrão', TO_DATE('2023-03-03', 'YYYY-MM-DD'), TO_DATE('2024-03-03', 'YYYY-MM-DD'), 200);

INSERT INTO T_GS_CAD_ALIMENTO (id_cad_alimento, nm_alimento, dt_fabricacao, dt_validade, qtd_alimento) 
VALUES (4, 'Leite', TO_DATE('2023-04-04', 'YYYY-MM-DD'), TO_DATE('2024-04-04', 'YYYY-MM-DD'), 400);

INSERT INTO T_GS_CAD_ALIMENTO (id_cad_alimento, nm_alimento, dt_fabricacao, dt_validade, qtd_alimento) 
VALUES (5, 'Óleo', TO_DATE('2023-05-05', 'YYYY-MM-DD'), TO_DATE('2024-05-05', 'YYYY-MM-DD'), 150);


--TABELA CADASTRO SOLICITAÇAO
INSERT INTO T_GS_CAD_SOLICITACAO (id_solicitacao, nm_organizacao, ds_necessidade, qtd_necessidade, dt_solicitacao) 
VALUES (2, 'Organização 2', 'Necessidade de legumes', '300kg', TO_DATE('02-JUN-23', 'DD-MON-YY'));

INSERT INTO T_GS_CAD_SOLICITACAO (id_solicitacao, nm_organizacao, ds_necessidade, qtd_necessidade, dt_solicitacao) 
VALUES (3, 'Organização 3', 'Necessidade de frutas', '200kg', TO_DATE('03-JUN-23', 'DD-MON-YY'));

INSERT INTO T_GS_CAD_SOLICITACAO (id_solicitacao, nm_organizacao, ds_necessidade, qtd_necessidade, dt_solicitacao) 
VALUES (4, 'Organização 4', 'Necessidade de leite', '1000L', TO_DATE('04-JUN-23', 'DD-MON-YY'));

INSERT INTO T_GS_CAD_SOLICITACAO (id_solicitacao, nm_organizacao, ds_necessidade, qtd_necessidade, dt_solicitacao) 
VALUES (5, 'Organização 5', 'Necessidade de carnes', '500kg', TO_DATE('05-JUN-23', 'DD-MON-YY'));

INSERT INTO T_GS_CAD_SOLICITACAO (id_solicitacao, nm_organizacao, ds_necessidade, qtd_necessidade, dt_solicitacao) 
VALUES (6, 'Organização 6', 'Necessidade de ovos', '1000 unid.', TO_DATE('06-JUN-23', 'DD-MON-YY'));


--tabela controle da doaçao
INSERT INTO T_GS_CONTROLE_DOACAO (st_entrega, qtd_arrecadada, nr_contribuente) 
VALUES ('Entregue', 1000, 10);

INSERT INTO T_GS_CONTROLE_DOACAO (st_entrega, qtd_arrecadada, nr_contribuente) 
VALUES ('Pendente', 1500, 15);

INSERT INTO T_GS_CONTROLE_DOACAO (st_entrega, qtd_arrecadada, nr_contribuente) 
VALUES ('Entregue', 2000, 20);

INSERT INTO T_GS_CONTROLE_DOACAO (st_entrega, qtd_arrecadada, nr_contribuente) 
VALUES ('Pendente', 2500, 25);

INSERT INTO T_GS_CONTROLE_DOACAO (st_entrega, qtd_arrecadada, nr_contribuente) 
VALUES ('Entregue', 3000, 30);

--TABELA HISTORICO DA SOLICITAÇAO
INSERT INTO T_GS_HIST_SOLICITACAO (id_historico, nm_organizacao, sg_estado_orig, nm_cidade_orig, ds_endereco_orig, sg_estado_dest, nm_cidade_dest, ds_endereco_dest, nm_alimento, qtd_alimento, st_entrega) 
VALUES (1, 'Organização 1', 'SP', 'São Paulo', 'Rua das Palmeiras, 100', 'RJ', 'Rio de Janeiro', 'Rua das Orquídeas, 200', 'Arroz', 500, 'Entregue');

INSERT INTO T_GS_HIST_SOLICITACAO (id_historico, nm_organizacao, sg_estado_orig, nm_cidade_orig, ds_endereco_orig, sg_estado_dest, nm_cidade_dest, ds_endereco_dest, nm_alimento, qtd_alimento, st_entrega) 
VALUES (2, 'Organização 2', 'RJ', 'Rio de Janeiro', 'Avenida das Flores, 250', 'MG', 'Belo Horizonte', 'Rua das Margaridas, 150', 'Feijão', 400, 'Pendente');

INSERT INTO T_GS_HIST_SOLICITACAO (id_historico, nm_organizacao, sg_estado_orig, nm_cidade_orig, ds_endereco_orig, sg_estado_dest, nm_cidade_dest, ds_endereco_dest, nm_alimento, qtd_alimento, st_entrega) 
VALUES (3, 'Organização 3', 'MG', 'Belo Horizonte', 'Praça das Rosas, 300', 'SP', 'São Paulo', 'Alameda das Tulipas, 120', 'Macarrão', 350, 'Entregue');

INSERT INTO T_GS_HIST_SOLICITACAO (id_historico, nm_organizacao, sg_estado_orig, nm_cidade_orig, ds_endereco_orig, sg_estado_dest, nm_cidade_dest, ds_endereco_dest, nm_alimento, qtd_alimento, st_entrega) 
VALUES (4, 'Organização 4', 'SP', 'São Paulo', 'Travessa dos Crisântemos, 400', 'RJ', 'Rio de Janeiro', 'Beco dos Jasmins, 80', 'Óleo', 200, 'Pendente');

INSERT INTO T_GS_HIST_SOLICITACAO (id_historico, nm_organizacao, sg_estado_orig, nm_cidade_orig, ds_endereco_orig, sg_estado_dest, nm_cidade_dest, ds_endereco_dest, nm_alimento, qtd_alimento, st_entrega) 
VALUES (5, 'Organização 5', 'RJ', 'Rio de Janeiro', 'Largo das Violetas, 500', 'MG', 'Belo Horizonte', 'Avenida dos Lírios, 60', 'Açúcar', 600, 'Entregue');



sysdate() MySQL
sysdate Oracle