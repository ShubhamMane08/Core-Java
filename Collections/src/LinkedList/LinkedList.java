package LinkedList;

public class LinkedList {
	Node head;
	Node currNode;
	int size;
	public LinkedList() {}
	
	public boolean addval(Object val)
	{
		Node temp = new Node(val);
		if(head==null||(Integer)head.getVal()>=(Integer)val)
		{
			if(head==null)
				currNode = temp;
			else
				head.setPrev(temp);
			temp.setNext(head);
			head = temp;
			
		}
		else if((Integer)currNode.getVal()<=(Integer)val)
		{
			currNode.setNext(temp);
			temp.setPrev(currNode);
			currNode = temp;
		}
		else {
			Node ite = getIterator();
			boolean flag = false;
			while(hasNext(ite))
			{
				if((Integer)val<=(Integer)ite.getVal())
				{
					temp.setNext(ite);
					temp.setPrev(ite.getPrev());
					System.out.println(ite.getVal());
					ite.getPrev().setNext(temp);
					ite.setPrev(temp);
					flag = true;
					break;
				}
				ite = ite.getNext();
			}
			if(!flag)
			{
				temp.setNext(ite);
				temp.setPrev(ite.getPrev());
				ite.getPrev().setNext(temp);
				ite.setPrev(temp);
			}
			//Need Iterator to iterate through the linked list for Storing in order
		}
		size++;
		return true;
	}
	public Node getIterator(){
		return head;
	}
	public boolean hasNext(Node head)
	{
		return head.getNext()!=null;
	}
	@Override
	public String toString()
	{
		if(head==null)
			return "[]";
		StringBuilder ans = new StringBuilder("");
		ans = ans.append("[");
		Node ite = getIterator();
		while(hasNext(ite))
		{
			ans = ans.append(ite.getVal()).append(", ");
			ite = ite.getNext();
		}
		ans = ans.append(ite.getVal());
		ans = ans.append("]");
		return new String(ans);
	}

}
