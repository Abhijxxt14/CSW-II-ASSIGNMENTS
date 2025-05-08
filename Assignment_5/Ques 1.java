class BSTNode {
    int info;
    BSTNode left, right;

    public BSTNode(int info) {
        this.info = info;
        left = right = null;
    }
}

public class Main {
    // Recursive insert method
    public static BSTNode insert(BSTNode node, int value) {
        if (node == null) {
            return new BSTNode(value);
        }

        if (value < node.info) {
            node.left = insert(node.left, value);
        } else if (value > node.info) {
            node.right = insert(node.right, value);
        }

        return node;
    }

    // In-order traversal (Left, Root, Right)
    public static void inOrder(BSTNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.info + " ");
            inOrder(node.right);
        }
    }

    // Pre-order traversal (Root, Left, Right)
    public static void preOrder(BSTNode node) {
        if (node != null) {
            System.out.print(node.info + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // Post-order traversal (Left, Right, Root)
    public static void postOrder(BSTNode node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.info + " ");
        }
    }

    public static void main(String[] args) {
        // Start with an empty tree
        BSTNode root = null;

        // Insert nodes
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
        root = insert(root, 80);

        // Display tree traversals
        System.out.print("In-order Traversal: ");
        inOrder(root);
        System.out.println();

        System.out.print("Pre-order Traversal: ");
        preOrder(root);
        System.out.println();

        System.out.print("Post-order Traversal: ");
        postOrder(root);
        System.out.println();
    }
}
