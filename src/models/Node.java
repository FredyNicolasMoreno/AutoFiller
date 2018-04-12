package models;

import java.util.ArrayList;

public class Node<T> {

	private Node<T> root;
	private ArrayList<Node<T>> nodes;
	private T info;
	
	public Node(Node<T> root, T info) {
		this.root = root;
		this.info = info;
		nodes = new ArrayList<>();
	}

	public Node<T> getRoot() {
		return root;
	}

	public ArrayList<Node<T>> getNodes() {
		return nodes;
	}

	public T getInfo() {
		return info;
	}
	
	public void addNode(Node<T> node) {
		nodes.add(node);
	}
	
}
