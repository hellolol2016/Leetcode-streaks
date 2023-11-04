public class antPlank {
  public int getLastMoment(int n, int[] left, int[] right) {

        //intersections are the same as passing through another ant, so can just find longest distance from the edge   

        int maxTime =0;
        for(int i:left){
            if(i > maxTime){
                maxTime = i;
            }
        }

        for(int i:right){
            if(n-i > maxTime){
                maxTime = n-i;
            }
        }

        //we need the max or the left array
        // and the min of the right array

        return maxTime;
    } 
}
