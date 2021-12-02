package Examples.Enumerators;

public class Main {
    public static void main(String[] args) {
        print(Color.BLACK);

        System.out.println(Color.RED.name());

        Color meuEnum = Color.valueOf("RED");
        System.out.println(meuEnum == Color.RED);


        System.out.println(Color.WHITE.toString());
    }

    static void  print(Color c){
        System.out.println(c);
    }

}
