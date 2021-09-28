package Examples.Inheritance_and_Polymorphism;

public class Worker extends Pessoa{
    private String ctps;

    public Worker(String nome, String ctps) {
        super(nome);
        this.ctps = ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getCtps() {
        return ctps;
    }

    public void imprimir(){
        super.imprimir();
        System.out.printf("ctps:%s;\n", ctps);
    }
}
