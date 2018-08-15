package pp;

/**
 *
 * @author Phillip
 */
public class Cadastro {
    private IRepLivros rep;  

    public Cadastro(IRepLivros rep) {
        this.rep = rep;
    }
    
    
    public boolean inserir(Livro livro){
        return rep.inserir(livro);
    }
    
    public boolean remover(int ISBN){
        return rep.remover(ISBN);
    }
    
    public void consultarISBN(int ISBN){
        rep.consultarLivro(ISBN);
    }
       
    public void consultarTitulo(String titulo){
        rep.consultarTitulo(titulo);
    }
    public void consultarAutor(String autor){
        rep.consultarAutor(autor);
    }
    public void listar(){
        rep.listar();
    }
    public void maisCaro(){
        rep.maisCaro();
    }
    public void maisBarato(){
        rep.maisBarato();
    }
    public void estoqueBaixo(int minimo){
        rep.estoqueBaixo(minimo);
    }
    
}
