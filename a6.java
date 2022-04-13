//6)How to find largest and smallest number in unsorted array?
import java.util.Scanner;
class LargestSmallest{
 public static void main(String arg[]){
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter Array Size");
  int n=sc.nextInt();
  int arr[] = new int [n];
  System.out.println("Enter Array Element "+n);
  for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
  }
  int max=arr[0];
  int min=arr[0];
   for(int i=0;i<arr.length;i++){
     if(arr[i]>max){
        max=arr[i];
     }
     else if(arr[i]<min){
        min=arr[i];
     }
   }
  System.out.println("min : "+min+ "and max : "+max);
 }
}
