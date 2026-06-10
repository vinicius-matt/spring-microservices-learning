# Microservices Study

Projeto de estudos sobre arquitetura de microserviços utilizando Java e Spring Boot.

## Arquitetura

### Product Service

Responsável pelo cadastro e consulta de produtos.

### Order Service

Responsável pelo cadastro de pedidos e validação de produtos através da comunicação com o Product Service.

## Tecnologias

* Java 21
* Spring Boot 3
* Spring Data JPA
* H2 Database
* RestTemplate
* Maven

## Funcionalidades

* Cadastro de produtos
* Consulta de produtos
* Cadastro de pedidos
* Validação de produto antes da criação do pedido
* Comunicação entre microserviços via HTTP
* Agregação de dados entre serviços

## Próximos passos

* Tratamento global de exceções
* Bean Validation
* PostgreSQL
* Docker
* RabbitMQ
* API Gateway
