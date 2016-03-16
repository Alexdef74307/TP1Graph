package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IteratorLargeur extends IteratorParcoursGraph implements Iterator<Node> {

	protected Queue<Node> file;
	
	public IteratorLargeur(IGraph iGraph, Node n) {
		// TODO Auto-generated constructor stub
		super(iGraph, n);
		this.file = new LinkedList();
		this.file.add(n);
	}

	@Override
	public boolean hasNext() {
		return this.file.size() == 0 ? false : true;
	}

	@Override
	public Node next() {
		Node current = this.file.peek();
		visitedNodes.add(current);
		List<Node> neighbours = this.igraph.getAdjNodes(current);
		
		for(Node n : neighbours) {
			if (!nodeStatus(n)) {
				this.file.add(n);
				this.visitedNodes.add(n);
			}
		}
		return this.file.remove();
	}

}
