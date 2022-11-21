package servico;

import java.util.List;

import dominio.Mercadoria;

public class Repositorio<T extends Mercadoria> implements IRepositorio<T> {

    protected List<T> baseFicticia;


    @Override
    public Integer adicionar(T mercadoria) {
        baseFicticia.add(mercadoria);
        return mercadoria.getId();
    }

    @Override
    public Boolean editar(Integer id, T novaMercadoria) {
        if(baseFicticia.removeIf(mercadoria -> mercadoria.getId().equals(id))) {
            baseFicticia.add(novaMercadoria);
            return true;
        }
        return false;
    }

    @Override
    public Boolean remover(Integer id) {
        return baseFicticia.removeIf(mercadoria -> mercadoria.getId().equals(id));
    }

    @Override
    public T buscar(Integer id) {
        return baseFicticia.stream().filter(mercadoria -> mercadoria.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<T> buscarTodos() {
        return baseFicticia;
    }

    @Override
    public Integer quantidadeCadastrada() {
        return baseFicticia.size();
    }
    
}
