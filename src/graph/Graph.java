package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Graph implements IDirectedGraph {
	
	protected List<Node> nodes;
	protected List<Arc> arcs;
	
	public Graph() {
		this.nodes = new ArrayList<Node>();
		this.arcs = new ArrayList<Arc>();
	}

	@Override
	public void addNode(Node _node) {
		this.nodes.add(_node);
	}

	@Override
	public List<Node> getAllNodes() {
		return this.nodes;
	}

	@Override
	public int getNbNodes() {
		return this.nodes.size();
	}

	@Override
	public List<Node> getAdjNodes(Node _n) {
		List<Node> n = new ArrayList<Node>();
		
		for (Arc a : this.arcs) {
			if (a.getSource().equals(_n)) {
				n.add(a.getDestination());
			}
		}
		return n;
	}

	@Override
	public boolean hasArc(Node _n1, Node _n2) {
		
		for(Arc a : this.arcs) {
			if (a.getSource().equals(_n1) && a.getDestination().equals(_n2)) {
				return true;
			}
		}
		
		return false;

	}

	@Override
	public void addArc(Arc _edge) {
		this.arcs.add(_edge);
	}

	@Override
	public List<Arc> getArc(Node _n) {
		List<Arc> r = new ArrayList<Arc>();
		for(Arc a : this.arcs) {
			if (a.getSource().equals(_n)) {
				r.add(a);
			}
		}
		
		return r;
	}
	
	public String toString() {
		String r = "Graph : \n";
		for(Node n: this.nodes) {
			r += "[noeud= " + n.getLabel() + " : " + this.getArc(n).toString() + "\n";
		}
		return r;
	}

	@Override
	public Iterator<Node> creerBFSIterator(Node n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Node> creerDFSIterator(Node n) {
		// TODO Auto-generated method stub
		return null;
	}

}
