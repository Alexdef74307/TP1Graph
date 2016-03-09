package graph;

import java.util.Iterator;
import java.util.List;

public class UndirectedGraph extends Graph implements IUndirectedGraph {

//	@Override
//	public List<Node> getAdjNodes(Node _n) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public void addEdge(Node _node1, Node _node2) {
		// TODO Auto-generated method stub
		this.arcs.add(new Arc(_node1, _node2, null));
		this.arcs.add(new Arc(_node2, _node1, null));
	}

	@Override
	public boolean hasEdge(Node _node1, Node _node2) {
		return super.hasArc(_node1, _node2);
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
