package dominio;

public abstract class Mercadoria {
    private Integer id;
    private Double preco;
    private String nome;

    private static Integer idCurrent = 1;

    protected Mercadoria() {
        this.id = ++idCurrent;
    }

    public Integer getId() {
        return this.id;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

}


