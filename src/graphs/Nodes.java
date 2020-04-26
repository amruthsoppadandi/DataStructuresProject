package graphs;

import java.util.HashMap;

public class Nodes {
	
	private int data;
	
	private HashMap<String,FairDestination> beforeLanding;
	
	private  HashMap<String,FairDestination> afterLanding;
	
	Nodes(){
		super();
	}
	
	Nodes(int data){
		this.data= data;
		this.beforeLanding= new HashMap<String, FairDestination>();
		this.afterLanding= new HashMap<String, FairDestination>();
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public HashMap<String, FairDestination> getBeforeLanding() {
		return beforeLanding;
	}

	public void setBeforeLanding(HashMap<String, FairDestination> beforeLanding) {
		this.beforeLanding = beforeLanding;
	}

	public HashMap<String, FairDestination> getAfterLanding() {
		return afterLanding;
	}

	public void setAfterLanding(HashMap<String, FairDestination> afterLanding) {
		this.afterLanding = afterLanding;
	}
	
	
	
	
}
