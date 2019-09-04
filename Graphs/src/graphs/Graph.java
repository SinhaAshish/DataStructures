package graphs;



import java.util.LinkedList;

public class Graph {
	
	private  int numberOfVertices;
	private LinkedList<Integer> adj[]; 
	
	Graph(int v)
	{
		numberOfVertices=v;
		adj = new LinkedList[v];
		for( int i=0;i<v;++i)
		{
			adj[i]= new LinkedList<Integer>();
		}
	}
	
	void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

	public int getNumberOfVertices() {
		return numberOfVertices;
	}

	public void setNumberOfVertices(int numberOfVertices) {
		this.numberOfVertices = numberOfVertices;
	}

	public LinkedList<Integer>[] getAdj() {
		return adj;
	}

	public void setAdj(LinkedList<Integer>[] adj) {
		this.adj = adj;
	}
	
	
}
