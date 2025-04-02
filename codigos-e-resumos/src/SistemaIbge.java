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