import java.util.*;
public class combinationSum {
  public List<List<Integer>> countCombinations(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();

        dfs(candidates, ans, cur, target, 0);
        return ans;
    }

    public void dfs(int[] candidates, List<List<Integer>> ans, List<Integer> cur, int target, int index){
        if(target == 0){
            ans.add(new ArrayList(cur));
        }else if (target<0 || index > candidates.length-1){
            return;
        }else{
            cur.add(candidates[index]);
            dfs(candidates, ans, cur, target-candidates[index], index);
            //dont add to index because can have repeats

            cur.remove(cur.get(cur.size()-1));
            dfs(candidates, ans, cur, target, index+1);
        }
  } 
}
