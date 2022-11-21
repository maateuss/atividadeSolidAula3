package servico;
import java.util.List;
import dominio.Mercadoria;

public interface IRepositorio<T extends Mercadoria> {
    Integer adicionar(T mercadoria);
    Boolean editar(Integer id, T novaMercadoria);
    Boolean remover(Integer id);
    T buscar(Integer id);
    List<T> buscarTodos();
    Integer quantidadeCadastrada();
}
