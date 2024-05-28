package Livro;

public class Livro {
        private String titulo;
        private String autor;
        private int ano;
    
        public Livro(String titulo, String autor, int ano) {
            this.titulo = titulo;
            this.autor = autor;
            this.ano = ano;
        }
    
        public int getAno() {
            return ano;
        }
    
        @Override
        public String toString() {
            return "Livro [Título: " + titulo + ", Autor: " + autor + ", Ano: " + ano + "]";
        }
}

