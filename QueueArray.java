import java.util.Scanner;
public class QueueArray
{
    static int front = -1;
    static int rear = -1;
    static int queue[];
    int size;


    QueueArray(int size)
    {
        this.size = size;
    }

    //Insert an element in the queue
    public void enqueue()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to insert");
        int item = sc.nextInt();
        if (rear == size - 1)
        {
            System.out.println("Queue is overflow " +item+ " can't be inserted");
        }
        else if (front == -1 && rear == -1)    //First element to insert
        {
            front = rear = 0;
            queue[rear] = item;

        }
        else
            {
            rear++;
            queue[rear] = item;
        }
    }

    //Deleting and element from the queue
    public void dequeue()
    {
        if (front <= -1)
        {
            System.out.println("Underflow");
        } else if (front == rear)
        {
            front = rear = -1;
        }
        else
            {
            front++;
        }
    }

    //Display
    public void display()
    {
        if (rear <= -1)
        {
            System.out.println("Queue is Empty");
        } else
            {
            System.out.println("Elements in the queue are: ");
            for (int i = front; i <= rear; i++)
            {
                System.out.println(queue[i]);
            }
        }
    }

    //peek an element from the queue
    public void peek()
    {
        if (front <= -1)
        {
            System.out.println("Queue is Empty");
        }
        else
            {
            System.out.println("The first element of the queue is: " + queue[front]);
        }
    }

    //Delete entire queue
    public void delete()
    {
        queue = null;
        front=rear=-1;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue");
        int size = sc.nextInt();
        QueueArray obj = new QueueArray(size);
        queue = new int[size];
        int choice;
        do {
            System.out.println("Queue Operations Using Array");
            System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.Peek\n5.Delete\n6.Exit");
            System.out.println("Enter the choice");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    obj.enqueue();
                    obj.display();
                    break;
                case 2:
                    obj.dequeue();
                    obj.display();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    obj.peek();
                    break;
                case 5:
                    obj.delete();
                    obj.display();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
            }
        } while (choice != 6);

    }

}
