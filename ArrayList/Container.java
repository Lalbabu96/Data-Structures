package ArrayList;

import java.util.ArrayList;

public class Container {
    public static int storeWater(ArrayList<Integer> height){

        // // Brute force Approach ->(Time Complexity - O(N^2))
        // int maxWater=0;
        // for(int i=0;i<list.size();i++){
        //     for(int j=i+1;j<list.size();j++){
        //         int height = Math.min(list.get(i),list.get(j));
        //         int width = j-i;
        //         int area=height*width;
        //         maxWater=Math.max(area,maxWater);
        //     }
        // }

        // return maxWater;

        // 2-Pointer Approach -> (Time complexity - O(n))
           int maxWater=0;
           int lp=0;
           int rp=height.size()-1;

           while(lp<rp){
            //   Calculate area of water
                int ht=Math.min(height.get(lp), height.get(rp));
                int width = rp-lp;
                int currWater = ht*width;
                maxWater=Math.max(maxWater, currWater);
             
                // Update the pointer
                if(height.get(lp)<height.get(rp)){
                    lp++;
                }
                else{
                    rp--;
                }
           }

           return maxWater;

    }
    public static void main(String [] args){
        
        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(8);
         list.add(6);
         list.add(2);
         list.add(5);
         list.add(4);
         list.add(8);
         list.add(3);
         list.add(7);
          
         int result = storeWater(list);
         System.out.println(result);

    }
    
}
