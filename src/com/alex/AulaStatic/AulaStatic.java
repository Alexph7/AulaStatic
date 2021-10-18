package com.alex.AulaStatic;

public class AulaStatic {

        public static void main(String[] args) {
                
                //mostra que a contagem é 0 antes de criar antes de criar Empregados
                System.out.printf("Empregados antes de ser instanciado: %d%n", Empregado.getContador()); //Estaticos não precisa de instanciar o objeto
                
                //Cria 2 empregados: a Contagem deve ser 2
                Empregado e1 = new Empregado("Alan", "Souza");
                Empregado e2 = new Empregado("Ruan", "Castro");
                
                //Montra o contador depois de criado 2 objetos
                System.out.printf("%nEmpregados depois de instanciados:%n");
                System.out.printf("via e1.getContador(): %d%n ", e1.getContador());
                System.out.printf("via e2.getContador(): %d%n ", e2.getContador());
                System.out.printf("via Empregado.getContador(): %d%n ", Empregado.getContador());
                

        }
        
}
