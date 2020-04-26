package graphs;

import java.util.HashMap;

public class GraphsImplementation {
	
	class Node{
		int num;
		HashMap<Integer,Node> edges;
		Node(){
			
		}
		Node(int num){
			this.num= num;
			this.edges= new HashMap<Integer, Node>();
		}
	}
	
	private  Node root;

	public GraphsImplementation() {
		super();
		this.root = new Node();
	}
	
	public void startRoute(Node start, int data) {
		insert(start,root,data);
	}


	public void insert(Node start,Node repeat, int data) {
		
		if(repeat.num==data) {
			return;
		}
		else {
			if(root.num==0) {
				root=start;
				Node child= new Node(data);
				start.edges.put(data,child);
				return;
				
			}
			else {
				
				Node child = repeat.edges.get(start.num);
					if(child!=null) {
					Node parent = repeat.edges.get(start.num);
					child= new Node(data);
					parent.edges.put(data,child);
					return;
				}
					else {
						if(repeat.edges.size()!=0) {
							Node dum = new Node(data);
							start.edges.put(data,dum);
						}
					}
					for(Node subNode : repeat.edges.values()) {
						insert(start,subNode , data);
				}
			}
		}
	}
	
	public void print(Node root) {
		showElements(root);
	}
	
	public void showElements(Node root) {
		if(root.edges.size()==0) {
			return;
		}
		else {
			for(Node subNode : root.edges.values()) {
				showElements(subNode);
				System.out.println(subNode.num);
			}
			System.out.println(root.num);
			
		}
		
	}
}
