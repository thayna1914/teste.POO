public class Aluno {
    //Atributos

    private String nome;
    private String curso;
    private int idade;
    private double media;

    //Construtor 
    public Aluno(String nome, String curso, int idade, double media){
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
        this.media = media;
    }

    //Métodos

    public String getNome(){
        return nome;
    }

    public String getCurso(){
        return curso;
    }

    public int getIdade(){
        return idade;
    }

    public double getMedia(){
        return media;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setMedia(double media){
        this.media = media;
    }

    



}
