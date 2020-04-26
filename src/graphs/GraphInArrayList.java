package graphs;

import java.util.ArrayList;

public class GraphInArrayList {

	ArrayList<Node> parent;
	
	public GraphInArrayList() {
		this.parent= new ArrayList<Node>();
	}
	
	public void insertNodes(String name) {
		boolean alreadyExist=false;
		for(Node nn : parent) {
			if(nn.getName()==name) {
				alreadyExist=true;
				break;
			}
		}
		
		if(!alreadyExist) {
			parent.add(new Node(parent.size(), name));
		}
	}
	
	public void addNeighbors(String ver1, String ver2) {
		boolean alreadyExist=false;
		for(Node nn : parent) {
			if(nn.getName()==ver1) {
				alreadyExist=true;
				break;
			}
		}
		boolean alreadyExist2=false;
		for(Node nn : parent) {
			if(nn.getName()==ver2) {
				alreadyExist2=true;
				break;
			}
		}
		
		if(alreadyExist&&alreadyExist2) {
		Node v1 = new Node();
		Node v2 = new Node();
		for(Node nnn:parent) {
			if(ver1==nnn.getName()) {
				v1=nnn;
			}
			if(ver2==nnn.getName()) {
				v2=nnn;
			}
		}
		//System.out.println(v1.getIndex());
		parent.get(v1.getIndex()).getNeighbors().add(v2);
		parent.get(v2.getIndex()).getNeighbors().add(v1);
		}
	}
	
	public void shorting() {
	}
	public void shortestPath() {
		
		for(Node nn : parent) {
			
			while(!nn.isVisited()) {
				
			}
		}
		
	}
	
	public void print() {
		
		for(Node nnn:parent) {
			System.out.println("Name"+nnn.getName()+"\t index" + nnn.getIndex());
			for(Node nn:nnn.getNeighbors()) {
				System.out.println("Link" +nnn.getName()+"->" +nn.getName());
				
			}
			
			System.out.println("===============================");
		}
	}
}
