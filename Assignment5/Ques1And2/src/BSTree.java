import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BSTree {
    static class Node {
        private int data;
        private Node left;
        private Node right;
        public Node(int value) {
            data = value;
            left = right = null;
        }
    }

    private Node root;
    public BSTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void addNode(int value) {
        if (isEmpty())
            root = new Node(value);
        else
            addNode(root, value);
    }

    public void addNode(Node trav, int value) {
        if (value < trav.data) {
            // add value into left of current node
            if (trav.left == null) {
                trav.left = new Node(value);
                return;
            } else
                addNode(trav.left, value);
        } else {
            // add value into right of current node
            if (trav.right == null) {
                trav.right = new Node(value);
                return;
            } else
                addNode(trav.right, value);
        }
    }

    private Node recursiveSearch(Node trav, int key) {
        // Base case: if the node is null or the node's data is the key
        if (trav == null || trav.data == key) {
            return trav;
        }
        // If the key is less than the current node's data, search in the left subtree
        if (key < trav.data) {
            return recursiveSearch(trav.left, key);
        }
        // If the key is greater than the current node's data, search in the right subtree
        return recursiveSearch(trav.right, key);
    }

    // Public method to initiate the recursive search
    public Node recursiveSearch(int key) {
        return recursiveSearch(root, key);
    }

    public Node[] binarySearchWithParent(int key) {
        // 1. start from root
        Node trav = root;
        Node parent = null;
        while (trav != null) {
            // 2. if key is equal to current data
            if (key == trav.data)
                break;
            parent = trav;
            // 3. if key is less than current data
            if (key < trav.data)
                // search key into left of current node
                trav = trav.left;
            // 4. if key is greater than current data
            else
                // search key into right of current node
                trav = trav.right;
        }
        // 5. repeat step 2 to 4 till leaf nodes
        if (trav == null)
            parent = null;
        // 6. key is not found
        return new Node[]{trav, parent};
    }

    public void deleteTwoChildNodes(int key) {
        // 1. search node with its parent
        Node arr[] = binarySearchWithParent(key);
        Node temp = arr[0], parent = arr[1];
        // 2. if node is not found
        if (temp == null) {
            System.out.println("Node not found.");
            return;
        }
        // 3. if node has 2 children
        if (temp.left != null && temp.right != null) {
            // 1. find in-order predecessor of temp.data (rightmost child of the left subtree)
            Node predecessor = temp.left;
            Node predecessorParent = temp;
            while (predecessor.right != null) {
                predecessorParent = predecessor;
                predecessor = predecessor.right;
            }
            // 2. replace temp's data with predecessor's data
            temp.data = predecessor.data;
            // 3. delete the predecessor node
            if (predecessorParent.left == predecessor) {
                predecessorParent.left = predecessor.left;
            } else {
                predecessorParent.right = predecessor.left;
            }
        } else {
            System.out.println("The node does not have two children.");
        }
    }

    public void deleteNode(int key) {
        // 1. search node with its parent
        Node arr[] = binarySearchWithParent(key);
        Node temp = arr[0], parent = arr[1];
        // 2. if node is not found
        if (temp == null)
            return;
        // 3. if node has 2 children
        if (temp.left != null && temp.right != null) {
            // 1. find predecessor of temp.data
            Node pred = temp.left;
            parent = temp;
            while (pred.right != null) {
                parent = pred;
                pred = pred.right;
            }
            // 2. replace temp's data by predecessor's data
            temp.data = pred.data;
            // 3. delete predecessor
            temp = pred;
        }
        // 4. if node has single child (right child)
        if (temp.left == null) {
            if (temp == root)
                root = temp.right;
            else if (temp == parent.left)
                parent.left = temp.right;
            else if (temp == parent.right)
                parent.right = temp.right;
        }
        // 5. if node has single child (left child)        
        else { // if(temp.right == null){
            if (temp == root)
                root = temp.left;
            else if (temp == parent.left)
                parent.left = temp.left;
            else if (temp == parent.right)
                parent.right = temp.left;
        }
    }

    public void DFSTraversal() {
        // 0. create stack to push node
        Stack<Node> st = new Stack<BSTree.Node>();
        // 1. push root on stack
        st.push(root);
        System.out.print("DFS :: ");
        while (!st.isEmpty()) {
            // 2. pop one node from stack
            Node trav = st.pop();
            // 3. visit(print) node
            System.out.print(" " + trav.data);
            // 4. if right exist, push it on stack
            if (trav.right != null)
                st.push(trav.right);
            // 5. if left exist, push it on stack
            if (trav.left != null)
                st.push(trav.left);
        }
        // 6. while stack is not empty repeat step 2 to 5
        System.out.println("");
    }

    public void BFSTraversal() {
        // 0. create queue to push Nodes
        Queue<Node> q = new LinkedList<BSTree.Node>();
        // 1. push root on queue
        q.offer(root);
        System.out.print("BFS : ");
        while (!q.isEmpty()) {
            // 2. pop one node from queue
            Node trav = q.poll();
            // 3. visit(print) node
            System.out.print(" " + trav.data);
            // 4. if left exist, push it on queue
            if (trav.left != null)
                q.offer(trav.left);
            // 5. if right exist, push it on queue
            if (trav.right != null)
                q.offer(trav.right);
        }
        // 6. while queue is not empty repeat step 2 to 5
        System.out.println("");
    }

    public int height(Node trav) {
        // 0. if left or right sub tree is absent 
        if (trav == null)
            return -1;
        // 1. find height of left subtree
        int hl = height(trav.left);
        // 2. find height of right subtree
        int hr = height(trav.right);
        // 3. find max height
        int max = hl > hr ? hl : hr;
        // 4. add one into max height(return)
        return max + 1;
    }

    public int height() {
        return height(root);
    }

    public void deleteAll() {
        root = null;
    }
}
