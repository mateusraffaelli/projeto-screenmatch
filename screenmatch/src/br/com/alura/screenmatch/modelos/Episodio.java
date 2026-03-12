package br.com.alura.screenmatch.modelos;

public class Episodio {
    private int numero;
    private String nome;
    private Serie serie;

    public Serie getSerie() {
        return serie;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
}
