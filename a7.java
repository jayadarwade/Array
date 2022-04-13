//7)Write a program to remove duplicates from array in Java?
import java.util.Scanner;
class Duplicate{
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
  for(i=0;i<arr.length-1;i++){
   if(arr[i]!=arr[i+1]){
    arr[j]=arr[i];
    j++;
   }
  }
  arr[j]=arr[arr.length-1];
  System.out.println("After removing Duplicate");
  for(i=0;i<=j;i++){
    System.out.println(arr[i]+" ");
  }
 }
}   
