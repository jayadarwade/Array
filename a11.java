//11) WAP to remove smallest even element from array.
import java.util.Scanner;
class Smallest{
 public static void main(String arg[]){
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter Array Size");
  int n=sc.nextInt();
  int arr[] = new int [n];
  System.out.println("Enter Array Element "+n);
  for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
  }
  int min=arr[0];
   for(int i=0;i<arr.length-1;i++){
     if(arr[i]<min||(arr[i]%2==0)){
        arr[i]=arr[i+1];
        break;
     }
   }
   System.out.println("After Remove Smallest even element");
   for(int i=0;i<arr.length;i++){ 
     System.out.println(arr[i]);
   }  
 }
}
