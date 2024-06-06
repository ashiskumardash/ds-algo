package tree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        right = null;
        left = null;
    }
}

 class Test {
     static TreeNode buildTree(int[] arr) {
         int N = arr.length;
         TreeNode root = new TreeNode(arr[0]);
         Queue<TreeNode> q = new LinkedList<>();
         q.add(root);
         int i = 1;
         while(i < N){
             TreeNode curr = q.remove();
             if(i< N){
                 curr.left = new TreeNode(arr[i++]);
                 q.add(curr.left);
             }
             if(i< N){
                 curr.right = new TreeNode(arr[i++]);
                 q.add(curr.right);
             }
         }
         return root;
     }

     static void printTree(TreeNode root){
         if(root == null){
             return;
         }
         printTree(root.left);
         System.out.print(root.val + " ");
         printTree(root.right);
     }

     public static void main(String[] args) {
         int[] nums = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
         TreeNode root = buildTree(nums);
         printTree(root);
     }
}
