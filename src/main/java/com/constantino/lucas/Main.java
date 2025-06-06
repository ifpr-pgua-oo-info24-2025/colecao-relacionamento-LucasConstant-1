package com.constantino.lucas;
import java.util.ArrayList;

import com.constantino.lucas.enums.Nacionalidade;
import com.constantino.lucas.models.Autor;
import com.constantino.lucas.models.Livro;
import com.constantino.lucas.models.LivroDigital;
import com.constantino.lucas.models.LivroFisico;

public class Main
{

    public static void main(String[] args) throws Exception
    {
        ArrayList<Livro> biblioteca = new ArrayList<>();

        Autor autor1 = new Autor("guilherme borille", Nacionalidade.BRASILEIRO);
        Autor autor2 = new Autor("Luisa", Nacionalidade.AMERICANO);


        LivroDigital digital = new LivroDigital(autor1, 1500, "cleen code", 4.0);
        LivroDigital digital2 = new LivroDigital(autor1, 666, "ATIVIDADEE", 7.3);
        LivroFisico fisico = new LivroFisico(autor2, 2000, "slaa", 15);
        LivroFisico fisico2 = new LivroFisico(autor2, 2302, "Livro insano", 69);

        biblioteca.add(fisico);
        biblioteca.add(digital);
        biblioteca.add(fisico2);
        biblioteca.add(digital2);

        for (Livro livro: biblioteca) {
            livro.mostrarDetalhes();
        }


    }
    
}
