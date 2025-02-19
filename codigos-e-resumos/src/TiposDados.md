## Tipos de variáveis

- byte idade = 111;
- short ano = 2024;
- int cep = 49000000;      //talvez altere o tipo caso comece com zero
- long cpf = 12345678912L;  //talvez altere o tipo caso comece com zero
- float pi = 3.14f;
- double salario = 1600.50;
- String nome = "Jean";
- char sexo = 'M';  //utiliza-se aspas simples para definir o caracter

Também é possivel um numero _int_ receber um _short_, mas não o contrário. A não ser que utilize um cast, como por exemplo:

Este caso acusará erro:
```
short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numeroNormal;
```
Este caso não:
```
short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = (short) numeroNormal;
```

Em java também é possivel declarar as constantes que são variaveis que não podem ser alteradas após serem definidas.
Para declarar uma constante, utilizamos a palavra reservada _final_ antes do identificador. Por exemplo:

```
//por convenção escrevemos os nomes das constantes em caixa alta.

final double VALOR_DE_PI = 3.14;    //ao definir uma constante com o "final", garante que o valor seja imutável.
VALOR_DE_PI = 10;   //por isso esta linha acusará erro.
```
No java também temos a classe _Date_ que permite obter a data e hora atuais do sistema e armazená-las no objeto. Por exemplo:
```
Date diaAtual = new Date();
System.out.println("Dia de hoje: " +diaAtual);

Saída:
Dia de hoje: Fri Aug 30 18:19:30 BRT 2024
```