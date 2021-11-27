package Exercises.Framework_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Collections {
    ArrayList<Integer> collection =
            new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    ArrayList<Integer> collection2 =
            new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

    public void Interation1(){
        Iterator<Integer> it = collection.iterator();
        Iterator<Integer> it2 = collection2.iterator();
        while (it.hasNext() && it2.hasNext()) {

            Integer i = it.next();
            Integer i2 = it2.next();

            if (i2 % 2 == 0)
                i2 = it2.next();

            System.out.println(i + "/" + i2);

        }
    }

    public void Interation2(){
        Iterator<Integer> it = collection.iterator();
        Iterator<Integer> it2 = collection2.iterator();
        while (it.hasNext() && it2.hasNext()) {

            Integer i = it.next();
            Integer i2 = it2.next()*2;

            System.out.println(i + "/" + i2);
        }

    }

}
