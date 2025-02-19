public class Operadores {
    public static void main(String[] args) {
        int a=5, b=6;
        
        /*String resultado;
        
        if(a==b){
            resultado = "true";
        }else{
            resultado = "false";
        }*/
        String resultado = a==b ? "true" : "false"; //simplificando a condicional acima com operador ternario.
        String nome1 = "Jean";
        String nome2 = "Jean";
        //String nome2 = new String("Jean");

        System.out.println(nome1==nome2);   //verifica a condição e retorna true ou false
        System.out.println(resultado);
    }
}
