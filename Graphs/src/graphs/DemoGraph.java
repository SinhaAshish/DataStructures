package graphs;

import java.util.Scanner;

public class DemoGraph {

	public static void main(String[] args) {
		Graph g = new Graph(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the choice ");
        System.out.println(" A . For Breadth First Search of Graph");
        System.out.println(" B . For Deapth First Search of Graph");
        String choice = in.next();
        System.out.println(" The Choice is "+ choice);
        switch(choice)
        {
        case "A":
        	new Operations(g).BFS(0);
        	break;
        case "B":
        	new Operations(g).DFS(2 );
        	break;
        	
        default:
			System.out.println("INVALID Option");	
        }
        

	}

}
