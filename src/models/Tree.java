package models;

public class Tree<T> {

	private Node<T> root;
	
	public void addNode(Node<T> node) {
		if(root!=null) {
			if(node.getRoot().getInfo()==root.getInfo()) {
				root.addNode(node);
			}else {
				addNode(node,root);
			}
		}else {
			root=node;
		}
	}

	private void addNode(Node<T> node, Node<T> current) {
		for (Node<T> actual : current.getNodes()) {
			if(actual.getInfo()==node.getRoot().getInfo()) {
				actual.addNode(node);
			}else {
				
			}
		}
	}
	
	public Node<T> getRoot(){
		return root;
	}
}
