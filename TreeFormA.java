/**
 * @author nmaIbrahim
 */
public class TreeFormA
{

    class BinaryTreeNode
    {

        private int value;
        private BinaryTreeNode leftChild;
        private BinaryTreeNode rightChild;
        private BinaryTreeNode parent;

        public BinaryTreeNode(int value, BinaryTreeNode leftChild,
                BinaryTreeNode rightChild, BinaryTreeNode parent)
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

    }

    private BinaryTreeNode root; // root of BST
    private int size; // number of nodes in BST

    TreeFormA()
    {
        root = null;
        size = 0;
    }

    BinaryTreeNode getRoot()
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

    void inOrder(BinaryTreeNode node)
    {
        if (node != null)
        {
            inOrder(node.leftChild);
            System.out.print(node.value + " ");
            inOrder(node.rightChild);
        }
    }

    int depth(BinaryTreeNode node)
    {
        int depth = 0;
        while (node.parent != null)
        {
            node = node.parent;
            depth++;
        }
        return depth;
    }

    void insert(int keyVal)
    {
        BinaryTreeNode newNode = new BinaryTreeNode(keyVal, null, null, null);
        if (isEmpty())
        {
            root = newNode;
            size++;
            return;
        }
        BinaryTreeNode current = root;
        BinaryTreeNode parent;
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

    BinaryTreeNode find(BinaryTreeNode node, int keyVal)
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

    public static void main(String[] args)
    {
        TreeFormA tree = new TreeFormA();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(11);
        tree.insert(12);
        tree.insert(13);
        tree.insert(40);
        tree.insert(22);
        tree.insert(23);
        tree.insert(24);
        tree.insert(25);

        tree.inOrder(tree.getRoot());
        System.out.println();

        System.out.println(tree.depth(tree.find(tree.getRoot(), 25)));

    }

}