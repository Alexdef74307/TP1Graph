package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class IteratorProfondeur extends IteratorParcoursGraph implements Iterator<Node>{
	
	protected Stack<Node> pile;
	

	public IteratorProfondeur(IGraph igraph, Node n) {
		super(igraph,n);
		this.pile = new Stack<Node>();
		this.pile.push(n);
	}

	@Override
	public boolean hasNext() {
		return this.pile.size() == 0 ? false : true;
	}

	@Override
	public Node next() {
		Node current = this.pile.pop();
		visitedNodes.add(current);
		List<Node> neighbours = this.igraph.getAdjNodes(current);
		
		for(Node n : neighbours) {
			
			if (!nodeStatus(n)) {
				this.pile.push(n);
				this.visitedNodes.add(n);
			}
		}
		
		return current;
	}

}
