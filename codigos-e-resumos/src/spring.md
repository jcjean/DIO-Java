# Introdução ao Spring Framework com Spring Boot <img width='30' height='30' src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original.svg" />

O **Spring Framework** é uma das principais plataformas para o desenvolvimento de aplicações Java modernas, oferecendo suporte abrangente para injeção de dependência, programação orientada a aspectos, integração com bancos de dados, segurança, entre outros recursos.

## O que é o Spring Boot?

O **Spring Boot** é uma extensão do Spring que visa simplificar a configuração e a publicação de aplicações. Ele permite criar aplicativos Spring stand-alone (autossuficientes), prontos para produção com configurações mínimas. Um dos principais recursos do Spring Boot é o uso dos chamados **Starters**.

---

## Starters: o que são?

Os **Starters** são dependências pré-configuradas que agrupam bibliotecas comuns para funcionalidades específicas. Ao adicionar um starter no seu projeto, o Spring Boot automaticamente configura os componentes necessários para que aquela funcionalidade funcione corretamente, seguindo o princípio da "convenção sobre configuração".

Eles simplificam bastante o processo de configuração manual, reduzindo significativamente o tempo de setup de um projeto Spring.

---

## Exemplos de Starters mais utilizados

### `spring-boot-starter-data-jpa`
- Integração com bancos de dados relacionais usando **JPA** (Java Persistence API).
- Internamente utiliza o **Hibernate** como provedor de persistência padrão.
- Permite criar repositórios com poucas linhas de código usando a interface `JpaRepository`.

### `spring-boot-starter-data-mongodb`
- Suporte para integração com bancos **NoSQL MongoDB**.
- Abstrai comandos e consultas Mongo, utilizando um modelo orientado a documentos.

### `spring-boot-starter-web`
- Cria aplicações **RESTful** baseadas em HTTP.
- Inclui um **servidor embutido Tomcat**, suporte para controllers, validações e JSON via Jackson.

### `spring-boot-starter-web-services`
- Suporte para web services baseados na arquitetura **SOAP**.

### `spring-boot-starter-batch`
- Ferramentas para criação de **processos em lote** (batch processing).
- Suporte para leitura, processamento e escrita de grandes volumes de dados com controle de transações.

### `spring-boot-starter-test`
- Inclui dependências de **testes automatizados** como:
  - **JUnit** (teste unitário)
  - **Mockito** (mocking)
  - **Spring Test** (testes de integração com contexto Spring)

### `spring-boot-starter-openfeign`
- Integração com o **Feign Client**, facilitando a criação de **clientes HTTP declarativos** para consumo de APIs externas.

### `spring-boot-starter-actuator`
- Oferece endpoints prontos para **monitoramento e métricas** da aplicação.
- Ex: `/actuator/health`, `/actuator/metrics`, `/actuator/info`, entre outros.

---

## Conclusão📚

Os starters do Spring Boot tornam o desenvolvimento Java mais produtivo e menos propenso a erros de configuração. Eles encapsulam as melhores práticas do ecossistema Spring e agilizam o setup de projetos modernos para web, banco de dados, testes, monitoramento, etc.
