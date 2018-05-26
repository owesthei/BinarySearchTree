public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {
    private Node<T> root;
    private int nNodes;

    @Override
    public void add(T data) {
        nNodes++;

        if (root == null) {
            root = new Node<>(data);
        }
        else {
            addNode(root, data);
        }
    }

    private void addNode(Node<T> node, T data) {
        if (data.compareTo(node.getData()) < 0) {
            if (node.getLeftChild() == null) {
                node.setLeftChild(new Node<T>(data));
            }
            else {
                addNode(node.getLeftChild(), data);
            }
        }
        else {
            if (node.getRightChild() == null) {
                node.setRightChild(new Node<T>(data));
            }
            else {
                addNode(node.getRightChild(), data);
            }
        }
    }

    @Override
    public void remove(T data) {
        if (root == null) {
            System.out.println("Exception: Remove for empty tree");
        }
        else {
            root = removeNode(root, data);
        }
    }

    private Node<T> removeNode(Node<T> node, T data) {
        if (node == null) {
            return node;
        }

        if (data.compareTo(node.getData()) < 0) {
            node.setLeftChild(removeNode(node.getLeftChild(), data));
        } else if (data.compareTo(node.getData()) > 0) {
            node.setRightChild(removeNode(node.getRightChild(), data));
        } else {
            if (node.getLeftChild() == null && node.getRightChild() == null) {
                System.out.println("Removing a leaf node...");
                return null;
            }

            if (node.getLeftChild() == null) {
                System.out.println("Removing the right child...");

                Node<T> tmpRightNode = node.getRightChild();
                node = null;
                return tmpRightNode;
            }

            if (node.getRightChild() == null) {
                System.out.println("Removing the left child...");

                Node<T> tmpLeftNode = node.getLeftChild();
                node = null;
                return tmpLeftNode;
            }

            System.out.println("Removing node with two children...");
            Node<T> tmpPredecessorNode = getPredecessor(node.getLeftChild());

            node.setData(tmpPredecessorNode.getData());
            node.setLeftChild(removeNode(node.getLeftChild(), tmpPredecessorNode.getData()));
        }

        return node;
    }

    private Node<T> getPredecessor(Node<T> node) {
        if (node.getRightChild() != null) {
            return getPredecessor(node.getRightChild());
        }

        return node;
    }

    @Override
    public T getMaximum() {
        if (root == null) {
            System.out.println("Exception: GetMaximum for empty tree");
            return null;
        }
        else {
            return getMaximum(root);
        }
    }

    private T getMaximum(Node<T> node) {
        if (node.getRightChild() != null) {
            return getMaximum(node.getRightChild());
        }
        else {
            return node.getData();
        }
    }

    @Override
    public T getMinimum() {
        if (root == null) {
            System.out.println("Exception: GetMinimum for empty tree");
            return null;
        }
        else {
            return getMinimum(root);
        }
    }

    private T getMinimum(Node<T> node) {
        if (node.getLeftChild() != null) {
            return getMinimum(node.getLeftChild());
        }
        else {
            return node.getData();
        }
    }

    @Override
    public void traverse() {
        if (root == null) {
            System.out.println("Exception: Traverse for empty tree");
        }
        else {
            traverseNode(root);    
        }
    }

    private void traverseNode(Node<T> node) {
        if (node.getLeftChild() != null) {
            traverseNode(node.getLeftChild());
        }

        System.out.printf("%s  ", node);

        if (node.getRightChild() != null) {
            traverseNode(node.getRightChild());
        }
    }
}