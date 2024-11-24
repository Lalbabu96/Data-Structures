package ArrayList;
import java.util.ArrayList;

public class Intro {
    public static void main(String [] args){

        // Create ArrayList (Syntax)
        ArrayList<Integer> list= new ArrayList<>();

         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);

         System.out.println(list); //[1,2,3,4,5]
         
        //  Get method
    //    int element = list.get(3);
    //    System.out.println(element);  //4

    //   Remove method
    //    list.remove(2);
    //    System.out.println(list);  //[1,2,4,5]

    //    Set method
     list.set(1,7);
     System.out.println(list); //[1,7,3,4,5]

    //  Contains method
     System.out.println(list.contains(4));  //true
     System.out.println(list.contains(11));  //false

    }
}
