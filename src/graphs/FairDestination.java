package graphs;

public class FairDestination {
	
	private int fee;
	private Nodes node;
	
	public FairDestination(int fee) {
		this.fee=fee;
		this.node= new Nodes();
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public Nodes getNode() {
		return node;
	}

	public void setNode(Nodes node) {
		this.node = node;
	}
	
	

}
