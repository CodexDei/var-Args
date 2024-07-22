package org.codexdei.sobrecargavarargs;

public class SobrecargaVarArgs {

    //Con este constructor se impide crear un objeto que llame a sumar
    private SobrecargaVarArgs(){

    }

    public static int sumar(int a, int b){

        return a + b;
    }

    //El siguiente es el metodo llamado varArgs, sirve para que un metodo pueda usarse para cualquier cantidad
    //de argumentos
    //En si "argumentos" actua como un array, por ello se puede iterar
    //Se crea igual que un metodo cualquiera solo que en los parametros se debe colocar (int... argumentos)
    //Puede ser cualquier otra palabra en vez de "argumentos"
    //tambien se puede colocar como: (int a, int... argumentos) ó (int a, int b, int... argumentos)
    public static  int sumar(int... argumentos){

        int total = 0;

        for (int numero : argumentos){

            total += numero;
        }

        return total;
    }
//
//    public static double sumar(int a, int... varargs){
//
//        double total = 0;
//
//        for (int i : varargs){
//
//            total += i;
//        }
//        return total;
//    }

}
