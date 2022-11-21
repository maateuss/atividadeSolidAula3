package servico;

import dominio.*;

public class BancoDeDados {
    private static Repositorio<Album> albumRepositorio = new Repositorio<>();
    private static Repositorio<Brinquedo> brinquedoRepositorio = new Repositorio<>();
    private static Repositorio<Filme> filmeRepositorio = new Repositorio<>();
    private static Repositorio<Jogo> jogoRepositorio = new Repositorio<>();
    private static Repositorio<Livro> livroRepositorio = new Repositorio<>();

    public Integer obterNumeroDeAlbuns(){
        return albumRepositorio.quantidadeCadastrada();
    }

    public Integer obterNumeroDeBrinquedos() {
        return brinquedoRepositorio.quantidadeCadastrada();
    }

    public Integer obterNumeroDeFilmes() {
        return filmeRepositorio.quantidadeCadastrada();
    }

    public Integer obterNumeroDeJogos() {
        return jogoRepositorio.quantidadeCadastrada();
    }

    public Integer obterNumeroDeLivros() {
        return livroRepositorio.quantidadeCadastrada();
    }
}
