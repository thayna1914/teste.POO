public class PrincipalBoi {
    public static void main(String [] args){

        Boi boi1 = new Boi("João" , 15 , 55.5 , "amarelo", true);
        Boi boi2 = new Boi("Maria" , 16 , 44.6 , "rosa" , false);

        System.out.println("\nBoi True  e False:");
        System.out.println("\nPrimeiro Boi: ");
        System.out.println(boi1.toString());
        System.out.println("\nSegundo Boi: ");
        System.out.println(boi2.toString());
        System.out.println("Acabou<3");
        


    }
}
