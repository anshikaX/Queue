//Queue using Linked list

import java.util.Scanner;

class Node{

	int data;
	Node next;
}
class QueueList{

	static Node head=null;
	static Node tail=null;
	static Scanner sc=new Scanner(System.in);

	public void enQueue(){

		System.out.println("Enter the Element");
		int value=sc.nextint();
		Node temp=new Node();
		temp.data=value;
		if(head==null){
			head=tail=temp;
		}
		else{
			tail.next=temp;
			tail=temp;
		}
	}

	public void deQueue(){

		if(head==null){
			Sysytem.out.println("The queue is empty there is nothing to be dequeued");
		}
		else if(head==tail){
			head=tail=null;
		}
		else{
			System.out.println(head.data+" is Dequeued");
			head=head.next;
		}

	}

	public void display(){
		Node currentNode=head;
		while(currentNode!=null){
			System.out.print(currentNode.next+" ");
			currentNode=currentNode.next;
		}
	}

	public void peek(){
		if(head==null){
			System.out.println("The Queue is Empty");
		}
		else{
			System.out.println(head.data);
		}
	}

	public void delete(){
		head=tail=null;
	}

	public static void main(String args[]){
        	QueueList obj = new QueueList(size);

        	System.out.println("Queue Operations Using Linked List");
		int choice=0;
        do {
		System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Peek\n5.Delete\n6.Exit");
                System.out.println("Enter the choice");
                choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    obj.enQueue();
                    break;
                case 2:
                    obj.deQueue();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    obj.peek();
                    break;
                case 5:
                    obj.delete();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
            }
        } while (choice != 6);
		
	}
}