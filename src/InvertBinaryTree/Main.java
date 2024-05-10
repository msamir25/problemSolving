package InvertBinaryTree;


public class Main {
    public static void main(String[] args) {
            TreeNode treeNode = new TreeNode(2, new TreeNode(1) , new TreeNode(3));

            TreeNode result = invertTree(treeNode);

        System.out.println(result.val);
        System.out.println(result.left.val );
        System.out.println( result.right.val);
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static TreeNode invertTree(TreeNode root) {
        // Base Case
            if (root == null){
                return null;
            }


        invertTree(root.left);
        invertTree(root.right);

        TreeNode cur = root.left;
        root.left = root.right;
        root.right = cur;

        return root;
    }
}
