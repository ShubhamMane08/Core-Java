package List;

import java.util.LinkedList;
public class LinkedList1 {
	
	
	public static void main(String[] args) {
		
	LinkedList<Integer> ll = new LinkedList<>();
	ll.add(1);
	ll.add(2);
	ll.add(3);
	for(int i =0;i<ll.size();i++)
	{
		System.out.println(ll.get(i));
	}
	System.out.println(ll);
	
	Node n1 = new Node();
	Node n2= new Node();
	n1.value=1;
	n1.next=n2;
	n2.value=2;
	n2.next=null;
	
	
	
		
	}

}
class Node
{
	public int value;
	public Node next;
}
