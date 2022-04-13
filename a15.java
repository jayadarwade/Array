//15) WAP to sort 2D array row wise.
import java.util.Scanner;
class Array{
 static int t;
 static void RowWiseSort(int a[][]){
  for(int i=0;i<a.length;i++){
   for(int j=0;j<a[i].length;j++){
    for(int k=0;k<a[i].length-j-1;k++){
      if(a[i][k]==a[i][k+1]){
         t = a[i][k];
         a[i][k]=a[i][k+1];
         a[i][k+1]=t;
       }
      }
    }
   }
   for(int i = 0; i <a.length; i++){
   for(int j = 0; j <a[i].length; j++)
    System.out.print(a[i][j] + " ");
    System.out.println();
   }
 }  
}
class Test{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Array Size");
  int n = sc.nextInt();
  int a[][] = new int [n][n];
  System.out.println("Enter Array Element"+n);
   for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
     a[i][j]=sc.nextInt();
    }
   }
   Array.RowWiseSort(a);
 }
}   
