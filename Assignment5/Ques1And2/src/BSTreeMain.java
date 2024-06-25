public class BSTreeMain {
    public static void main(String[] args) {
        BSTree tree = new BSTree();

        // Adding nodes to the tree
        tree.addNode(50);
        tree.addNode(30);
        tree.addNode(70);
        tree.addNode(20);
        tree.addNode(40);
        tree.addNode(60);
        tree.addNode(80);

        // Displaying the tree using BFS and DFS traversals
        System.out.println("Initial tree (BFS):");
        tree.BFSTraversal();
        System.out.println("Initial tree (DFS):");
        tree.DFSTraversal();

        // Deleting a node with two children
        System.out.println("Deleting node with key 50 (node with two children):");
        tree.deleteTwoChildNodes(50);
        
        // Displaying the tree after deletion
        System.out.println("Tree after deleting node 50 (BFS):");
        tree.BFSTraversal();
        System.out.println("Tree after deleting node 50 (DFS):");
        tree.DFSTraversal();
        
        // Deleting a node with one child
        System.out.println("Deleting node with key 30 (node with one child):");
        tree.deleteNode(30);
        
        // Displaying the tree after deletion
        System.out.println("Tree after deleting node 30 (BFS):");
        tree.BFSTraversal();
        System.out.println("Tree after deleting node 30 (DFS):");
        tree.DFSTraversal();
        
        // Deleting a leaf node
        System.out.println("Deleting leaf node with key 20:");
        tree.deleteNode(20);
        
        // Displaying the tree after deletion
        System.out.println("Tree after deleting node 20 (BFS):");
        tree.BFSTraversal();
        System.out.println("Tree after deleting node 20 (DFS):");
        tree.DFSTraversal();
    }
}
