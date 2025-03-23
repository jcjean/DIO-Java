# Métodos Get e Set em Java

Em Java, os métodos `get` e `set` são utilizados para acessar e modificar os atributos de uma classe de maneira controlada, seguindo o princípio do encapsulamento.  

- **Getter (`get`)**: Retorna o valor de um atributo privado.
- **Setter (`set`)**: Modifica o valor de um atributo privado.

## Exemplo Prático

### Classe `Aluno`
A classe `Aluno` possui dois atributos: `nome` e `idade`. Como eles não possuem o modificador `public`, não podem ser acessados diretamente de fora da classe. Para isso, utilizamos os métodos `get` e `set`:

```java
public class Aluno {
    String nome;
    int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }
}
```

### Classe `Escola`
A classe `Escola` demonstra como utilizar os métodos `get` e `set` para modificar e acessar os atributos de um objeto da classe `Aluno`:

```java
public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setNome("Joao");
        felipe.setIdade(21);

        System.out.println("O Aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");
    }
}
```

### Saída do Código
```
O Aluno Joao tem 21 anos.
```

## Benefícios do Uso de Getters e Setters
- **Encapsulamento**: Protege os atributos da classe, impedindo que sejam alterados diretamente.
- **Validação**: Permite adicionar verificações antes de modificar os valores dos atributos.
- **Manutenção**: Facilita a refatoração do código sem impactar diretamente quem usa a classe.