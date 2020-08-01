# dontrucker-ms
Microservice of DonTrucker

Oferece as APIs necessárias para o funcionamento do aplicativo DonTrucker.

A QUEM SE DESTINA / OBJETIVO
Este projeto contém os Microservices utilizados no app DonTrucker, mantido pela sua equipe de desenvolvimento com o intuito de facilitar a compreenção das APIs.

INSTALAÇÃO LOCAL
• Tenha o docker instalado em sua máquina;
• Em seu servidor local baixe o projeto usando git clone;
• Digite: composer install para instalar as bibliotecas, ou faça este processo pela iterface da sua IDE; 

CONVENÇÕES
Convenções adotadas no ambiente de trabalho para o projeto DonTrucker:

• Regra para nome de microservices e pacotes, devem sempre começar com dt-, precedido pela sua função e finalizados com -service. ex: dt-user-service;
• Os containers do docker devem ter o mesmo nome dos Microservices que ficarão armazenados nele;
• As portas dos Microservices devem estar em uma faixa fora das normalmente utilizados por serviços padrões de sitemas operacionais por exemplo, os Microservices relativos a configuração começam com 81(ex: 8100), já os relativas ao contexto da aplicação com 82(ex:8201); 

BIBLIOTECAS DO PROJETO
• Spring Boot Starter estrutura que facilita a configuração do projeto;
• Netflix Eureka Cliente/Server, um serviço REST (Representational State Transfer) utilizado para localizar os Microservices e fazer balanceamento de carga;
• Lombok uma biblioteca para agilizar a criação de Construtores, Getters e Setters, entre outros;
• Netflix Zull utilizado no gateway do projeto, 

BANCO DE DADOS
Mongo DB, optamos por utilizar um banco NoSQL por suas facilidades e por futuros implementos que o sistema possa vir a ter.
