# Métodos

Os métodos correspondem a **funções** ou **sub-rotinas** disponiveis dentro das nossas classes.
### Alguns critérios para tornar o código mais legivel para nós e também para outras pessoas.
- Deve ser nomeado como verbo
- Segue o padrão camelCase

Exemplos:
```
somar(int num1, int num2){}

abrirConexao(){}

findById(int id){}
```

> [!IMPORTANT]
> Em Java não existe o conceito de métodos globais. Todos devem **sempre** ser definidos dentro de uma classe.

- **É importante compreender qual a proposta principal do método e qual o tipo de retorno esperado após executá-lo.**
Caso o método nao retorne nenhum valor, ele será representado pela palavra-chave *void*.

- **Quais os parametros serão necessários para a execução do método?** Os métodos as vezes precisarão de argumentos como critérios para a execução.

- **O método possui o risco de apresentar alguma exceção?** As vezes é necessário prever e tratar algumas exceções pois são comuns na execução de métodos.

- **Qual a visibilidade do método?** Será necessário que o metodo seja visivel a toda aplicação, somente em mesmo pacotes, através de herança ou somente a nível da própria classe.

A seguir trago um exemplo de uma classe com dois métodos e algumas considerações:

```
public class MyClass{
    public double somar(int num1, int num2){
        //Lógica
        return ...;
    }

    public void imprimir(String texto){
        //Logica
        //Neste caso naão precisa do return pois não será retornado nenhum resultado
    }

    //throws Exception: indica que o método, ao ser utilizado, poderá gerar uma exceção.
    public double dividir(int dividendo, int divisor) throws Exception{

    }

    //este método não estará visivel para outras classes.
    private void metodoPrivado(){

    }

    public void gravarCliente(String nome, String cpf, Integer idade){
        //este método tem a finalidade de gravar informações de um cliente.
        //porque não criar um objeto cliente e passar como parâmetro?
    }
    public void gravarCliente(Cliente cliente){

    }
    //ou
    public void gravar(Cliente cliente){
        
    }
}
```