package Graphs;

import java.util.*;

public class Graph_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.AddEdge(1, 2, 3);
		g.AddEdge(1, 4, 2);
		g.AddEdge(4, 3, 5);
		g.AddEdge(2, 3, 10);
		g.AddEdge(4, 5, 6);
		g.AddEdge(5, 6, 7);
		g.AddEdge(5, 7, 6);
		g.AddEdge(6, 7, 5);
		g.removevertex(4);
		System.out.println(g.haspath(1, 6, new HashSet<>()));
		
		g.Display();
		g.Allpath(1, 5, new HashSet<>(), "");
	}

}
