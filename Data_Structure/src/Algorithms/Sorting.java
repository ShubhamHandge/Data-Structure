package Algorithms;

public class Sorting {
	 static void printArray(int a[])
	    {
	        for(int i=0;i<a.length;i++)
	          System.out.print(a[i]+",");
	    }
	static void BubbleSort(int a[ ])
	{
	  int i, j,t;
	  for(i=0;i<a.length-1;i++)//paases
	   {System.out.println("pass:"+(i+1));
	      for(j=0;j<a.length-1;j++)
		//j stops at second last
		{
			if(a[j]>a[j+1])
	              {
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			 }
	       }
	   }
	}
	static void BubbleSort_V2(int a[ ])
	{
	  int i, j,t;
	  for(i=0;i<a.length-1;i++)//paases
	   {
	      System.out.println("\npass:"+(i+1));
	      boolean done=true;
	      for(j=0;j<a.length-i-1;j++)
		//j stops at second last
		{
			if(a[j]>a[j+1])
	              {
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
	                        done=false;
			 } 
	      }
	      if(done==true)//sorted so stop
	          break;
	   }
	}
	static void SelectionSort(int a[ ])
	{
	 int i,j,min,pos;
	 for(i=0;i<a.length-1;i++)
	  {
	   min=a[i];
	   pos=i;
	   for( j=i+1;j<a.length;j++)
	    {
	      if(a[j]<min)
	      {
	        min=a[j];
	        pos=j;
	      }
	   }
	   a[pos]=a[i];
	   a[i]=min;
	}
	}
	static void InsertionSort(int a[])
	{
	 int i,j,new_element;
	 for(i=0;i<a.length-1;i++)
	  {
	    new_element=a[i+1]; 
		j=i+1;
	   while(j>0 && a[j-1]>new_element)
	     {
	       a[j]=a[j-1];
			j--;
	     }
	   a[j]=new_element;
	}
	}
	static void QuickSort(int a[],int start,int end)
	{
	 int i=start;
	int j=end;
	int pivot=start;
	while(i<j)
	 {
	  while(a[i]<a[pivot])
		i++;
	  while(a[j]>a[pivot])
		j--;
	  if(i<j)
	   {
	    int t=a[i];
		a[i]=a[j];
		a[j]=t;
	   }
	}
	 if(i<end)
	  QuickSort(a,i+1,end);
	 if(j>start)
		QuickSort(a,start,j-1);
	}


static void MergeSort(int a[],int start,int end)
{
  if(start<end)
    {
      int mid=(start+end)/2;
	  MergeSort(a,start,mid);
	  MergeSort(a,mid+1,end);
	  Merger(a,start,mid,end);
    }
 }
static void Merger(int a[],int start,int mid,int end)
{
  int i,j,temp[],tindex;
  temp=new int[a.length];
  i=start;
  j=mid+1;
  tindex=start;
  while(i<=mid && j<=end)
    {
      if(a[i]<a[j])
  		temp[tindex++]=a[i++];
      else
		temp[tindex++]=a[ j++];
    }
	while(i<=mid)//copy leftover
		temp[tindex++]=a[i++];
	while(j<=end)//copy leftover
		temp[tindex++]=a[j++];
	 for(i=start;i<=end;i++)//copy to a again
		a[i]=temp[i];
}

static void HeapSort(int a[])
{
    int i,j,pc;
    boolean done;
    for(i=a.length-1;i>-1;i--)
     {
      for(j=0;j<=i;j++)
      {
        pc=j;
        done=false;
        while(pc>0 && pc/2>=0 && done!=true)
                   {
                 if(a[pc] >a[pc/2])
                           {
                       int t=a[pc];
                            a[pc]=a[pc/2];
                             a[pc/2]=t;
                             pc=pc/2;//move to parent
                           }
                   else
                           done=true;
                 }
          }
       int t=a[0];
       a[0]=a[i];
       a[i]=t;
   }
}
	public static void main(String args[])
	 {
	     int a[]={55,11,77,33,22,99,88,44,66};
	     System.out.println("Befor Sort:");
	     Sorting.printArray(a);
	     //Sorting.BubbleSort(a);
	     //Sorting.BubbleSort_V2(a);
	     //Sorting.SelectionSort(a);
	     //Sorting.InsertionSort(a);
	    // Sorting.QuickSort(a, 0, a.length-1);
	     //Sorting.MergeSort(a, 0, a.length-1);
	     Sorting.HeapSort(a);

	     System.out.println("\nAfter Sort:");
	     Sorting.printArray(a);
	     
	 }





}
