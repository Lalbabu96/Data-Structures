import java.util.ArrayList;

public class MultiDimension {
    public static void main(String [] args){

        // // Create Multi ArrayList
        // ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();

        // // Create 1-D ArrayList
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1); list.add(2); list.add(3);

        // mainlist.add(list);

        // // create 1-D ArrayList
        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(2); list2.add(4); list2.add(6);

        // mainlist.add(list2);

        // for(int i=0; i<mainlist.size();i++){
        //     ArrayList<Integer> currList = mainlist.get(i);
        //     for(int j=0;j<currList.size();j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();
        // }

        // System.out.println(mainlist);

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1;i<=5;i++){
            list.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        
        // Add in main List
        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        for(int i=0; i<mainList.size();i++){
          ArrayList<Integer> currList = mainList.get(i);
            for(int j=0;j<currList.size();j++){
            System.out.print(currList.get(j)+" ");
            }
          System.out.println();
       }
    }
}
