package Examples.Inheritance_and_Polymorphism;

public class Student extends Pessoa {
    private String ra;

    public Student(String nome, String ra) {
        super(nome);
        this.ra = ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void imprimir() {
        super.imprimir();
        System.out.printf("ra:%s;\n", ra);
    }

}
