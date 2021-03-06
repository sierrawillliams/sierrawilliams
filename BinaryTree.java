import com.sun.source.tree.Tree;
import org.w3c.dom.Node;

public class BinaryTree  {

    protected TreeNode root;

    //Constructor 1 (Default)
    //Initializes an empty tree
    public BinaryTree() {
        /* DO NOT EDIT THIS METHOD */
        root = null;
    }

    //Constructor 2
    //Initializes the tree with a root
    public BinaryTree(String rootItem) {
        /* DO NOT EDIT THIS METHOD */
        root = new TreeNode(rootItem, null, null);
    }

    //Constructor 3
    //Initializes the tree with the root, left subtree and right subtree
    public BinaryTree(String rootItem, BinaryTree leftTree, BinaryTree rightTree) {
        /* DO NOT EDIT THIS METHOD */
        root = new TreeNode(rootItem, null, null);
        attachToLeftSubtree(leftTree);
        attachToRightSubtree(rightTree);
    }

    //Tree Traversal: In Order
    public void inorderTraversal(){
        /* DO NOT EDIT THIS METHOD */
        inorderRecursive(root);
    }

    //Tree Traversal: In Order (recursive)
    public void inorderRecursive(TreeNode current) {
        /* DO NOT EDIT THIS METHOD */
        if (current != null) {
            inorderRecursive(current.getLeft());
            System.out.println(current.getItem());
            inorderRecursive(current.getRight());
        }
    }

    //Attaches an item to the left branch
    public void attachToLeft(String newItem) {

        /* YOUR CODE HERE */
        TreeNode newNode = new TreeNode(newItem);
        if (root == null) {
            root = new TreeNode(newItem);
        }
        if (newNode.getItem().compareTo(root.getItem()) < 0) {
            root.setLeft(newNode);
        }else {
            root.setRight(newNode);
        }
    }
    //Attaches an item to the right branch
    public void attachToRight(String newItem) {

        /* YOUR CODE HERE */

        TreeNode newNode = new TreeNode(newItem);
        if (root == null) {
            root = new TreeNode(newItem);
        }
        if (newNode.getItem().compareTo(root.getItem()) < 0) {
            root.setLeft(newNode);
        }else {
            root.setRight(newNode);
        }
    }

    //Attaches a sub-tree to the left branch
    public void attachToLeftSubtree(BinaryTree leftTree) {

        /* YOUR CODE HERE */
       if(root.getLeft() == null) {
           root.setLeft(leftTree.root);
       }
       if(root.getLeft().getItem().compareTo(leftTree.root.getItem()) < 0) {
        attachToRightSubtree(leftTree);
       } else if(root.getLeft().getItem().compareTo(leftTree.root.getItem()) > 0) {
           attachToLeftSubtree(leftTree);
       }


    }

    //Attaches a sub-tree to the right branch
    public void attachToRightSubtree(BinaryTree rightTree) {

        /* YOUR CODE HERE */
        if(root.getRight() == null) {
            root.setRight(rightTree.root);
        } else if(root.getRight().getItem().compareTo(rightTree.root.getItem()) < 0) {
            attachToLeftSubtree(rightTree);
        } else if(root.getRight().getItem().compareTo(rightTree.root.getItem()) > 0) {
            attachToRightSubtree(rightTree);
        }

    }

    //Returns the number of nodes in the tree.
    public int size() {

        /* YOUR CODE HERE */
        return sizeRecursive(root);

    }

        //Recursive method to calculate the number of nodes.
    public int sizeRecursive(TreeNode node) {

        /* YOUR CODE HERE */
        if (node == null)
            return 0;
        else {
            return 1 + sizeRecursive(node.getLeft()) + sizeRecursive(node.getRight());
        }
    }

    //Returns the height of the tree
    public int height(){

        /* YOUR CODE HERE */

        return heightSubtree(root); //temporary, change this later
    }

    public int heightSubtree(TreeNode current){

        /* YOUR CODE HERE */
        int height = -1;
        if (root == null) {
            return height;
        } else if (current != null) {
            int leftHeight= heightSubtree(current.getLeft());
            int rightHeight= heightSubtree(current.getRight());
            height = 1 + Math.max(leftHeight, rightHeight);
        }
        return height;
    }

    }