# Desafio de controle de fluxo - Bootcamp Bradesco - Java Cloud Native

## Descrição
Este projeto faz parte do desafio de controle de fluxo. Ele consiste em um programa Java que solicita dois números ao usuário e imprime uma sequência numérica, garantindo que o segundo número seja maior que o primeiro. Caso contrário, uma exceção personalizada é lançada.

## Como Executar o Projeto
1. Clone este repositório:
   ```sh
   git clone <URL_DO_REPOSITORIO>
   ```
2. Acesse a pasta do projeto:
   ```sh
   cd <NOME_DA_PASTA>
   ```
3. Compile o código:
   ```sh
   javac Contador.java
   ```
4. Execute o programa:
   ```sh
   java Contador
   ```
5. Insira dois números conforme solicitado pelo programa.

## Regras de Negócio
- O primeiro número (parâmetro1) deve ser menor que o segundo número (parâmetro2).
- Se essa condição for atendida, o programa imprime uma sequência de números de 0 até (parametro2 - parametro1 - 1).
- Caso contrário, uma exceção personalizada `ParametrosInvalidosException` é lançada, informando que o segundo parâmetro deve ser maior que o primeiro.

## Exemplo de Entrada e Saída
**Entrada:**
```
Digite o primeiro parametro:
3
Digite o segundo parametro:
7
```

**Saída:**
```
Imprimindo o número 0
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
```