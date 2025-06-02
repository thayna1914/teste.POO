public class Produto {

    //Atributos 

    private String nome;
    private String categoria;
    private int quantidade;
    private double preco;

    //Construtor

    public Produto(String nome, String categoria, int quantidade, double preco){
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.preco = preco;

    }

    //Métodos

    public String getNome(){
        return nome;
    }

    public String getCategoria(){
        return categoria;
    }

    public int getQuantidade(){
        return quantidade;
    }
 
    public double getPreco(){
        return preco;
    } 
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    

}
