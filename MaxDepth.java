//given a binary tree, find its maximum depth.
public class MaxDepth {

  public static void main(String[] args){
    TreeNode root = new TreeNode(1);
    Util.genRandomTree(root, 7);
    System.out.println("\nThe max depth is: " + maxDepth(root));
    System.out.println("\n**************************************\n");
    Util.printNode(root);
    System.out.println("**************************************\n");
  } 

  //time complexity O(log n)  
  public static int maxDepth(TreeNode root){
    if(root == null) return 0;
    return 1 + Math.max(maxDepth(root.left), maxDepth(root. right)); 
  }
}
