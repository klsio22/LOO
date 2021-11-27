package Examples.CodeDay_Collections_2021_2;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {

        //se fosse com números:
//        if(n1 > n2) return 1;
//        if(n1 < n2) return -1;
//        return 0;
        //ou ainda: return n1-n2;

        return o1.getTitle().compareTo(o2.getTitle()); // uso o comparador da classe String!
    }
}
