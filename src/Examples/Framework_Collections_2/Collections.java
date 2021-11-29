package Examples.Framework_Collections_2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collections {

    /*
    * A arvore ordena e remove os iguais
    * */

    public void TreeSet() {
        TreeSet<Person> array = new TreeSet<>();
        array.add(new Person(1, "Thiago"));
        array.add(new Person(6, "Ana"));
        array.add(new Person(4, "Gabriel"));
        array.add(new Person(8, "Paulo"));
        array.add(new Person(12, "Thiago Mendes"));
        array.add(new Person(12, "Thiago Mendes"));

        System.out.println(array);

    }

    /*
    * Não tem ordenção nenhuma
    * */
    public void HashSet(){
        HashSet<Person> array = new HashSet<>();
        array.add(new Person(1, "Thiago"));
        array.add(new Person(6, "Ana"));
        array.add(new Person(4, "Gabriel"));
        array.add(new Person(8, "Paulo"));
        array.add(new Person(12, "Thiago Mendes"));
        array.add(new Person(11, "Thiago Mendes2"));

        System.out.println(array);
    }

    /*
    *
    * A Ordem é a que vale e remove os iguais
    * */
    public void LinkedHashSet() {
        LinkedHashSet<Person> array = new LinkedHashSet<>();
        array.add(new Person(1, "Thiago"));
        array.add(new Person(6, "Ana"));
        array.add(new Person(4, "Gabriel"));
        array.add(new Person(8, "Paulo"));
        array.add(new Person(12, "Thiago Mendes"));
        array.add(new Person(11, "Thiago Mendes2"));

        System.out.println(array);
    }

}
