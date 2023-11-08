public class reachTiles {
      public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        //get shortest length
        

        int w = Math.abs(sx-fx);
        int h = Math.abs(sy-fy);

        if(w==0 && h == 0 && t==1){
            return false;
        }

        return t>= Math.max(w,h);
    } 
}
