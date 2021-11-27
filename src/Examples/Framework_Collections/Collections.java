package Examples.Framework_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections {

    public Collections() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(1);
        arr.add(4);
        arr.add(8);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(20);
        arr2.add(10);
        arr2.add(30);


        /*
         *  Para adicionar elementos de outra em outra array
         *  pode usar o método addAll
         * */
        arr.addAll(arr2);

        System.out.println(arr);

        System.out.println("------------");

//        for (Integer element:arr){
//            System.out.println(element);
//            if(element == 3)
//                arr.remove(element);
//
//        };

        Iterator<Integer> it = arr.iterator();

        while (it.hasNext()) {
            Integer i = it.next();

            System.out.println(i);

            if (i == 3)
                it.remove();

        }
        System.out.println(arr);

    }


}
