# RESTful API Dio
Java RESTful API criada para o desafio Back-end da Santander.

### Diagrama de Classes

```mermaid
classDiagram
  class User {
    - name: String
    - account: Account
    - features: List<Feature>
    - card: Card
    - news: List<News>
  }

  class Account {
    - number: String
    - agency: String
    - balance: Float
    - limit: Float
  }

  class Feature {
    - icon: String
    - description: String
  }

  class Card {
    - number: String
    - limit: Float
  }

  class News {
    - icon: String
    - description: String
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card 
  User "1" *-- "N" News

```

## Principais Tecnologias
- Java 17: Versão ultizada do Java.
- Spring Boot 3: Trabalhei com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração.
- Spring Data JPA: Ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL.
