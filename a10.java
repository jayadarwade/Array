//10) WAP to delete an element from specified position in array.position entered by User using command line //argument.
import java.util.Scanner;
class Delete{
 public static void main(String args[]){
  Scanner sc =new Scanner(System.in);
  int i,j=0,n;
  System.out.println("Enter Array Size");
  n=sc.nextInt();
  int arr[] = new int [n];
  System.out.println("Enter Array Element "+n);
  for(i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
  }
  
  System.out.println("Enter delete position   ");
  int delete=sc.nextInt();
  for(i=0;i<arr.length-1;i++){
   if(arr[i]==arr[delete-1])
    arr[i]=arr[i+1];
  }
  System.out.println("Array After position element delete");
  for(i=0;i<arr.length;i++){
     System.out.print(arr[i]+" ");
  }
 }
}    
