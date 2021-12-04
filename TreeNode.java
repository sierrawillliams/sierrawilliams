import com.sun.source.tree.Tree;

public class TreeNode
{
    public int data;  // value stored in node
    public TreeNode left;  // left child
    public TreeNode right; // right child


    // Constructor for initialization
    public TreeNode( int newData )
    {
        data = newData;
        left = null;
        right = null;
    }
    boolean isLeaf() {
        return left == null && right == null;
    }
    boolean isEmpty() {
        if (left.data == 0 && right.data == 0) {
        }
            return true;

    }
    // The usual accessors (you may not have to use them).
    public int getData() { return data; }
    public void setData(int data) {this.data = data;}
    public TreeNode getLeft() { return left; }
    public void setLeft(TreeNode left) {this.left = left; }
    public TreeNode getRight() { return right; }
    public void setRight(TreeNode right) { this.right = right; }
}

