package Queue;

import java.util.Scanner;

import stack.Stack_Example;

public class Queue_Example {
	int front,rear,MaxSize,q[];
    void createQueue(int size)
    {
        MaxSize=size;
        front=0;
        rear=-1;
        q=new int[MaxSize];
    }
    void enqueue(int e)//entry on queue
   {
       rear++;
       q[rear]=e;
       System.out.println("Enqueued "+e);
   }
    boolean isFull()
   {
       if(rear==MaxSize-1)
           return true;
       else
           return false;
    }
    int dequeue()
   {
       int temp=q[front];
       front++;
       return temp;
   }
     boolean isEmpty()
   {
       if(front>rear)
           return true;
       else
           return false;
    }
     void printQueue()
    {
        System.out.println("Queue Has:");
        for(int i=front;i<=rear;i++)
            System.out.print(q[i]+" - ");
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int ch;
	        Scanner in =new Scanner(System.in);
	        Queue_Example obj=new Queue_Example();
	        System.out.print("Enter size of stack:");
	        int size=in.nextInt();
	        obj.createQueue(size);//creates array of size
	        do
	        {
	            System.out.print("\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
	            ch=in.nextInt();
	            switch(ch)
	            {
	                case 1:
	                    if(obj.isFull()!=true)//if not full then push
	                    {
	                        System.out.print("Enter elment:");
	                        int e=in.nextInt();
	                        obj.enqueue(e);
	                    }
	                    else
	                        System.out.print("Stack Full");
	                    break;
	                case 2:
	                    if(obj.isEmpty()!=true)//if not empty then pop
	                    {
	                        System.out.print("Element dequeue:"+obj.dequeue());
	                    }
	                    else
	                        System.out.print("Stack Empty");
	                    break;
	              
	                case 3:
	                    if(obj.isEmpty()!=true)//if not empty then pop
	                    {
	                      obj.printQueue();
	                    }
	                    else
	                        System.out.print("Stack Empty");
	                    break;
	                case 0:
	                        System.out.print("Exiting code");
	                        break;
	                default:
	                        System.out.print("Wrong input");
	                        break;
	            }
	        }while(ch!=0);
	    
	    
        //Linear_Searching_Deleting_InsertAt_LinkedList

	}

}
