package LinkedList;

import java.util.Scanner;

public class Employee_CRUD_LinkedList {
	
	EmpNode root;
	 void createList()
	 {
	     root=null;
	 }
	 void insert(int eid,String name,String gender,float salary)
	 {
	     EmpNode n=new EmpNode(eid,name,gender,salary);
	     if(root==null)
	          root=n;
	      else
	      {
	         EmpNode t=root;//1
	         while(t.next!=null)//2
	             t=t.next;
	         t.next=n;//3
	      }
	     System.out.println("Inserted");
	}
	 void update(EmpNode t)
	 {
	          Scanner in=new Scanner(System.in);
	          System.out.println("\n1.Update name\n2.Update gender\n3.Update Salary:");
	          int i_ch=in.nextInt();
	          if(i_ch==1)
	          {
	                System.out.println("Old:"+t.name);
	                System.out.println("\nEnter new:");
	                t.name=in.next();
	          }
	          else if(i_ch==2)
	          {
	                System.out.println("Old:"+t.gender);
	                System.out.println("\nEnter new:");
	                t.gender=in.next();
	          }
	          else if(i_ch==3)
	          {
	                System.out.println("Old:"+t.salary);
	                System.out.println("\nEnter new:");
	                t.salary=in.nextFloat();
	          }
	                System.out.println("\nupdated........");
	          }

	 void printList()
	    {
	       if(root==null)
	          System.out.println("Empty List");
	      else
	      {
	          EmpNode t=root;
	          while(t!=null)
	          {
	              System.out.println(t.eid+","+t.name+","+t.gender+","+t.salary);
	              t=t.next;
	          }
	      }
	}
	 public static void main(String args[])
	     {
	         Scanner in=new Scanner(System.in);
	         Employee_CRUD_LinkedList obj=new Employee_CRUD_LinkedList();
	         obj.createList();
	         obj.insert(11, "amar", "male", 12345);
	            obj.insert(12, "tamar", "male", 34345);
	            obj.printList();
	            obj.update(obj.root);
	     }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	


