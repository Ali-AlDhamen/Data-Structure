
package tree;

public class BinarySearchTree
{

    class Node
    {

        private int value;
        private Node leftChild;
        private Node rightChild;
        private Node parent;

        public Node(int value, Node leftChild,
                Node rightChild, Node parent)
        {
            this.value = value;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
            this.parent = parent;
        }

        // Setters and Getters
        public int getValue()
        {
            return value;
        }

        public Node getLeftChild()
        {
            return leftChild;
        }

        public Node getRightChild()
        {
            return rightChild;
        }

        public Node getParent()
        {
            return parent;
        }

        public void setValue(int value)
        {
            this.value = value;
        }

        public void setLeftChild(Node leftChild)
        {
            this.leftChild = leftChild;
        }

        public void setRightChild(Node rightChild)
        {
            this.rightChild = rightChild;
        }

        public void setParent(Node parent)
        {
            this.parent = parent;
        }

    }

    private Node root; // root of BST
    private int size; // number of nodes in BST

    BinarySearchTree()
    {
        root = null;
        size = 0;
    }

    Node getRoot()
    {
        return root;
    }

    int getSize()
    {
        return size;
    }

    boolean isEmpty()
    {
        return (size == 0);
    }

    /* This function counts the number of nodes in a binary tree */
    int countNodes(Node root)
    {
        if (root == null)
            return (0);
        return (1 + countNodes(root.leftChild) + countNodes(root.rightChild));
    }

    void insert(int keyVal)
    {
        Node newNode = new Node(keyVal, null, null, null);
        if (isEmpty())
        {
            root = newNode;
            size++;
            return;
        }
        Node current = root;
        Node parent;
        while (true)
        {
            parent = current;
            if (keyVal == current.value)
            {
                System.out.println("Duplicate Found");
                return;
            }
            else if (keyVal < current.value)
            {
                current = current.leftChild;
                if (current == null)
                {
                    parent.leftChild = newNode;
                    break;
                }
            }
            else
            {
                current = current.rightChild;
                if (current == null)
                {
                    parent.rightChild = newNode;
                    break;
                }
            }
        } // end loop
        newNode.parent = parent;
        size++;
    }

    public void delete(Node TreeNode, int keyVal)
    {
        Node Current;
        Node Parent;
        Current = find(TreeNode, keyVal);

        // case - I: Leaf Node
        if (Current.getLeftChild() == null && Current.getRightChild() == null)
        {
            Parent = Current.getParent();
            if (Parent.getValue() > Current.getValue())
            {
                Parent.setLeftChild(null);
            }
            else
            {
                Parent.setRightChild(null);
            }
        } // Case - II: Node have 1 child
        else if (Current.getLeftChild() == null || Current.getRightChild() == null)
        {
            Parent = Current.getParent();
            if (Parent.getValue() > Current.getValue())
            {
                if (Current.getLeftChild() != null)
                {
                    Parent.setLeftChild(Current.getLeftChild());
                    Current.getLeftChild().setParent(Parent);
                }
                else
                {
                    Parent.setLeftChild(Current.getRightChild());
                    Current.getRightChild().setParent(Parent);
                }
            }
            else
            {
                if (Current.getRightChild() != null)
                {
                    Parent.setRightChild(Current.getRightChild());
                    Current.getRightChild().setParent(Parent);
                }
                else
                {
                    Parent.setRightChild(Current.getLeftChild());
                    Current.getLeftChild().setParent(Parent);
                }
            }
        } // Case - III: Node has 2 childs
        else
        {
            Node minNode = findMin(Current.getRightChild());
            Current.setValue(minNode.getValue());
            delete(minNode, minNode.getValue());
        }
        size--;
    }

    Node find(Node node, int keyVal)
    {
        if (node == null)
        {
            System.out.println("Searching fail");
            return null;
        }
        if (node.value == keyVal)
        {
            return node; // found
        }
        if (keyVal < node.value)
        {
            return find(node.leftChild, keyVal);
        }
        else
        {
            return find(node.rightChild, keyVal);
        }
    }

    // Traversal Methods: InOrder, PostOrder, PreOrder
    void inOrderTraversal(Node node)
    {
        if (node != null)
        {
            inOrderTraversal(node.leftChild);
            if (node.value % 2 != 0)
                System.out.println(node.value);
            inOrderTraversal(node.rightChild);
        }
    }

    void preOrderTraversal(Node node)
    {
        if (node != null)
        {
            System.out.println(node.value);
            preOrderTraversal(node.leftChild);
            preOrderTraversal(node.rightChild);
        }
    }

    void postOrderTraversal(Node node)
    {
        if (node != null)
        {
            postOrderTraversal(node.leftChild);
            postOrderTraversal(node.rightChild);
            if (node.value % 2 == 0)
                System.out.println(node.value);
        }
    }

    // Find Min/Max methods
    Node findMin(Node node)
    {
        if (isEmpty())
        {
            return null;
        }
        if (node.leftChild == null)
            return node;
        else
            return findMin(node.leftChild);
    }

    Node findMax(Node node)
    {
        if (isEmpty())
        {
            return null;
        }
        if (node.rightChild == null)
            return node;
        else
            return findMax(node.rightChild);

    }

    // Recursive function to calculate the height of a binary tree
    private int calculateHeight(Node node)
    {
        if (node == null)
        {
            return 0;
        }
        else
        {
            int leftHeight = calculateHeight(node.leftChild);
            int rightHeight = calculateHeight(node.rightChild);

            // Return the maximum height between the left and right subtrees, plus 1 for the current node
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    // Method to calculate the height of the binary tree
    public int getHeight()
    {
        return calculateHeight(root);
    }

    public static void main(String[] args)
    {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(12);
        bst.insert(9);

        bst.insert(72);
        bst.insert(54);
        bst.insert(29);
        bst.insert(76);
        bst.insert(67);
        bst.insert(17);
        bst.insert(23);
        bst.insert(14);

        System.out.println("Height of the tree is: " + bst.calculateHeight(bst.root));
        System.out.println("---InOrder Traversal:------");
        bst.inOrderTraversal(bst.getRoot());
        System.out.println("---postOrder Traversal:------");
        bst.postOrderTraversal(bst.getRoot());
        System.out.println("Minimum Node value: " + bst.findMin(bst.getRoot()).getValue());
        System.out.println("Maximum Node value: " + bst.findMax(bst.getRoot()).getValue());
    }
}
