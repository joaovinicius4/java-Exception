# Sistema de Reservas de Hotel (Java)

Este projeto é um exercício prático em **Java** com foco em **Programação Orientada a Objetos**, **tratamento de exceções** e uso da **API moderna de datas (java.time)**.

O sistema permite criar uma reserva de hotel, exibir seus dados, calcular a duração da estadia e atualizar as datas da reserva, respeitando regras de negócio.


##  Funcionalidades

* Criar uma reserva informando:
  * Número do quarto
  * Data de check-in
  * Data de check-out
  
* Calcular automaticamente a duração da estadia (em noites)
* Atualizar as datas da reserva
* Validar regras de negócio
* Tratar erros de entrada e de datas



##  Regras de Negócio

* As datas de check-in e check-out **devem ser futuras**
* A data de check-out **deve ser posterior** à data de check-in
* Não é permitido criar ou atualizar reservas inválidas

Caso alguma regra seja violada, o sistema lança uma exceção e exibe a mensagem de erro apropriada.



##  Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* `LocalDate`, `DateTimeFormatter`, `ChronoUnit`
* Tratamento de exceções (`try/catch`)

---

##  Estrutura do Projeto

```
src/
 ├── application/
 │    └── Programa.java
 └── model/
      └── entities/
           └── Reserva.java
```

* **application**: responsável pela interação com o usuário e tratamento das exceções
* **model.entities**: contém a entidade `Reserva`, responsável pelas regras de negócio



##  Como Executar

1. Compile o projeto
2. Execute a classe `Programa`
3. Informe os dados solicitados no console

Exemplo de entrada:

```
Numero do quarto: 305
Data de check-in (dd/MM/yyyy): 20/02/2026
Data de check-out (dd/MM/yyyy): 25/02/2026
```

##  Conceitos Aplicados

* Encapsulamento
* Entidade rica (regras dentro da classe)
* Validação de dados
* Exceções de regra de negócio (`IllegalArgumentException`)
* Separação de responsabilidades

##  Autor
João Vinícius Gonzaga Ruas

*Projeto desenvolvido para fins de aprendizado em Java.*
