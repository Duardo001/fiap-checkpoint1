# CHECKPOINT 1

Uma aplicação Java com container para validação de aprendizagem do uso do Docker

## Pré-requisitos

Java 17+
- Docker
- Acesso a internet
- Acesso ao Docker Hub

## Executando a Aplicação com Docker

### Perfis Disponíveis

- **dev**: Para acessar o ambiente de desenvolvimento.
- **stg**: Para acessar o ambiente de staging.
- **prd**: Para acessar o ambiente de produção.

### Comandos Docker

Para executar a aplicação, siga os comandos abaixo:

#### Perfil dev

```bash
docker run -e "SPRING_PROFILES_ACTIVE=dev" -p 8080:8080 nome_do_usuario/fiap-checkpoint1:latest
```
#### Perfil stg

```bash
docker run -e "SPRING_PROFILES_ACTIVE=stg" -p 8080:8080 nome_do_usuario/fiap-checkpoint1:latest

```
#### Perfil prd

```bash
docker run -e "SPRING_PROFILES_ACTIVE=prd" -p 8080:8080 nome_do_usuario/fiap-checkpoint1:latest
```