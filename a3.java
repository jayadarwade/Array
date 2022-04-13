//3) Write a java program to find  one missing number in array (Remember ,All element are unique.).
import java.util.Scanner;
class MissingElement{
 public static void main(String arg[]){
  Scanner sc = new Scanner(System.in);
  int arr[] = new int [5];
  int a[] = {25,85,96,74,55};
  int flag=0;   
  System.out.println("enter the element of array");
   for(int i=0;i<a.length;i++){
    arr[i]= sc.nextInt();
   }
   for(int i =0;i<a.length;i++){
     if(a[i]!=arr[i])
      flag=1;
      break;
   }
   if(flag==1)
     System.out.println("Element Missing");
   else
     System.out.println("Element not missing");    
  }
}
