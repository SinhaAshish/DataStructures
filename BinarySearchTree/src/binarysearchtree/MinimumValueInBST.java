package binarysearchtree;

public class MinimumValueInBST {

	Node head;
	public static void main(String[] args) {
		MinimumValueInBST tree = new MinimumValueInBST();
	        Node root = null;
	        root = tree.insert(root, 4);
	        tree.insert(root, 2);
	        tree.insert(root, 1);
	        tree.insert(root, 3);
	        tree.insert(root, 6);
	        tree.insert(root, 5);
	        tree.preOrder(root);
	        System.out.println(" the minimum value is "+tree.Minimum(root));
	

	}
	
	public int Minimum( Node node)
	{
		Node current= node;
		while(current.left!=null)
		{
			current= current.left;
		}
		return current.data;
	}
	
	public Node  insert( Node node,int data)
	{
		if(node==null)
		{
			return new Node(data);
		}
		else{
			if(data<=node.data)
			{
				node.left=insert(node.left, data);
			}
			else 
			{
				node.right=insert(node.right, data);
			}
		}
		return node;
	}
	
	public void preOrder(Node node)
	{
		if(node==null )
			return;
		else{
			preOrder(node.left);
			System.out.println(node.data+" ");
			preOrder(node.right);
		}
			
	}

}
