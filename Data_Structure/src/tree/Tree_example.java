package tree;


public class Tree_example{
    DENode root;
    void createTree()
    {
        root=null;
    }
    void insertData(DENode r,DENode n)
    {
        if(root==null)
            root=n;
        else
        {
            if(n.data<r.data)//left
            {
                if(r.left==null)
                    r.left=n;
                else
                    insertData(r.left,n);
            }
            else
            {
                if(r.right==null)
                    r.right=n;
                else
                    insertData(r.right,n);
            }
        }
    }
    void inorder(DENode r)
    {
        if(r!=null)
        {
            inorder(r.left);//l
            System.out.print(r.data+",");//p
            inorder(r.right);//r
        }
    }   
        
        void preorder(DENode r)
        {
            if(r!=null)
            {	 
            	 System.out.print(r.data+",");//p
            	 inorder(r.left);//l
                 inorder(r.right);//r
            }
        }  
        
            void postorder(DENode r)
            {
                if(r!=null)
                {	 
                	 inorder(r.left);//l
                     inorder(r.right);//r
                	 System.out.print(r.data+",");//p

                }
        
            }
            int getHeight(DENode r)
            {
                if(r==null)
                    return 0;
                else
                {
                    int LeftHeight=getHeight(r.left);
                    int RightHeight=getHeight(r.right);
                    return (Math.max(LeftHeight, RightHeight)+1);
                }

            }
            
            boolean isBalanced(DENode r)
            {
                if(r==null)
                    return true;
                else
                {
                    int right=getHeight(r.right);
                    int left=getHeight(r.left);
                    if(Math.abs(left - right)<=1)//+1,0,-1
                        return true;
                    else
                        return false;

                }
            }
            
     public static void main(String[] args)
     {
         Tree_example t=new Tree_example();
         DENode n1=new DENode(100);
         t.insertData(t.root,n1);
         DENode n2=new DENode(50);
         t.insertData(t.root,n2);
         DENode n3=new DENode(20);
         t.insertData(t.root,n3);
         DENode n4=new DENode(120);
         t.insertData(t.root,n4);
         DENode n5=new DENode(110);
         t.insertData(t.root,n5);
         
         System.out.print("In-order: ");
         System.out.print(":");
         t.inorder(t.root);
         
         System.out.println();
         System.out.print("Pre-order:");
         t.preorder(t.root);
         
         System.out.println();
         System.out.print("Post-order:");
         t.postorder(t.root);
         
         System.out.println("\nHeight is:"+(t.getHeight(t.root)-1));
         System.out.println("\nIs Tree Balanced:"+t.isBalanced(t.root));


     }
}