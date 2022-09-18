package Collection02;

public class StuLinkedList {
	
	public Node first;
	public Node last;
	public boolean isEmpty() {
		return first == null;
	}
	
	public void print() {
		Node current = first;
		while(current != null) {
			System.out.println("[" + current.data + " " + current.name + " " + current.np + "]");
			current = current.next;
		}
		System.out.println();
	}
	
	public void insert(int data,int np,String name) {
		Node newNode = new Node(data,np,name);
		if(this.isEmpty()) { // 這是第一節
			first = newNode;
			last = newNode;
		}else {
			last.next = newNode;
			last = newNode;
		}
	}
	
	public void delete(Node delNode) {
		Node newNode;
		Node tmp;
		if(first.data == delNode.data) {
			first = first.next;
		}else if(last.data == delNode.data) {
				newNode  = first;
				while(newNode.next != last) {
					newNode = newNode.next;
				}
				newNode.next = last.next;
				last = newNode;
		}else {
				newNode = first;
				tmp = first;
				while(newNode.data != delNode.data) {
					tmp = newNode;
					newNode = newNode.next;
				}
				tmp.next = delNode.next;
			
		}
	}
	

}
class Node{
	int data;
	int np;
	String name;
	Node next;
	
	public Node(int data,int np,String name) {
		this.data = data;
		this.np = np;
		this.name = name;
	}
}