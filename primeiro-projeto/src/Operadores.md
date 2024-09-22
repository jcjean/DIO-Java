## Exemplos do uso de operadores ternarios

Nós podemos substituir um simples _if/else_ pelo operador ternario **?:** . Por exemplo:

Este trecho de um código:
```
String resultado;

if(a==b){
    resultado = "true";
}else{
    resultado = "false";
}

System.out.println(resultado);
```

Poderia ser escrito desta maneira:
```
String resultado = a==b ? "true" : "false";
System.out.println(resultado);
```