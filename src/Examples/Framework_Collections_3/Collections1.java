package Examples.Framework_Collections_3;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Collections1 {

    public void Collection1() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(11);
        arr.add(20);
        arr.add(1);

        System.out.println(arr);

        Collections.sort(arr);
        System.out.println(arr);

    }

    public void LinkedList() {
        LinkedList<Integer> arr = new LinkedList<>();
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(11);
        arr.add(20);
        arr.add(1);

        System.out.println(arr);

    }

    public void ArrayBlockingQueue() {
        ArrayBlockingQueue<Integer> arr = new ArrayBlockingQueue<>(4);
        arr.add(5);
        arr.add(4);
        arr.offer(8);//Retorna até onde é possivel adicionar
        arr.offer(11);
        arr.offer(20);
        arr.offer(1);

        System.out.println(arr);
    }

    public void hashmap() {
        HashMap<Integer, Person> map = new HashMap<>();

        //Put Para adicionar valores
        map.put(1, new Person(100, "Paulo"));
        map.put(2, new Person(120, "Ana"));
        map.put(1, new Person(130, "Maria"));
        map.put(1, new Person(140, "Guilherme"));

        System.out.println(map);

//        System.out.println(map.containsKey(1));
//        System.out.println(map.containsValue(new Person(120,"Ana")));

        System.out.println("Map Keyset " + map.keySet());//Para pegar as chaves
        System.out.println("Map values " + map.values());//Para pegar valores

        //Get para pegar valores

        /*for (Integer s : map.keySet()) {
            Person p = map.get(s);
            System.out.println(p);
        }*/

        //Quando quiser pegar os  valores e as chaves usa o entrySet
        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --- " + entry.getValue());

        }

    }

}
