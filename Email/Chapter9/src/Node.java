
public class Node {
	private Node parent;
	private Node left;
	private Node right;
	private Object data;
	
	public Node(){
		parent = null;
		left = null;
		right = null;
	}
	public Node(Object data, Node p){
		this();
		this.data = data;
		this.parent = p;
	}
	
	public boolean isRoot(){
		return this.parent == null;
	}
	
	public Node getParent(){
		return this.parent;
	}
	
	public void setData(Object data){
		this.data = data;
	}
	
	public Object getData(){
		return this.data;
	}

	public void addLeftChild(Object data){
		Node newNode = new Node(data, this);
		this.left = newNode;
	}
	
	public void addRightChild(Object data){
		Node newNode = new Node(data, this);
		this.right = newNode;
	}

	public void setLeftChild(Node p){
		this.left = p;
	}
	
	public void setRightChild(Node p){
		this.right = p;
	}
	
	public Node getLeftChild(){
		return this.left;
	}
	
	public Node getRightChild(){
		return this.right;
	}
	
	public boolean isLeft(){
		return this.left != null;
	}
	
	public boolean isRight(){
		return this.right != null;
	}
	
	public boolean isLeaf(){
		return this.left == null && this.right == null;
	}
}
