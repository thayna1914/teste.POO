public class PrincipalAluno {
    public static void main(String[] args){

        //Criando um objeto da classe Aluno

        Aluno a = new Aluno("Matheus", "Matemática", 21, 9.3);

        //Exibindo os dados do Aluno

        System.out.println("Nome: " + a.getNome());
        System.out.println("Curso " + a.getCurso());
        System.out.println("Idade " + a.getIdade());
        System.out.println("Media: " + a.getMedia());

        //Modificando os dados do Aluno

        a.setNome("Matheus Augusto");
        a.setCurso("História");
        a.setIdade(22);
        a.setMedia(9.5);

        //Exibindo os dados atualizados

        System.out.println("\nDados atualizados:");
        System.out.println("Nome: " + a.getNome());
        System.out.println("Curso: " + a.getCurso());
        System.out.println("Idade: " + a.getIdade());
        System.out.println("Media: " + a.getMedia());
        
}

}