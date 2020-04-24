package graphs;


public class GraphsImplementation {
	
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
				//repeat=root;
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
							repeat.edges.put(data,dum);
						}
					}
					for(Node subNode : repeat.edges.values()) {
						insert(start,subNode , data);
				}
			}
		}
	}
}
