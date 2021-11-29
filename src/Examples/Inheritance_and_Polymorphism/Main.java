package Examples.Inheritance_and_Polymorphism;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Tiago", "123456");
        Worker worker = new Worker("Jonas", "369841");

        student.imprimir();
        worker.imprimir();
        Pessoa p1 = new Pessoa("Lima");
        p1.imprimir();

        //Person p2 = new Person("P2")
       // Person p2 = new Student("Martins","1111");
        //Person p3 = new Worker("João","568444");

        imprimirNomePessas(student);

    }

    public static void imprimirNomePessas(Pessoa p){
        System.out.println("Imprime nome Resultado em :"+ p.getNome());

        Student studentOrigin = (Student) p;//Casting

        System.out.println("Ra" + studentOrigin.getRa());
    }
}
