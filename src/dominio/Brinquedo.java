package dominio;

public class Brinquedo extends Mercadoria {
    private String tipo;

    public Brinquedo(Double preco, String nome,String tipo) {
        this.tipo = tipo;

        setPreco(preco);
        setNome(nome);
    }


}
