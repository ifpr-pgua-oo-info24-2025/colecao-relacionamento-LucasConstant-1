package com.constantino.lucas.models;

public class Livro
{
    private Autor autor;
    private Integer anoPublicacao;
    private String titulo;

    public Livro(Autor autor, Integer anoPublicacao, String titulo)
    {
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.titulo = titulo;
    }

    public void mostrarDetalhes() {
        System.out.println(autor.getNome());
        System.out.println(autor.getNacionalidade());
        System.out.println(anoPublicacao);
        System.out.println(titulo);
    }


    
}
