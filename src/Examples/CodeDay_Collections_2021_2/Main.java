package Examples.CodeDay_Collections_2021_2;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) {

        // Solução primitiva: armazenar dados em Arrays
//	    Book[] booksArray = new Book[8];
//	    booksArray[0] = new Book("T1", "A1");
//      booksArray[1] = new Book("T2", "A2");
//      for (int i = 0; i < 8; i++) {
//          System.out.println(booksArray[i]);
//      }

        //-------------------------------------------------------------------------------

        // Armazenar em Listas (classes que implementam List)
//        ArrayList<Book> arrayList = new ArrayList<>();
//        arrayList.add(new Book("T1","A1"));
//        arrayList.add(new Book("T2","A2"));
//        arrayList.add(new Book("T3","A3"));
//
//        for(Book b : arrayList){
//            System.out.println(b);
//        }
//
//        System.out.println(arrayList.size());
//        Book book4 = new Book("T4","A4");
//        arrayList.add(book4);
//        System.out.println(arrayList.size());
//        arrayList.remove(book4); // remoção de elemento por objeto
//        System.out.println(arrayList.size());
//        arrayList.remove(0); // remoção de elemento por índice
//        System.out.println(arrayList.size());

        //-------------------------------------------------------------------------------
//        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue(3); //capacidade máxima 3
//        blockingQueue.add(new Book("T1", "A1"));
//        blockingQueue.add(new Book("T1", "A1"));
//        blockingQueue.add(new Book("T1", "A1"));
//        try {
//            blockingQueue.add(new Book("T1", "A1")); //não permite adicionar o 4o elemento
//        }catch (Exception e){
//            System.out.println("Impossível adicionar!");
//        }

        //-------------------------------------------------------------------------------

//        ArrayList<Book> arrayList = new ArrayList<>();
//        arrayList.add(new Book("T1","A1"));
//        arrayList.add(new Book("T2","A2"));
//        arrayList.add(new Book("T3","A3"));
//        arrayList.add(new Book("T4","A2"));

        // Problema: remover da lista todos os livros do Autor A2

//        for(Book b : arrayList){
//            if(b.getAuthor().equals("A2")){
//                System.out.println("Remover:"+b);
//                arrayList.remove(b); // não dá pra remover o elemento b (Exception!)
//            }
//        }

//        int tamanho = arrayList.size();
//        for (int i = 0; i < tamanho; i++) {
//            if(arrayList.get(i).getAuthor().equals("A2")){
//                System.out.println("Remover:"+arrayList.get(i));
//                arrayList.remove(i); // não dá pra remover o elemento b (Exception!)
//            }
//        }

        //Solução: iterador!
//        Iterator<Book> it = arrayList.iterator();
//        while (it.hasNext()){
//            Book b = it.next();
//            if(b.getAuthor().equals("A2")){
//                it.remove();
//            }
//        }
//        System.out.println(arrayList);

        //-------------------------------------------------------------------------------
        // FIM DA PRIMEIRA AULA
        //-------------------------------------------------------------------------------

        // Aula 2: Set Não Aceita Repetidos!

        // O java sabe comparar: String, Int, Float, etc...
//        HashSet<String> hashSetString = new HashSet<>();
//        hashSetString.add("car");
//        hashSetString.add("car");
//        hashSetString.add("wagon");
//        System.out.println(hashSetString);

        // Hash não garante ordem!

        // O Java não sabe comparar "Book": dois objetos diferentes podem ter o mesmo conteúdo!
//        HashSet<Book> hashSet = new HashSet<>();
//        hashSet.add(new Book("T1","A1")); // A classe Book precisa ter um método de comparação!
//        hashSet.add(new Book("T2","A2"));
//        hashSet.add(new Book("T3","A3"));
//        hashSet.add(new Book("T1","A4"));
//        hashSet.add(new Book("T5","A4"));
//        hashSet.add(new Book("T6","A4"));
//
//        System.out.println(hashSet);

        // Tree garante ordem pelo Comparador (Comparator ou Comparable) e ORDENA!

//        TreeSet<Book> treeSet = new TreeSet<>(new BookComparator()); // posso passar um comparator como parâmetro!
//        treeSet.add(new Book("T1","A1")); // A classe Book precisa ter um método de comparação!
//        treeSet.add(new Book("T6","A4"));
//        treeSet.add(new Book("T1","A2"));
//        treeSet.add(new Book("T1","A3"));
//        treeSet.add(new Book("T1","A4"));
//        treeSet.add(new Book("T5","A4"));
//
//        System.out.println(treeSet);

//        ArrayList<Integer> arrF = new ArrayList<>();
//        Random r = new Random();
//        for (int i = 0; i < 100; i++) {
//            arrF.add( r.nextInt(10) );
//        }
//        System.out.println(arrF);
//
//        //HashSet<Integer> hs = new HashSet<>(arrF); // Não garante ordenação!
//        //TreeSet<Integer> hs = new TreeSet<>(arrF); // Ordena sempre!
//        LinkedHashSet<Integer> hs = new LinkedHashSet<>(arrF); // Mantém ordem de inserção!
//
//        System.out.println(hs);

        //-------------------------------------------------------------------------------

//        HashMap<String, String> hm = new HashMap<>(); // estrutura + rapida de todas!
//        hm.put("A1", "Andres");
//        hm.put("A2", "Fulano");
//        hm.put("A3", "Ciclano");
//        hm.put("A2", "Beltrano"); // override A2!
//        hm.put("A3", "Acricocrildo"); // override A3!
//        System.out.println(hm);
//
//        System.out.println(hm.get("A3"));

        //TreeMap -> exatamente igual ao HashMap, mas mantém ordem pelo Comparador
        //LinkedHashMap -> exatamente igual ao HashMap, mas mantém ordem de inserção

//        TreeMap<String, Book> tm = new TreeMap<>(); // não precisa comparador se a CHAVE for tipo primitivo
//        tm.put("Cod1", new Book("T1", "A1"));
//        tm.put("Cod0", new Book("T2", "A2"));
//        tm.put("Cod0", new Book("T3", "A3"));
//
//        System.out.println(tm);

    }
}
