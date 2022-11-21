package dominio;

import java.util.List;

public class Livro extends Mercadoria {
    
    private List<String> generos;
    private String editora;


    public Livro(String nome, Double preco, List<String> generos, String editora) {
        this.generos = generos;
        this.editora = editora;
        setPreco(preco);
        setNome(nome);
    }


}
