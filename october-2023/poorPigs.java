public class poorPigs {
  public int pigs(int buckets, int minutesToDie, int minutesToTest) {
        int states = (minutesToTest/minutesToDie) + 1;
        //log... exp should be buckets and base should be states
        double result = (double)Math.round(Math.log(buckets)/ Math.log(states) * 1000000d) / 1000000d;
        return (int)Math.ceil(result);
  }  
}
