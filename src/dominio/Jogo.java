package dominio;

import java.util.List;

public class Jogo extends Mercadoria{
    private String distribuidora;
    private List<String> generos;
    private String estudio;



    public Jogo(String nome, Double preco,  String distribuidora, List<String> generos, String estudio) {
        this.distribuidora = distribuidora;
        this.generos = generos;
        this.estudio = estudio;
        setPreco(preco);
        setNome(nome);
    }

}
