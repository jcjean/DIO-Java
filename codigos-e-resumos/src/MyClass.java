public class MyClass{
    public double somar(int num1, int num2){
        int num3 = num1+num2;
        return num3;
        //return num1+num2;
    }

    public void imprimir(String texto){
        texto = "Ola mundo!";
        System.out.println(texto);
        //Neste caso naão precisa do return pois não será retornado nenhum resultado
    }

    //throws Exception: indica que o método, ao ser utilizado, poderá gerar uma exceção.
    public double dividir(int dividendo, int divisor) throws Exception{
        return dividendo/divisor;
    }

    //este método não estará visivel para outras classes.
    /*private double saldo(){
    
    }*/

    public void gravarCliente(String nome, String cpf, Integer idade){
        //este método tem a finalidade de gravar informações de um cliente.
        //porque não criar um objeto cliente e passar como parâmetro?
    }
}