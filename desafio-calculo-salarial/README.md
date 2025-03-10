# Desafio - Cálculo Salarial

Este programa em Java recebe o salário bruto de um funcionário e os benefícios adicionais, calcula o imposto devido com base na faixa salarial e exibe o salário final após os descontos.

## Como funciona
1. O usuário insere dois valores:
   - **Salário bruto**
   - **Benefícios**
2. O programa calcula o imposto de acordo com as seguintes faixas:
   - Até R$ 1100,00: 5%
   - De R$ 1100,01 a R$ 2500,00: 10%
   - Acima de R$ 2500,00: 15%
3. O salário final é calculado subtraindo o imposto e adicionando os benefícios.
4. O resultado é exibido formatado com duas casas decimais.

## Como executar

Compile e execute o código em um ambiente Java:
```sh
javac Desafio.java
java Desafio
```

Insira os valores conforme solicitado para visualizar o resultado.

## Exemplo de Entrada e Saída
**Entrada:**
```
2000.00
500.00
```

**Saída:**
```
O salário do funcionario é: R$2300.00
```
