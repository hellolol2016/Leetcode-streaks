import java.util.*; 
public class arrayGame {
  public int notOptimizedGetWinner(int[] arr, int k) {
        //simliar to that prev count things that are smaller than it problem

        //looks like there is a loop so we need a function that checks for it

        //make a sorted array 

        //actually lets just try to simulate the game:(
        List<Integer> list = new ArrayList<Integer>();
        for(int i:arr){
            list.add(i);
        }

        int streak = 0;
        while(streak <= k){
            if(streak==k){
                return list.get(0);
            }
            if(list.get(0) > list.get(1)){
                streak+=1;
                //move arr[i+1] to the end of the array
                list.add(list.get(1));
                list.remove(1);
            }else{
                //not bigger
                streak = 1;
                list.add(list.get(0));
                list.remove(0);
            }
           
        }
            
        
        return -1;

    }

    public int getWinner(int[] A, int k){
        int cur = A[0];
        int win = 0;
        
        for (int i = 1; i < A.length; ++i) {
            if (A[i] > cur) {
                cur = A[i];
                win = 0;
            }
            if (++win == k) {
                break;
            }
        }
        return cur;
    }
}
