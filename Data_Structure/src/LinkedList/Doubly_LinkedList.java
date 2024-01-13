package LinkedList;

import java.util.Scanner;

public class Doubly_LinkedList {
	DENode root;
	    void createList()
	    {
	        root=null;//nullify root->assigning it null so we know when to use it
	    }
	    void insertLeft(int data)
	    {
	    	DENode n=new DENode(data);
	      if(root==null)
	          root=n;
	      else
	      {
	          n.right=root;//1100
	          root.left=n;//root=800
	          root=n;//3
	      }
	    }
	     void insertRight(int data)
	    {
	    	 DENode n=new DENode(data);
	      if(root==null)
	          root=n;
	      else
	      {
	    	  DENode t=root;//1
	         while(t.right!=null)//2
	             t=t.right;
	         t.right=n;//3
	         n.left=t;//4
	      }
	    }
	    void deleteLeft()
	    {
	    	DENode t;
	      if(root==null)
	          System.out.println("Empty List");
	      else
	      {
	          t=root;//1:t=100
	          if(root.left==null && root.right==null)
	              root=null;
	          else
	          {
	           root=root.right;//2
	           root.left=null;//3
	          }
	          System.out.println("Deleted:"+t.data);
	       }
	    }
	     void deleteRight()
	     {
	      if(root==null)
	          System.out.println("Empty List");
	      else
	      {
	    	  DENode t,t2;
	          t=root;//1:t=100
	          while(t.right!=null)//2
	              t=t.right;
	          if(t==root)//single node
	              root=null;
	          else
	          {
	              t2=t.left;//3
	              t2.right=null;//4
	          }
	          System.out.println("Deleted:"+t.data);
	      }
	    }

	    void printListLR()
	    {
	       if(root==null)
	          System.out.println("Empty List");
	      else
	      {
	    	  DENode t=root;
	          while(t!=null)
	          {
	              System.out.print("|"+t.data+"|->");
	              t=t.right;
	          }
	      }
	    }
	       void printListRL()
	    {
	       if(root==null)
	          System.out.println("Empty List");
	      else
	      {
	    	  DENode t=root;
	          while(t.right!=null)//rightmost
	              t=t.right;
	           while(t!=null)
	          {
	              System.out.print("|"+t.data+"|->");
	              t=t.left;
	          }

	      }
	      }

	    public static void main(String args[])
	     {
	         Scanner in=new Scanner(System.in);
	         Doubly_LinkedList  obj=new Doubly_LinkedList ();
	         obj.createList();
	         int ch;
	         do
	         {
	           System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List Normal\n6.Print List End to Start\n0.Exit \n:");
	           ch=in.nextInt();//read
	           switch(ch)
	           {
	               case 1:
	                       System.out.println("\nEnter a number:");
	                       int e=in.nextInt();
	                       obj.insertLeft(e);
	                       break;
	               case 2:
	                       System.out.println("\nEnter a number:");
	                       e=in.nextInt();
	                       obj.insertRight(e);
	                       break;
	               case 3:
	                      obj.deleteLeft();
	                      break;
	               case 4:
	                      obj.deleteRight();
	                      break;
	               case 5:
	                      System.out.println("\nelements in list:");
	                      obj.printListLR();
	                       break;
	                case 6:
	                      System.out.println("\nelements in list:");
	                      obj.printListRL();
	                       break;
	               case 0:
	                       System.out.println("Exiting");
	                   break;
	               default:
	                       System.out.println("Wrong Choice");
	                   break;
	           }

	         }while(ch!=0);
	     }



}
