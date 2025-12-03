🏪 Sistema de Loja – Aplicação Java (Console)

Este projeto é uma aplicação simples em Java, desenvolvida no console, utilizando os conceitos fundamentais de Programação Orientada a Objetos (POO) e tratamento básico de exceções com try/catch.
Foi elaborado para fins acadêmicos, atendendo a todos os requisitos do trabalho proposto.

🧱 Estrutura do Projeto (5 Classes)

O sistema contém 5 classes, todas com funções simples e adequadas ao nível de aprendizado do 2º período:

✔ Produto

Representa um produto da loja com nome, preço e status (vendido / disponível).

✔ Cliente

Representa o cliente que realiza uma compra.

✔ Pedido

Registra uma compra feita por um cliente, associando cliente + produto.

✔ Loja

Classe de controle da aplicação.
Gerencia:

lista de produtos

lista de pedidos

cadastro de produtos

processo de compra

✔ Aplicacao (main)

Contém o menu interativo no console e toda a navegação do usuário.

🖥️ Funcionalidades do Sistema

O menu permite:

Cadastrar Produto

Validação para impedir preço negativo.

Listar Produtos

Exibe todos os produtos e seu status.

Comprar Produto

Impede comprar algo já vendido.

Registra um pedido.

Listar Pedidos

Mostra quem comprou o quê.

Sair

⚠️ Tratamento de Erros

O programa utiliza 3 blocos diferentes de try/catch, conforme exigido:

Tratamento da escolha do menu

Tratamento ao cadastrar produto

Tratamento ao comprar um produto

Esses blocos evitam erros como entrada inválida do usuário (ex.: letras ao invés de números).

🧩 Conceitos de POO Utilizados

Encapsulamento (atributos privados, getters e métodos de controle)

Composição:

Loja contém Produtos

Loja contém Pedidos

Pedido contém Cliente + Produto

Objetos representando elementos do mundo real

Classe principal (main) controlando fluxo
