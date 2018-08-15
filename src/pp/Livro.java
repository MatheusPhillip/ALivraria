package pp;

/**
 *
 * @author Phillip
 */
public class Livro {
       
    private String titulo;
    private int ISBN;
    private String autor;
    private double preco;
    private int estoque;

    public Livro(String titulo, int ISBN, String autor, double preco, int estoque) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.preco = preco;
        this.estoque = estoque;
    }
    
    public Livro(){
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", ISBN: " + ISBN + ", autor: " + autor + ", preco=" + preco + ", estoque=" + estoque + "\n\n";
    }
    
    
    
    
    
    
    
    
}
