package com.constantino.lucas.models;

public class LivroFisico extends Livro
{
    private Integer numeroDePaginas;

    public LivroFisico(Autor autor, Integer anoPublicacao, String titulo, Integer numeroDePaginas )
    {
        super(autor, anoPublicacao, titulo);
        this.numeroDePaginas = numeroDePaginas;
    }
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println(numeroDePaginas);

        
    }
    
}
