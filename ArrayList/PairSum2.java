package ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int n=list.size();
        int lp =0;
        int rp=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                rp=i;
                lp=i+1;
                break;
            }
        }
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }

            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String [] args){
        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Sorted and Roteded
         list.add(11);
         list.add(15);
         list.add(6);
         list.add(8);
         list.add(9);
         list.add(10);

         int target=50;
         System.out.println(pairSum(list, target));
    }
}
