package LinkedList;

final public class Node {
	private Node next;
	private Object val;
	private Node prev;
	
	private Node() {}
	
	public Node(Object val)
	{
		this.val= val;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Object getVal() {
		return val;
	}

	public void setVal(Object val) {
		this.val = val;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

}
