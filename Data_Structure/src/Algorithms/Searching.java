package Algorithms;

public class Searching {
	
	static int LinearSearch(int a [],int key) {
		for(int i=0; i<a.length; i++) {
			if(key==a[i])
				return i; // found 
		}
		return -1; // not found
	}
	
	static int BinarySearch(int a[],int start,int end,int key)
	{
	    if(start<=end)
	    {   int mid=(start+end)/2;
	        if(key==a[mid])
	            return mid;
	        else
	        {   if(key<a[mid])
	                return BinarySearch(a,start,mid-1,key);
	            else
	                return BinarySearch(a,mid+1,end,key);
	        }
	    }
	    else
	    { return -1;
	    }
	}
	
	 public static void main(String args[]) {
		 int a[] = {11,22,55,77,99,110};
	 	 int as[]={11,22,33,44,55,66,77,88,99,111};
		 int key = 11;
		// int re = Searching.LinearSearch(a, key);
	     int re=Searching.BinarySearch(as, 0,as.length-1, key);

		 	 if(re==-1)
					System.out.println("NotFound...");
		 	 else
					System.out.println("Found : "+key);
		 	 

	 }

}
