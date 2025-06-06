package com.constantino.lucas.models;
import com.constantino.lucas.enums.*;

public class Autor
{
    private String nome;
    private Nacionalidade nacionalidade;

    public Autor(String nome, Nacionalidade nacionalidade)
    {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
}
