package graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Operations {
	Graph g;
	LinkedList<Integer> adj[];
	//################### Initialize the Graph ###################//
	public Operations(Graph g) {
		this.g=g;
	}

	//################### Breadth First Trasversal of Graph ###################//
	public void BFS(int s)
	{
		boolean visited[] = new boolean[g.getNumberOfVertices()];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s]= true;
		queue.add(s);
		while(queue.size()!=0)
		{	s = queue.poll();
			System.out.println( s+" ");
			adj=g.getAdj();
			Iterator<Integer> it = adj[s].listIterator();
			while(it.hasNext())
			{	int n= it.next();
					if(!visited[n])
					{
						visited[n] = true;
						queue.add(n);
					}

			}
		}
	}

	//################### Depth First Trasversal of Graph ###################//
	public void DFS(int s)
	{
		boolean visited[] = new boolean[g.getNumberOfVertices()];
		for (int i=0; i<g.getNumberOfVertices(); ++i){
            if (visited[i] == false)
                DFSUtil(i, visited);
		}
	
	}
	
	public void DFSUtil(int s, boolean visited[])
	{
		visited[s]=true;
		System.out.println( s+" ");
		adj=g.getAdj();
		Iterator<Integer> it = adj[s].listIterator();
		while(it.hasNext())
		{	int n= it.next();
				if(!visited[n])
				{
					DFSUtil(n,visited);
				}

		}
	
	}

}
