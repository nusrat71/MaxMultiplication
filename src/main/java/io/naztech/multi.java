package io.naztech;

public class multi {
	public int max_mult() {
	int array1[]= {1,2,3,4,5};
    int maxx=0;
 
    for(int i=0;i<array1.length;i++)
    {
   	 for(int j=0;j<array1.length;j++)
   	 {
   		 if(i!=j)
   		 {
   			 if(array1[i]*array1[j]>maxx)
   			 {
   				 maxx=array1[i]*array1[j];
   			 }
   			 else
   			 {
   				 maxx=maxx;
   			 }
   		 }
   	 }
    }
    return maxx;
	}

}
