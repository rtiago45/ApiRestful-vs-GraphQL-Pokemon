
# 📦 Pokemon API - Spring Boot (REST + GraphQL)

Este projeto é uma aplicação desenvolvida com **Java 21 + Spring Boot**, que consome a [PokeAPI](https://pokeapi.co/) e expõe os dados dos pokémons de duas formas:

- Uma **API REST** tradicional
- Uma **API GraphQL**, moderna e flexível

O objetivo do projeto é estudar e demonstrar a **coexistência entre REST e GraphQL** dentro da mesma aplicação, aproveitando o melhor de cada abordagem para consumir dados externos.

---

## 🚀 Funcionalidade

A aplicação permite consultar **informações** de pokémons usando a [PokeAPI](https://pokeapi.co/), apenas informando o nome do pokémon.

---

## 🛠️ Tecnologias utilizadas

- Java 21
- Spring Boot 3.2.3
- Maven
- Spring Web (REST)
- Spring for GraphQL
- PokeAPI (API pública)
- Jackson (para JSON)
- Postman / Altair GraphQL Client (para testes)

---

## 📁 Estrutura de pacotes

```
src/
├── controller
│   ├── PokemonController.java         // REST
│   └── PokemonGraphQLController.java  // GraphQL
├── model
│   └── Pokemon.java
├── service
│   └── PokemonService.java
├── resources/
│   ├── application.properties
│   └── graphql/
│       └── pokemon.graphqls           // Schema GraphQL
```

---

## ▶️ Como rodar o projeto

```bash
mvn spring-boot:run
```

A aplicação estará disponível em:  
[http://localhost:8080](http://localhost:8080)

---

## 🔗 Link da API Externa

🌐 [PokeAPI - https://pokeapi.co/](https://pokeapi.co/)

---

## 📬 Exemplo de uso - API REST

### 🔹 Endpoint:
```
GET http://localhost:8080/api/pokemon/{name}
```

### 🔸 Exemplo:
```
GET http://localhost:8080/api/pokemon/pikachu
```

### 🔸 Resposta:
```json
{
  "name": "pikachu",
  "height": 4,
  "weight": 60
}
```

---

## 📬 Exemplo de uso - API GraphQL

### 🔹 Endpoint:
```
POST http://localhost:8080/graphql
```

### 🔸 Exemplo de query (1 pokémon):
```graphql
query {
  pokemon(name: "pikachu") {
    name
    height
    weight
  }
}
```

### 🔸 Exemplo de query (múltiplos pokémons):
```graphql
query {
  pokemons(names: ["pikachu", "ditto"]) {
    name
    height
    weight
  }
}
```

### 🔸 Resposta:
```json
{
  "data": {
    "pokemons": [
      {
        "name": "pikachu",
        "height": 4,
        "weight": 60
      },
      {
        "name": "ditto",
        "height": 3,
        "weight": 40
      }
    ]
  }
}
```

---

## 🧪 Testes com Postman ou Altair

- ✅ Importar a collection Postman: `pokemon-api-postman-collection.json`
- ✅ Ou usar o [Altair GraphQL Client](https://altair.sirmuel.design/) com a URL:

```
http://localhost:8080/graphql
```
