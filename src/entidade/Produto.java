package entidade;


public class Produto {
    
    public String nome;
    public double preco;
    public int quantidade;
    
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public double valorEstoque(){
        return quantidade * preco;
    }
    
    public void adicionarProduto(int quatidade){
        this.quantidade += quantidade;
    }
    
    public void removerProduto(int quantidade){
        this.quantidade -= quantidade;
    }
    
}
