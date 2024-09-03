import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

class BST {
    TreeNode root;

    void insert(int key) {
        root = insertRec(root, key);
    }

    TreeNode insertRec(TreeNode root, int key) {
        if (root == null) return new TreeNode(key);
        if (key < root.val) root.left = insertRec(root.left, key);
        else if (key > root.val) root.right = insertRec(root.right, key);
        return root;
    }

    void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return root;
        if (key < root.val) root.left = deleteNode(root.left, key);
        else if (key > root.val) root.right = deleteNode(root.right, key);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            root.val = minValue(root.right);
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    int minValue(TreeNode root) {
        while (root.left != null) root = root.left;
        return root.val;
    }
}

public class Binarysearchtree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BST tree = new BST();

        for (int i = 0; i < n; i++) {
            tree.insert(sc.nextInt());
        }

        System.out.print("Before deletion: ");
        tree.inOrder(tree.root);
        System.out.println();

        int key = sc.nextInt();
        tree.root = tree.deleteNode(tree.root, key);

        System.out.print("After deletion: ");
        tree.inOrder(tree.root);
        System.out.println();

        sc.close();
    }
}
