package pp;

/**
 *
 * @author Phillip
 */
public interface IRepLivros {
    
    public boolean inserir(Livro livro);
    public boolean remover(int ISBN);
    public void consultarLivro(int ISBN);
    public void consultarTitulo(String titulo);
    public void consultarAutor(String autor);
    public void listar();
    public void maisCaro();
    public void maisBarato();
    public void estoqueBaixo(int minimo);
    public int existe(Livro livro);
    
}
