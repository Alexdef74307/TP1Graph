package test;

import graph.Arc;
import graph.DoubleLabel;
import graph.Graph;
import graph.IDirectedGraph;
import graph.IUndirectedGraph;
import graph.IntegerLabel;
import graph.Node;
import graph.StringLabel;
import graph.UndirectedGraph;

public class testGraph {

	public static void main(String[] args) {
		Node n1 = new Node(new IntegerLabel(1));
		Node n2 = new Node(new IntegerLabel(2));
		Node n3 = new Node(new IntegerLabel(3));
		Node n4 = new Node(new StringLabel("A"));

		Arc a1 = new Arc(n1,n2, new DoubleLabel(0.1));
//		Arc a1reversed = new Arc(n2,n1, new IntegerLabel(2));
		Arc a2 = new Arc(n2,n3, null);
//		Arc a2reversed = new Arc(n3,n2, null);
		Arc a3 = new Arc(n1,n3, null);

		IUndirectedGraph g = new UndirectedGraph();
//		IDirectedGraph g = new Graph();
		g.addNode(n1);g.addNode(n2);g.addNode(n3);g.addNode(n4);
//		g.addArc(a1);
		g.addEdge(n1,n2);
//		g.addArc(a1reversed);
//		g.addArc(a2);
		g.addEdge(n2,n3);
//		g.addArc(a2reversed);
//		g.addArc(a3);
		g.addEdge(n3,n1);
		System.out.println(g);
		System.out.println(g.hasEdge(n1, n2)+" "+g.hasEdge(n2, n4));
		System.out.println(g.getAdjNodes(n3));
//		System.out.println(g.getArc(n2));
		
		
		
		
	}

}
