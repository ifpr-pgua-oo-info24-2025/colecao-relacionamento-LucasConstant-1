package com.constantino.lucas.models;

public class LivroDigital extends Livro
{
    private Double tamanhoDoArquivoMB;
    
    public LivroDigital(Autor autor, Integer anoPublicacao, String titulo, Double tamanhoDoArquivoMB )
    {
        super(autor,anoPublicacao,titulo);
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println(tamanhoDoArquivoMB);
    }
    
}
