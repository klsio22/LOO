package Examples.Inheritance_and_Polymorphism;

public class worker {
    private String nome , ctps;

    public worker(String nome, String ctps) {
        this.nome = nome;
        this.ctps = ctps;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getCtps() {
        return ctps;
    }
}
