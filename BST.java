public class BST {

    private BSTNode root;

    public BST() {
        root = null;
    }

    public void add(int item) {
        recAdd(root, item);
    }

    public void recAdd(BSTNode node, int item) {
        if (root == null) {
            root = new BSTNode(item);
        } else if (item < node.getItem()) {
            if (node.getLeft() == null) {
                node.setLeft(new BSTNode(item));
            } else {
                recAdd(node.getLeft(), item);
            }
        } else if (item > node.getItem()) {
            if (node.getRight() == null) {
                node.setRight(new BSTNode(item));
            } else {
                recAdd(node.getRight(), item);
            }
        } else {
            System.out.println("Warning: Can Not Add Duplicate Value (" + item + ")");
        }
    }

    @Override
    public String toString() {
        return recToString(root);
    }

    public String recToString(BSTNode node) {
        if (node == null)
            return "";

        return "(" + recToString(node.getLeft()) + node.getItem() + recToString(node.getRight()) + ")";
    }

    public boolean isBalanced() {
        return recIsBalanced(root);
    }

    //Recursive method which determines if the subtree with the given root is balanced
    //Remember that a tree is balanced if and only if:
    //	a) the difference between the heights of the right and left subtrees is zero, one or minus 1,
    //	b) AND each of the right and left subtrees are also balanced.
    //Call the height() method from this method.
    public boolean recIsBalanced(BSTNode node) {

        /* YOUR CODE HERE */
        if (node == null) {
            return false;
        }
        if (height(node.getLeft()) - height(node.getRight()) == 0) {
            return true;
        } else if (height(node.getLeft()) - height(node.getRight()) == 1) {
            return true;
        } else if (height(node.getLeft()) - height(node.getRight()) == -1) {
            return true;
        }
        if (height(node.getRight()) - height(node.getLeft()) == 0) {
            return true;
        } else if (height(node.getRight()) - height(node.getLeft()) == 1) {
            return true;
        } else
            return (height(node.getRight()) - height(node.getLeft()) == -1);
        }

    //Calculate the height of a given node (use recursion)
    public int height(BSTNode node) {

        /* YOUR CODE HERE */
        if(node == null) {
            return 0;
        }else if (node.getLeft() == null && node.getRight() == null){
            return 1;
        } else
        return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
    }
}