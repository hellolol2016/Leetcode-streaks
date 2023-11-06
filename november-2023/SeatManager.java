import java.util.*;
class SeatManager {
    private PriorityQueue<Integer> q;
    private int last;

    public SeatManager(int n) {
        this.last=1;
        q = new PriorityQueue<Integer>();
        for(int i = 1; i <=n;i++){
            q.offer(i);
        }
    }
    
    public int reserve() {
        if(!q.isEmpty()){
            return q.poll();
        }

        int temp = this.last;
        this.last++;
        return temp;
    }
    
    public void unreserve(int seatNumber) {
        q.offer(seatNumber);    
    }
}