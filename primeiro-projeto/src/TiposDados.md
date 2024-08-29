## Tipos de variáveis

- byte idade = 111;
- short ano = 2024;
- int cep = 49000000;      //talvez altere o tipo caso comece com zero
- long cpf = 12345678912L;  //talvez altere o tipo caso comece com zero
- float pi = 3.14f;
- double salario = 1600.50;

**Também é possivel um numero _int_ receber um _short_, mas não o contrário. A não ser que utilize um cast, como por exemplo:**

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

**Em java também é possivel declarar as constantes que são variaveis que não podem ser alteradas após serem definidas.
Para declarar uma constante, utilizamos a palavra reservada _final_ antes do identificador. Por exemplo:**

```
final double VALOR_DE_PI = 3.14;    //por convenção escrevemos os nomes das constantes em caixa alta.
VALOR_DE_PI = 10;   //ao definir uma constante com o "final", garante que o valor seja imutável (por isso esta linha acusará erro.)
```