class Linkedlist
{
	public static void main(String[] args) 
	{
		Node next;
		Node node1 = new Node("A");
		Node node2 = new Node("B");
		node1.setNext(node2);
		Node node3 = new Node("C");
		node2.setNext(node3);
		Node node4 = new Node("D");
		node3.setNext(node4);
		next = node1;
		while(next!=null)
		{
			System.out.println(next.getData());
			next = next.getNext();
		}
	}
}
class Node
{
	Node next;
	Object data;
	public Node(Object dataValue) 
	{
		next = null;
		data = dataValue;
	}
	public Object getData() 
	{
		return data;
	}
	public void setData(Object dataValue) 
	{
		data = dataValue;
	}
	public Node getNext() 
	{
		return next;
	}
	public void setNext(Node nextValue) 
	{
		next = nextValue;
	}
}