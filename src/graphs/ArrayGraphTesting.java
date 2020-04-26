package graphs;

public class ArrayGraphTesting {
	
	public static void main(String[] args) {
		
		GraphInArrayList link = new GraphInArrayList();
		
		link.insertNodes("A");
		link.insertNodes("B");
		link.insertNodes("C");
		link.insertNodes("D");
		link.insertNodes("A");
		link.insertNodes("E");
		link.insertNodes("G");
		
		link.addNeighbors("A", "C");
		link.addNeighbors("A", "B");
		link.addNeighbors("B", "D");
		link.addNeighbors("B", "E");
		link.addNeighbors("C", "E");
		link.addNeighbors("C", "G");
		
		link.print();
		link.shortestPath();
	}

}
