package Examples.Inheritance_and_Polymorphism;

public class student {
    private String nome , ra;

    public student(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }


}
