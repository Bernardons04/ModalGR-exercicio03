package com.mycompany.exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
        String dados = "Ana,89,78,Maria,45.8,27,56,Paula Pereira,978,A,VIVA,35,125,8999";

        String[] valores = dados.split(",");

        System.out.println("Dados numéricos:");
        System.out.print("| ");
        for (String valor : valores) {
            if (VerificaPossivelNumero(valor)) {
                System.out.print(valor + " | ");
            }
        }
        
        System.out.println("\n");

        System.out.println("Dados de string:");
        System.out.print("| ");
        for (String valor : valores) {
            if (!VerificaPossivelNumero(valor)) {
                System.out.print(valor + " | ");
            }
        }
    }

    private static boolean VerificaPossivelNumero(String valor) {
        try {
            Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
