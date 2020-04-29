package dataStructures;
//Depth first search includes - preorder, inorder and postorder

class TreeNode{
	int value;
	TreeNode left,right;
	
	public TreeNode() {
		
	}
	
	public TreeNode(int value) {
		this.value = value;
	}
	
}


public class BinarySearchTree {
	static int counter=0;
	public TreeNode createNode(TreeNode node, int value) {
		//if(node==null || node.left==null || node.right==null) {
			node = new TreeNode(value);
			node.left=null;
			node.right=null;
		//}
		return node;
	}
	
	public TreeNode insert (TreeNode node, int value) {
		if(node.value>value) {
			if(node.left!=null) {
				insert(node.left,value);
			}else {
				System.out.println("Value : " + value + "Added to the left of node: " + node.value);
				node.left = createNode(node, value);
			}
		}else if(node.value<value) {
			if(node.right!=null) {
			insert(node.right,value);
			}
			else {
				System.out.println("Value : " + value + "Added to the right of node: " + node.value);
				node.right = createNode(node, value);
			}
		}
		return node;
	}
	
	public void inorder(TreeNode node) {
		if(node!=null) {
			inorder(node.left);
			System.out.print("\t" + node.value);
			inorder(node.right);
		}
	}
	
	public void preorder(TreeNode node) {
		if(node!=null) {
			System.out.print("\t" + node.value);
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	public void postorder(TreeNode node) {
		if(node!=null) {
			postorder(node.left);
			postorder(node.right);
			System.out.print("\t" + node.value);
		}
	}
	
	public TreeNode delete(TreeNode node, int val) {
		
		if(node==null) {
			node=null;
		}
		if(node.value>val) {
			node.left = delete(node.left, val);
		}else if(node.value<val) {
			node.right = delete(node.right, val);
		}else {
			// Leaf node deletion case
			if(node.left==null && node.right==null) {
				node=null;
			}
			 // Node to be deleted has one child case
	        // Node to be deleted has right child
			else if(node.left==null) {
				node = node.right;
			}
			// Node to be deleted has left child
			else if(node.right==null) {
				node = node.left;
			}
			// Node to be deleted has two children case
			else {
				TreeNode successor = findSuccessor(node.right);
				//copy the value
				node.value = successor.value;
				//Delete successor node
				node.right = delete(node.right, successor.value);
			}
			
		}
		return node;
	}
	public TreeNode findSuccessor(TreeNode node) {
		if(node.left==null) {
			return node;
		}else
		return findSuccessor(node.left);
		
	}
	
	public void search(TreeNode node, int value) {
		if(node.value > value) {
			counter++;
			search(node.left,value);
		}else if(node.value < value) {
			counter++;
			search(node.right,value);
		}else if(node.value == value){
			System.out.println("Value Found at level: " + counter);
			counter=0;
		}else {
		   System.out.println("Value not found");	
		}
	}
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		TreeNode node = new TreeNode();
			node = bst.createNode(node,100);
			System.out.println("Root Node added with Value: " + node.value);
		
		node = bst.insert(node,20);
		node = bst.insert(node,200);
		node = bst.insert(node,200); //Duplictes are also handled
		node = bst.insert(node,10);
		node = bst.insert(node,30);
		node = bst.insert(node,150);
		node = bst.insert(node,300);
		node = bst.insert(node,300);
		
		bst.inorder(node);
		System.out.println(" ");
		bst.preorder(node);
		System.out.println(" ");
		bst.postorder(node);
		System.out.println(" ");
		
		//Delete a Node
	    //node = bst.delete(node,100);
		//bst.inorder(node);
		
		//Search for a Node
		bst.search(node,100);
		
	}
}
