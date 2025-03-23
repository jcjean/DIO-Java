public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setNome("Joao");
        felipe.setIdade(21);

        System.out.println("O Aluno " + felipe.getNome() + " tem " + felipe.getIdade() +" anos.");
    }
}
