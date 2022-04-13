//16WAP to print left diagonal element of matrix using only one loop otherwise your program will be consider as a wrong program.
import java.util.Scanner;
class  LeftDiagonal{
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
   for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
     System.out.print(a[i][j] +" ");
    }
   System.out.println();   
   }
   for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
     if(i == j)
    System.out.println(a[i][j] + " ");
    }
   } 
 }
}  
