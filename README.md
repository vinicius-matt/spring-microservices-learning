# Spring Microservices Learning

Projeto de estudos desenvolvido para aprender arquitetura de microserviços utilizando Java e Spring Boot.

## Arquitetura

```text
Product Service
       ↑
       │ HTTP
       ↓
Order Service
```

## Microserviços

### Product Service

Responsável por:

* Cadastro de produtos
* Consulta de produtos
* Busca por ID

### Order Service

Responsável por:

* Cadastro de pedidos
* Consulta de pedidos
* Validação de produtos antes da criação do pedido
* Comunicação com Product Service

## Tecnologias

* Java 21
* Spring Boot 3
* Spring Data JPA
* H2 Database
* RestTemplate
* Maven

## Funcionalidades implementadas

* CRUD de produtos
* CRUD de pedidos
* Comunicação entre microserviços via HTTP
* Validação de produto antes da criação do pedido
* Endpoint de agregação de dados entre serviços

## Próximos passos

* Global Exception Handler
* Bean Validation
* PostgreSQL
* Docker
* RabbitMQ
* API Gateway
* Service Discovery

```
```
