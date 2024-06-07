# Projeto Kafka Application
Este projeto é uma aplicação simples que utiliza o Apache Kafka para enviar mensagens.

## Como usar
A aplicação expõe um endpoint REST para enviar mensagens para o Kafka.

## Enviar uma mensagem
Para enviar uma mensagem, faça uma solicitação GET para o seguinte endpoint:
```
GET /kafka/send/{message}
```

Substitua {message} pela mensagem que você deseja enviar. A aplicação retornará uma resposta no formato "Enviado: {message}".

## Dependências
Este projeto depende do Apache Kafka e do Spring Boot.

## Como executar
Para executar a aplicação, use o seguinte comando:
```
./mvnw spring-boot:run
```

Certifique-se de que o Apache Kafka esteja em execução antes de iniciar a aplicação.

## Contribuindo
Contribuições são bem-vindas. Por favor, abra um issue ou pull request para contribuir.
