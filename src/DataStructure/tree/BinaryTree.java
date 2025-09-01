package DataStructure.tree;


class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

}

public class BinaryTree {

    TreeNode root;

    public void insert(int data) {

        root = insertRec(root, data);

    }
    public TreeNode insertRec(TreeNode root, int data) {

        if (root == null) {
            root = new TreeNode(data);
        } else if (data < root.data){
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void inorder() {
        System.out.println("MY inorder data is: ");
        inorderRec(root);
        System.out.println();
    }

    public void inorderRec(TreeNode root) {

        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
    public void preorder() {
        System.out.println("MY preorder data is: ");
        preorderRec(root);
        System.out.println();
    }

    public void preorderRec(TreeNode root) {

        if (root != null) {
            preorderRec(root.left);
            System.out.print(root.data + " ");
            preorderRec(root.right);
        }
    }
    public void postorder() {
        System.out.println("MY postorder data is: ");
        postorderRec(root);
        System.out.println();
    }

    public void postorderRec(TreeNode root) {

        if (root != null) {
            postorderRec(root.left);
            System.out.print(root.data + " ");
            postorderRec(root.right);
        }
    }
}

