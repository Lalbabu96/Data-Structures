package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {
    public static void main(String [] args){

        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(4);
        list.add(8);

        System.out.println("Before Sorting: "+list);

        // Accending Order Sorting ->By Default
        Collections.sort(list);
        System.out.println("After Sorting: "+list);

        // Deccending Order Sorting
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
    
}
