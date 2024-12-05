package sameTree;

public class Main {
    public static void main(String[] args) {

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        // Creating the second binary tree: [1, 2, 3]
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        // Test case: Should return true
        System.out.println(isSameTree(p, q));  // Output: true

        // Creating another binary tree: [1, 2]
        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);

        // Creating another binary tree: [1, null, 2]
        TreeNode q2 = new TreeNode(1);
        q2.right = new TreeNode(2);

        // Test case: Should return false
        System.out.println(isSameTree(p2, q2));  // Output: false

    }

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(){}

        public TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        //if two nodes are empty
        if (p == null && q == null){
            return true;
        }

        //if only one of them is null
        if (p == null || q == null){
            return false;
        }


        //ckeck the values of them
        if (p.val != q.val){
            return false;
        }


        // recursive of these values
        return isSameTree(p.left , q.left) && isSameTree(p.right , q.right);

    }



}

