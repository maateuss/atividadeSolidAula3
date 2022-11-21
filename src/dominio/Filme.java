package dominio;

import java.util.List;

public class Filme extends Mercadoria {
    private String estudio;
    private String diretores;
    private List<String> generos;
    private List<String> produtores;


    public Filme(String nome, Double preco,  String estudio, String diretores, List<String> generos, List<String> produtores) {
        this.estudio = estudio;
        this.diretores = diretores;
        this.generos = generos;
        this.produtores = produtores;
        setPreco(preco);
        setNome(nome);
    }
    
}
