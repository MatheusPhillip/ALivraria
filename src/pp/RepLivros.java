package pp;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author Phillip
 */
public class RepLivros implements IRepLivros {

    ArrayList<Livro> livros = new ArrayList();

    public boolean inserir(Livro livro) {
        if (this.existe(livro) == -1) {
            for (int i = 0; i < livros.size(); i++) {
                if (livros.get(i).getISBN() > livro.getISBN()) {
                    livros.add(i, livro);
                    return true;
                }
            }
            livros.add(livro);
            return true;
        } else {
            return false;
        }
    }

    public boolean remover(int ISBN) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getISBN() == ISBN) {
                livros.remove(i);
                return true;
            }
        }
        return false;
    }

    public void consultarLivro(int ISBN) {
        if(livros.size() == 0){
            System.out.println("Nao ha livros cadastrados\n\n");
        }else{
            System.out.println("Livros cadastrados que possuem ISBN " + ISBN);
            for (int i = 0; i < livros.size(); i++) {
                if (livros.get(i).getISBN() == ISBN) {
                    System.out.println("Livro " + (i + 1));
                    System.out.println(livros.get(i).toString());
                }
            }
        }
    }

    public void consultarTitulo(String titulo) {
        
        if(livros.size() == 0){
            System.out.println("Nao ha livros cadastrados\n\n");
        }else{
            System.out.println("Livros que possuem o titulo: " + titulo);
            for (int i = 0; i < livros.size(); i++) {
                if (livros.get(i).getTitulo().equals(titulo)) {
                    System.out.println("Livro " + (i + 1));
                    System.out.println(livros.get(i).toString());
                }
            }
        }
    }

    public void consultarAutor(String autor) {
        
        
        if(livros.size() == 0){
            System.out.println("Nao ha livros cadastrados \n\n");
        }
        else{
            System.out.println("Livros cadastrados do autor " + autor);
            for (int i = 0; i < livros.size(); i++) {
                if (livros.get(i).getAutor().equals(autor)) {
                    System.out.println("Livro " + (i + 1));
                    System.out.println(livros.get(i).toString());
                }
            }
        }   
    }

    public void maisCaro() {
        double maior = -1;
        int posicao = -1;
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getPreco() > maior) {
                maior = livros.get(i).getPreco();
                posicao = i;
            }
        }
        if (posicao == -1) {
            System.out.println("Nao ha livros cadastrados");
        } else {
            System.out.println(livros.get(posicao).toString());
        }
    }

    public void maisBarato() {
        double menor = 10000;
        int posicao = -1;
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getPreco() < menor) {
                menor = livros.get(i).getPreco();
                posicao = i;
            }
        }
        if (posicao == -1) {
            System.out.println("Nao ha livros cadastrados");
        } else {
            System.out.println(livros.get(posicao).toString());
        }

    }

    public void estoqueBaixo(int minimo) {

//       livros.stream().filter(livro -> livro.getEstoque() <= minimo).forEach(l -> System.out.println(l));

        if(livros.size() == 0){
            System.out.println("Nao ha livros cadastrados \n");
        }else{        
                for(int i = 0; i < livros.size(); i++){
                if(livros.get(i).getEstoque() <= minimo){
                    System.out.println("Livro " + (i + 1));
                    System.out.println(livros.get(i).toString());
                }
            }
        }
    }

    public void listar() {

        if (livros.size() == 0) {
            System.out.println("Nao ha livros cadastrados");
            return;
        }

        for (int i = 0; i < livros.size(); i++) {
            System.out.print("Livro " + (i + 1) + " " + livros.get(i).toString());
        }
    }

    public int existe(Livro livro) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getISBN() == livro.getISBN()) {
                return i;
            }
        }
        return -1;
    }

}
