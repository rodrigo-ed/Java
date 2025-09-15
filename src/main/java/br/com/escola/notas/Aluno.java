package br.com.escola.notas;
// Classe para representar um aluno com nome e média
public class Aluno {
    private final String nome;
    private final double media;

    public Aluno(String nome, double media) {
        this.nome = nome;
        this.media = media;
    }
// Retorna o nome do aluno
    public String getNome() {
        return nome;
    }
 // Retorna a média do aluno   
    public double getMedia() {
        return media;
    }
// Retorna o resultado baseado na média
    public String getResultado() {
        if (this.media >= 6) {
            return "Aprovado";
        } else if (this.media >= 5) {
            return "Recuperacao";
        } else {
            return "Reprovado";
        }
    }
}