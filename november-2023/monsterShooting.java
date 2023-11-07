import java.util.*;
public class monsterShooting {
      public int notOptimizedEliminateMaximum(int[] dist, int[] speed) {
        int monsterIndex = 1; //kill the first monster
        List<Double> arrivals = new ArrayList<Double>();

        for(int i = 0;i<dist.length;i++){
            arrivals.add((double)dist[i]/speed[i]);
        }
        Collections.sort(arrivals);

        

        while(monsterIndex < dist.length){
            //monsterIndex is how many monsters we can shoot aka the minutes that pass 
            if(arrivals.get(monsterIndex) <= monsterIndex){
                return monsterIndex;
            }
            monsterIndex++;
        }
        return monsterIndex;
    }

    public int eliminateMaximum(int[] dist, int[] speed){
        for(int i = 0;i<dist.length;i++){
            dist[i] = (dist[i] - 1)/speed[i];
        }
        Arrays.sort(dist);

        for(int i = 0;i<dist.length;i++){
            if(dist[i] < i){
                return i;
            }
        }
        return dist.length;
    } 
}
