package org.codexdei.sobrecargavarargs;

import static org.codexdei.sobrecargavarargs.SobrecargaVarArgs.*;

public class EjemploVarArgs {

    public static void main(String[] args) {

        System.out.println("SUMANDO: " + sumar(4,5));
        System.out.println("SUMANDO: " + sumar(4,5,10,12,20,30));
    }
}
