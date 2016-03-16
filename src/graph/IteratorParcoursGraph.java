package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorParcoursGraph implements Iterator<Node> {
	
	protected IGraph igraph;
	protected Node premier;
	protected List<Node> visitedNodes;
	
	public IteratorParcoursGraph(IGraph igraph, Node n) {
		this.igraph = igraph;
		this.premier = n;
		this.visitedNodes = new ArrayList<Node>();
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Node next() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean nodeStatus(Node n) {
		for(Node n1 : visitedNodes) {
			if (n1.getID() == n.getID()) {
				return true;
			}
		}
		return false;
	}
	
}
