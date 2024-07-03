# LiterAlura

## Descrição
O projeto LiterAlura é uma aplicação Java que consome dados de uma API de livros (Gutendex) e os armazena em um banco de dados. Permite realizar operações como buscar livros por título, listar autores e livros cadastrados, entre outras funcionalidades relacionadas à gestão de livros e autores.

## Tecnologias Utilizadas
- Java 22
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- H2 Database (para ambiente de desenvolvimento)
- MySQL (pode ser configurado para outros bancos de dados)
- Maven (para gerenciamento de dependências)
- Jackson JSON (para mapeamento de objetos JSON)
- RestTemplate (para consumo de APIs REST)
- Lombok (para redução de boilerplate em classes Java)
- Tomcat Embedded (servidor web embarcado)

## Funcionalidades
- Busca de livros por título
- Listagem de livros e autores cadastrados
- Listagem de livros em determinado idioma
- Listagem dos top 5 livros mais baixados
- Listagem de livros de um autor específico
- Listagem de autores vivos em determinado ano

## Configuração
1. Clone o repositório: `git clone https://github.com/seu-usuario/LiterAlura.git`
2. Configure as propriedades do banco de dados em `application.properties` ou `application.yml`
3. Execute a aplicação usando Maven: `mvn spring-boot:run`
4. Acesse a aplicação em `http://localhost:8080`

## Pré-requisitos
- JDK 11 ou superior
- Maven 3.6.0 ou superior
- Banco de dados configurado (PostgreSQL)

## Como Usar
1. Execute a aplicação e aguarde a inicialização completa.
2. Acesse o endpoint `/swagger-ui.html` para visualizar e testar os endpoints disponíveis.
3. Utilize o menu interativo da classe `Principal` para interagir com as funcionalidades via console.

## Autores
- @Jhow-Magnum
