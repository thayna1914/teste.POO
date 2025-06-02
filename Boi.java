public class Boi {
    
    //Atributos 

    private String nome;
    private int idade;
    private double peso;
    private String cor; 
    private boolean produz_leite;

    //Construtor

    public Boi(String nome, int idade, double peso, String cor, boolean produz_leite){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.cor = cor;
        this.produz_leite = produz_leite;

    }

        //Métodos

        public String getNome(){
            return nome;
        }

        public int getIdade(){
            return idade;
        }

        public double getPeso(){
            return peso;
        }

        public String getCor(){
            return cor;
        }

        public boolean getProduz_leite(){
          return produz_leite;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public void setIdade(int idade){
            this.idade = idade;
        }

        public void setPeso(double peso){
            this.peso = peso;
        }

        public void setCor(String cor){
            this.cor = cor;
        }

        public void setProduz_leite(boolean produz_leite){
            this.produz_leite = produz_leite;
        }

        //Método toString

        public String toString(){
            return
            "\nNome: " + nome +
            "\nIdade: " + idade +
            "\nPeso: " + peso +
            "\nCor: " + cor +
            "\nProduz_leite: " + produz_leite;
        }


}
