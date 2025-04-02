public enum EstadosBrasileiros {
    SERGIPE ("SE", "Sergipe"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí");  //é possivel adicionar mais informações caso necessário, como o número de habitantes por exemplo.

    private String sigla;
    private String nome;

    private EstadosBrasileiros(String sigla, String nome) {
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
