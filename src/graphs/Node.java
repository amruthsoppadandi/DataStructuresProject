package graphs;

import java.util.HashMap;


public class Node{
	int num;
	HashMap<Integer, Node> edges;
	Node(){
		super();
	}
	Node(int num){
		this.num=num;
		this.edges= new HashMap<Integer,Node>();
	}
}
