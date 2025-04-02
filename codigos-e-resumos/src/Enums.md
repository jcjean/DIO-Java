# Enums

Enum é um tipo especial de classe onde os objetos são previamente criados, imutáveis e disponíveis por toda aplicação.

Usamos Enum quando o nosso modelo de negócio contém objetos de mesmo contexto que já existem de pré-estabelecida com a certeza de não haver tanta alteração de valores.

[!IMPORTANT] Não confunda uma lista de constantes com enum.

Enquanto uma constante é uma variável de tipo com valor imutável, um enum é um conjunto de objetos já pre-definidos na aplicação.

## Boas práticas para criar objetos Enum
- As opções (objetos) devem ser descritos em caixa alta separados por underline, ex.: OPCAO_UM, OPCAO_DOIS

- Após as opções deve-se encerrar com ponto e vírgula (;)

- Um enum é como uma classe, logo poderá ter atributos e métodos tranquilamente

- Os valores dos atributos devem já ser definidos após cada opção dentro de parênteses como se fosse um new

- O construtor deve ser privado

- Não é comum um enum possuir o recurso setter (alteração de propriedade), somente os métodos getters correspondentes.

### Exemplo do uso de _Enums_:

    public enum EstadosBrasileiro{
        SERGIPE ("SE", "Sergipe"),
        RIO_JANEIRO ("RJ", "Rio de Janeiro"),
        PIAUI ("PI", "Piauí");  

        private String sigla;
        private String nome;

        private EstadosBrasileiro(String sigla, String nome) {
            this.sigla = sigla;
            this.nome = nome;
        }

        public String getSigla() {
            return sigla;
        }

        public String getNome() {
            return nome;
        }

        public String getNomeMaiusculo(){
            return nome.toUpperCase();
        }
    }

Agora não precisaremos criar objetos que representam cada estado toda vez que precisarmos destas informações, basta usar o enum acima e escolher a opção (objeto) já pré-definido em qualquer parte do nosso sistema.

    public class SistemaIbge {
        public static void main(String[] args) {
            for (EstadosBrasileiros est: EstadosBrasileiros.values()){
                System.out.println(est.getNome() + " - " + est.getSigla());    //printa todos os estados que contém no Enum.
            }

            //selecionando um estado a partir das opções disponíveis
            EstadosBrasileiros ufSelecionado = EstadosBrasileiros.PIAUI;
            
            System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
        }
    }