import java.util.*;
public class Lab5QTest
{
    public static void main( String[] args )
    {
        BST tree = new BST();

        int[] nodeKeys = {52, 30, 61, 11, 62, 40, 55, 10, 9, 8};

        for ( int i = 0; i < nodeKeys.length ; i++ )
        {
            tree.insert(nodeKeys[i]);
        }

        System.out.print( "Inorder traversal: ");
        tree.printTree();

        System.out.print( "\nTree in Descending Order: " );
        tree.printTreeDesc();

        System.out.print("\nLeaf nodes are: " );
        tree.printLeafs();

        System.out.print("\nInternal nodes are: " );
        tree.printInternalNodes();

        System.out.println("\nNumber of nodes: "  + tree.countNodes(52));

        int rootKey = 10;
        if (tree.findSmallest(rootKey) != null)
            System.out.println("Smallest node in the subtree rooted "+ rootKey + ": " + (tree.findSmallest(rootKey).data));
        else
            System.out.println("Value not found");

        System.out.println("Number of nodes in the subtree rooted "+ rootKey + ": " + tree.countNodes(rootKey));



        BST treeOne = new BST();
        BST treeTwo = new BST();
        BST treeThree = new BST();
        BST treeFour = new BST();

        int[] keysTreeOne = {50,10,55,4,20,51};          // Complete, Full
        int[] keysTreeTwo = {14,10,26,7,12,3,8};         // Full
        int[] keysTreeThree = {14,10,26,7,12,3,20,35};   // Complete
        int[] keysTreeFour = {45,70,60,68,66};           // Degenerate

        for ( int i = 0; i < keysTreeOne.length ; i++ )
        {
            treeOne.insert(keysTreeOne[i]);
        }

        for ( int i = 0; i < keysTreeTwo.length ; i++ )
        {
            treeTwo.insert(keysTreeTwo[i]);
        }

        for ( int i = 0; i < keysTreeThree.length ; i++ )
        {
            treeThree.insert(keysTreeThree[i]);
        }

        for ( int i = 0; i < keysTreeFour.length ; i++ )
        {
            treeFour.insert(keysTreeFour[i]);
        }

        System.out.println("-------- -------- --------");
        System.out.println("Height of tree: "+ treeOne.getHeight());
        System.out.println("Height of tree: "+ treeTwo.getHeight());
        System.out.println("Height of tree: "+ treeThree.getHeight());
        System.out.println("Height of tree: "+ treeFour.getHeight());


        System.out.println("-------- -------- --------");
        treeOne.printIsPerfectTree();
        treeTwo.printIsPerfectTree();
        treeThree.printIsPerfectTree();
        treeFour.printIsPerfectTree();

        System.out.println("-------- -------- --------");
        treeOne.printIsComplete();
        treeTwo.printIsComplete();
        treeThree.printIsComplete();
        treeFour.printIsComplete();

        System.out.println("-------- -------- --------");
        treeOne.printIsFullTree();
        treeTwo.printIsFullTree();
        treeThree.printIsFullTree();
        treeFour.printIsFullTree();

        System.out.println("-------- -------- --------");
        treeOne.printIsDegenerateTree();
        treeTwo.printIsDegenerateTree();
        treeThree.printIsDegenerateTree();
        treeFour.printIsDegenerateTree();

    }
}
