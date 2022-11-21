package dominio;

import java.util.List;

public class Album extends Mercadoria {
    private List<String> artistas;
    private List<String> generos;
    private List<String> selos;


    public Album(String nome, Double preco, List<String> artistas, List<String> generos, List<String> selos) {
        this.artistas = artistas;
        this.generos = generos;
        this.selos = selos;
        setPreco(preco);
        setNome(nome);
    }



}
