import entidade.Produto;
import java.util.Locale;
import java.util.Scanner;


public class Main {
   
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
      
       System.out.print("NOME PRODUTO: ");
       String nome = sc.nextLine();
       System.out.print("PREÇO DO PRODUTO: ");
       Double preco = sc.nextDouble();
       System.out.print("PRODUTO QUANTIDADE: ");
       int quantidade = sc.nextInt();
       Produto produto = new Produto(nome, preco, quantidade);
       
       System.out.println();
       System.out.println("DADOS DO PRODUTO: ");
       System.out.println("-----------------");
       System.out.print("PRODUTO: " + nome);
       System.out.printf("PREÇO: %.2f\n", preco);
       System.out.println("QUANTIDADE: " + quantidade);
       System.out.printf("TOTAL: %.2f\n", produto.valorEstoque());
       
       System.out.println();
       System.out.print("QUANTAS UNIDADES ADICIONAR NO ESTOQE? ");
       quantidade = sc.nextInt();
       produto.adicionarProduto(quantidade);
       System.out.println();
       System.out.println("------DADOS ATUALIZADO------");
       System.out.println("PRODUTO: " + nome);
       System.out.printf("PRECO: %.2f\n", preco);
       System.out.println("QUANTIDADE: " + produto.quantidade);
       System.out.printf("TOTAL: %.2f\n", produto.valorEstoque());
       
       
    }
    
}
