package org.example;

import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
            int número = scanner.nextInt();

            if(fazParte(número)){
             System.out.println(número +" pertece a escala Fibonacci" );
            } else{
                System.out.println(número + " não percetece a escala");
            }

        }
        //Função pra validar se pertence ou não a escala
        public static boolean fazParte(int teste){
            // A sequência de Fibonacci começa com 0 e 1, precisamos primeiro saber se o número, é 0 ou 1
            int s = 0, v = 1;

            // testando se  o número é 0 ou 1, se sim, ele pertence a sequencia
            if (teste == s || teste == v) {
                return true;
            }

            // Criar uma sequencia para que atinja o número ou supere-o
            while (v <= teste) {
                int next = s + v;
                s = v;
                v = next;

                if (v == teste) {
                    return true;
                }
            }


            return false;
        }
    }

