package Exercises.Framework_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class MyCollections {

    public void mycollection() {
        ArrayList<String> mc = new ArrayList<>();

        mc.add("Bandido");
        mc.add("Bodacious");

        mc.add("Mascherano");
        mc.add("Destruiodor");
        mc.add("Insano");
        mc.add("Juizo Final");
        mc.add("Tsunami");

        Iterator<String> it = mc.iterator();

        while (it.hasNext()) {
            String name = it.next();
            if (name.startsWith("I"))
                it.remove();

            System.out.println(name);
        }

        it = mc.iterator();

        System.out.println("=====");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }


}
