# Estruturas excepcionais

## ⚠ Exceções

Ao executar um código Java, diferentes erros podem acontecer: erros de codificação, erros devido a entrada errada ou outros imprevistos.
Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: Java lançará uma **exceção**.

De forma interpretativa em Java, um erro é algo irreperável, a aplicação trava ou é encerrada drasticamente. Já exceções é um fluxo inesperado da nossa aplicação, exemplo: querer dividir por zero, abrir um arquivo que não existe, etc.
Todos estes cenários não so erros mas sim fluxos não previstos pela aplicação.

É aí que entra mais uma responsabilidade do desenvolvedor, prever situações iguais a estas e realizar o que denominamos **tratamento de exceções**.

### 👨‍💻 Exemplo:

```java
import java.util.Scanner;

public class SobreMim{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scan.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scan.next();

        System.out.println("Digite sua idade");
        int idade = scan.nextInt();
        
        System.out.println("Digite sua altura (em cm)");
        int altura = scan.nextInt();

        System.out.println("Ola, meu nome é "+nome+" "+sobrenome);
        System.out.println("Tenho "+idade+" anos e "+altura+"cm de altura.");

        scan.close();
    }
}
```

Aparentemente é um programa simples, mas aqui está algumas possiveis exceções que podem acontecer:
- Não informar o nome e sobrenome
- O valor da idade ter um caractere não numerico
- O valor da altura tem uma vírgula ou ponto (variando dependendo do padrão de linguagem)

Executando o programa com os valores abaixo, vamos entender qual exceção acontecerá:

| Entrada               | Valor           | Exceção                          | Causa                                                                                        |
| --------------------- | --------------- | -------------------------------- | -------------------------------------------------------------------------------------------- |
| Digite seu nome:      | **Jean**     |                                  |                                                                                              |
| Digite seu sobrenome: | **Charles**     |                                  |                                                                                              |
| Digite sua idade:     | **vinte (20)** | java.util.InputMismatchException | O programa esperava o valor do tipo numérico  inteiro.                                       |
| Digite sua altura (em cm):    | **1,85**        | java.util.InputMismatchException | O programa esperava o valor do tipo numérico inteiro, exemplo: **185** |

## Conhecendo algumas exceções já mapeadas

A linguagem Java dispõe de uma vasta lista de classes que representam exceções, abaixo está listada as mais comuns:

| Nome                           | Causa                                                                |
| ------------------------------ | -------------------------------------------------------------------- |
| java.lang.NullPointerException | Quando tentamos obter alguma informação de uma variável nula.        |
| java.lang.ArithmeticException  | Quando tentamos dividir um valor por zero.                           |
| java.sql.SQLException          | Quando existe algum erro relacionado a interação com banco de dados. |
| java.io.FileNotFoundException  | Quando tentamos ler ou escrever em um arquivo que não existe.        |

## Tratamento de exceções

E como ajustar o algoritmo para amenizar o ocorrido caso ocorra alguma exceção?

A instrução **`try`** permite que você defina um bloco de código para ser testado quanto a erros enquanto está sendo executado.

A instrução **`catch`** permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.

A instrução **`finally`** permite definir um bloco de código a ser executado independente de ocorrer um erro ou não. As palavras-chave `try` e `catch` vêm em pares

Estrutura de um bloco com try e catch:

```java
try {
  //  bloco de código conforme esperado
}
catch(Exception e) {// precisamos saber qual exceção
  // bloco de código que captura as exceções que podem acontecer
  // em caso de um fluxo não previsto
}
```

Como aplicar isso no nosso exemplo anterior:
```java
import java.util.Scanner;

public class SobreMim{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Digite seu nome");
            String nome = scan.next();
            
            System.out.println("Digite seu sobrenome");
            String sobrenome = scan.next();

            System.out.println("Digite sua idade");
            int idade = scan.nextInt();
            
            System.out.println("Digite sua altura (em cm)");
            int altura = scan.nextInt();

            System.out.println("Ola, meu nome é "+nome+" "+sobrenome);
            System.out.println("Tenho "+idade+" anos e "+altura+"cm de altura.");
        } catch (InputMismatchException err){
            System.out.println("Campo idade e altura precisam ser numéricos inteiros.");
        }

        scan.close();
    }
}
```