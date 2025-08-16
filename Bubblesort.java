public class Bubblesort{
     public static void main(String []args){
         int a[] = {55,48,37,25,20};

               for(int i = 0; i < a.length - 1; i++)
                 {
                   for(int j = 0; j < a . length - 1 - i; j++) 
                  {
                     if (a[j] > a[j+1])
					 {
                int temp = a[j];
				
                a[j] =  a[j+1];
				
                a[j+1]  =  temp;
            }
       }
  }
for(int x:a) {
	
System.out.println(x+" ");
        }
  }
}