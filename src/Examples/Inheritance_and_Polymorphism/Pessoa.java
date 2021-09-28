package Examples.Inheritance_and_Polymorphism;

public class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void imprimir(){
        System.out.printf("Nome: %s, ", nome);
    }

}
