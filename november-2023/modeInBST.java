import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class modeInBST {
  private int curVal;
    private int curCount = 0;
    private int maxCount = 0;
    private List<Integer> modes = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        count(root);

        int[] ans = new int[modes.size()];
        for(int i = 0; i < modes.size(); i++){
            ans[i] = modes.get(i);
        }
        return ans;
    }

    public void count(TreeNode node){
        if(node == null) return;

        count(node.left);

        curCount = (node.val == curVal)? curCount +1 : 1;
        //streak counter!!!!

        if(curCount == maxCount){
            modes.add(node.val);
        }else if (curCount > maxCount){
            maxCount = curCount;
            modes.clear();
            modes.add(node.val);
        }

        curVal = node.val;

        count(node.right);
        
    }  
}
