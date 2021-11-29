package Examples.Framework_Collections_3;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private int cpf;
    private String name;

    public Person(int cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cpf=" + cpf +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person object) {
        return this.cpf - object.cpf;

         /*if (this.cpf == o.cpf)
            return 0;

        if (this.cpf < o.cpf)
            return -1;
        return 1;*/
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return cpf == person.cpf && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, name);
    }

}
