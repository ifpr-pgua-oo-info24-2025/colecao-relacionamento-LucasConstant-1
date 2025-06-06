package com.constantino.lucas.enums;

public enum Nacionalidade
{
    BRASILEIRO(6,"brasileiro"), AMERICANO(7,"USA");
    
    Nacionalidade(int codigo, String descricao)
    {
        this.codigo = 0;
        this.descricao = "Nacionalidade";
    }
    private int codigo;
    private String descricao;

    public int getCodigo()
    {
        return codigo;
    }
    public String getDescricao()
    {
        return descricao;
    }
}