package com.bank.study;

public class Condicoes {

    public static void main(String[] args) {
        String nome = "Eduardo";
        int idade = 18;

        if(idade >= 21){
            System.out.println(nome + " é responsável por outras pessoas");
        }else if(idade >= 18 && idade <= 21){
            System.out.println(nome + " é maior de idade");
        }else{
            System.out.println(nome + " é menor de idade");
        }

        System.out.println(idade >= 18 ? nome + " é maior de idade." : nome + " é menor de idade");


        switch (idade){
            case 18:
                System.out.println("É maior de idade");
                break;
            case 15:
                System.out.println("É menor de idade");
                break;
            default:
                System.out.println("Não entrou em nenhum.");
        }

    }


}
