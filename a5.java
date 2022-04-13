//5) WAP  to find duplicate number on Integer array in Java?
import java.util.Scanner;
class Duplicate{
 public static void main(String args[]){
  Scanner sc =new Scanner(System.in);
  int i,j,n;
  String s = "";
  String s2 = "";
  System.out.println("Enter Array Size");
  n=sc.nextInt();
  int arr[] = new int [n];
  System.out.println("Enter Array Element "+n);
  for(i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
  }
  System.out.println("Duplicate");
  for(i=0;i<arr.length;i++){
   for(j=i+1;j<arr.length;j++){
    if(arr[i]==arr[j]){
     s2=Integer.toString(arr[i]);              
    if(s.indexOf(s2)<0){
     s+=Integer.toString(arr[i]); 
     break;
     }
   }
  }
 }
  System.out.println(s);
 }
}  
