public class PrincipalProduto {
    public static void main(String[] args){

        //Criando um objeto na classe Produto

        Produto p = new Produto("Boneca", "brinquedo", 15, 20);

        //Exibindo os dados do Produto

        System.out.println("Nome: " + p.getNome());
        System.out.println("Categoria " + p.getCategoria());
        System.out.println("Quantidade " + p.getCategoria());
        System.out.println("Preco: " + p.getPreco());

        //Modificando os dados do produto

        p.setNome("Geladeira");
        p.setCategoria("Eletrodomestico");
        p.setQuantidade(12);
        p.setPreco(800);

        //Exibindo os dados atualizados

        System.out.println("/nDados atualizados:");
        System.out.println("Nome " + p.getNome());
        System.out.println("Categoria " + p.getCategoria());
        System.out.println("Quantidade " + p.getQuantidade());
        System.out.println("Preco " + p.getPreco());

    }


}
