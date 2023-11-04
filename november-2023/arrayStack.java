import java.util.*;
public class arrayStack {
  public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<String>();
        int targetIndex = 0;
        int index = 1;
        while(index != target[target.length-1]){
            if(index == target[targetIndex]){
                ans.add("Push");
                index+=1;
                targetIndex+=1;
            }else{
                ans.add("Push");
                ans.add("Pop");
                index+=1;
            }
        }
        ans.add("Push");

        return ans;
    } 
}
