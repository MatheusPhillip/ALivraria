package pp;
import java.util.Scanner;

/**
 *
 * @author Phillip
 */
public class Livraria {

    
    
    public static void main(String[] args) {
        
        
        IRepLivros rep = new RepLivros();
        
        Cadastro cadastro = new Cadastro(rep);
        cadastro.inserir(new Livro("titulo",1,"autor", 8, 10));
        cadastro.listar();
        Scanner input = new Scanner(System.in);
        int op, ISBN, estoque;
        String titulo, autor;
        double preco;
        
        do{
            System.out.println("1 - Inserir Livro ");
            System.out.println("2 - Remover Livro ");
            System.out.println("3 - Procurar por Autor ");
            System.out.println("4 - Procurar por Titulo ");
            System.out.println("5 - Procurar por ISBN ");
            System.out.println("6 - Procurar mais Barato ");
            System.out.println("7 - Procurar mais Caro ");
            System.out.println("8 - Exibir Todos os Livros ");
            System.out.println("9 - Livros Com Estoque Baixo ");
            System.out.println("10 - Sair do Programa ");
            System.out.println("Escolha uma opcao: ");
            op = input.nextInt();
            switch(op){
                case 1:
                    System.out.println("Informe o ISBN do livro: ");
                    ISBN = input.nextInt();
                    input.nextLine();
                    System.out.println("Informe o Titulo do livro: ");
                    titulo = input.nextLine();
                    System.out.println("Informe o Preco do livro: ");
                    preco = input.nextDouble();
                    System.out.println("Informe o Estoque Recebido: ");
                    estoque = input.nextInt();
                    input.nextLine();
                    System.out.println("Informe o Autor do livro: ");
                    autor = input.nextLine();
                    Livro livro = new Livro(titulo, ISBN, autor, preco, estoque);
                    if(cadastro.inserir(livro)){
                        System.out.println("Insercao efetuada.");
                    }else{
                        System.out.println("Ja existe um livro com o mesmo ISBN.");
                        
                    }
                    break;
                case 2:
                    System.out.println("Informe o ISBN do livro que deseja remover: ");
                    ISBN = input.nextInt();
                    if(cadastro.remover(ISBN)){
                        System.out.println("Livro removido");
                    }else{
                        System.out.println("Livro nao cadastrado");
                    }
                    break;
                case 3:
                    System.out.println("Informe o nome do autor: ");
                    autor = input.nextLine();
                    cadastro.consultarAutor(autor);
                    break;
                case 4:
                    System.out.println("Informe o titulo do livro: ");
                    titulo = input.nextLine();
                    cadastro.consultarTitulo(titulo);
                    break;
                case 5:
                    System.out.println("Informe o ISBN do livro: ");
                    ISBN = input.nextInt();
                    cadastro.consultarISBN(ISBN);
                    break;
                case 6:
                    cadastro.maisBarato();
                    break;
                case 7:
                    cadastro.maisCaro();
                    break;
                case 8:
                    cadastro.listar();
                    break;
                case 9:
                    System.out.println("Informe o valor minimo do estoque: ");
                    estoque = input.nextInt();
                    cadastro.estoqueBaixo(estoque);
                    break;
                case 10:
                    System.out.println("Adeus");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    break;    
            }  
        }while(op != 10); 
    }
    
}
