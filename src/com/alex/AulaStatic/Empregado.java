package com.alex.AulaStatic;

public class Empregado {

        // Variavel estatica para manter contagem de objetos empregados Criados
        private String nome;
        private String sobreNome;
        private static int contador;
        
        //inicializa empregado e adiciona 1 a contagdor

        public Empregado(String nome, String sobreNome) {
                this.nome = nome;
                this.sobreNome = sobreNome;
                
                ++contador; //Incrementa contagem estatica a empregado
        }

        public String getNome() {
                return nome;
        }

        public String getSobreNome() {
                return sobreNome;
        }

        //Método para obter contagem estatica de empregado.
        public static int getContador() {
                return contador;
        }

}
