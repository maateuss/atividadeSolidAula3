package servico;

import dominio.*;

public class BancoDeDados {
    static Repositorio<Album> albumRepositorio = new Repositorio<>();
    static Repositorio<Brinquedo> brinquedoRepositorio = new Repositorio<>();
    static Repositorio<Filme> filmeRepositorio = new Repositorio<>();
    static Repositorio<Jogo> jogoRepositorio = new Repositorio<>();
    static Repositorio<Livro> livroRepositorio = new Repositorio<>();
}
