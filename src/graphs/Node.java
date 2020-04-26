package graphs;

import java.util.ArrayList;

public class Node{
	private String name;
	private int index;
	private ArrayList<Node> neighbors = new ArrayList<Node>();
	private boolean isVisited = false;
	private Node parent;
	
	Node(int index,String name){
		this.index=index;
		this.name=name;
		
	}
	Node()
	{
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public ArrayList<Node> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(ArrayList<Node> neighbors) {
		this.neighbors = neighbors;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}
	
}
