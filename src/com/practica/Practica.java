package com.practica;

public class Practica {
    public static void main(String[] args) {
        String[] nombres = {"A", "B", "C", "D"};
        //String nombres = "jhoan";
        boolean variable = nombres.equals("");
        if (!variable){
            System.out.println(textoArray(nombres));
        }else{
            System.out.println(texto("Amor"));
        }

    }
    public static String texto(String texto){
        return texto;
    }
    public static String textoArray(String[] texto){
        String concatenar = "";
        for (int i = 0; i < texto.length; i++) {
            concatenar += texto[i];
        }
        return concatenar;
    }
}
