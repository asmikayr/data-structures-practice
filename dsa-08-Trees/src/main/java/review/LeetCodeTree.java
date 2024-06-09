package review;

public class LeetCodeTree {
    TreeNode root;

    public LeetCodeTree() {
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);

        if (root == null) { // Tree empty
            root = newNode;
            return root;
        }
        // Not empty
        TreeNode current = root;
        while (true) {
            if (val < current.val) {
                if (current.left == null) {
                    // insert node here!!!
                    current.left = newNode;
                    return root;
                }
                current = current.left;// branch into left subtree
            } else {
                if (current.right == null) {
                    // insert node here!!!
                    current.right = newNode;
                    return root;
                }
                current = current.right;// branch into right subtree
            }
        }
    }

    public TreeNode searchBST(TreeNode rote, int val){
        if(root==null) return null;

        TreeNode current=root;
        while(current!=null){
            if(val< current.val) current = current.left;
            else if (val> current.val) current=current.right;
            else return current;
        }
        return null;
    }
    //Root Left Right
    public void preOrderTraversal(TreeNode root){
        if(root==null) return;
        System.out.print(root.val+", ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    //left root right
    public void inOrderTraversal(TreeNode root){
        if(root== null) return;
        inOrderTraversal(root.left);
        System.out.print(", ");
        inOrderTraversal(root.right);
    }
    //left right root
    public void postOrderTraversal(TreeNode root){
        if(root== null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(", ");
    }



}
