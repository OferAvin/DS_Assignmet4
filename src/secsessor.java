import BTree.Node;

public class secsessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    private Node<T> getSmallestNode(Node<T> nodeToGet) {
        Node<T> node = nodeToGet;
        while (node.numberOfChildren() > 0) {
            node = node.getChild(0);
        }
        return node;
    }

}
