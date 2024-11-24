package ArrayList;

import java.util.ArrayList;

public class MaxArrayList {
    public static void main(String [] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(9);


    //   Calculate the maximum number 
        int max=Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println("Maximum Number: "+max);

        //   Calculate the manimum number 
        int min=Integer.MAX_VALUE;

        for(int i=0;i<list.size();i++){
            if(list.get(i)<min){
                min=list.get(i);
            }
        }
        System.out.println("Minimum Number: "+min);
    }
    
}
