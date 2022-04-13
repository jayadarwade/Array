//14) WAP to multiplication of two matrix(2*3).
import java.util.Scanner;
class Multi{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Array Size");
  int n=sc.nextInt();
  int m=sc.nextInt();
  int a[][] = new int [n][m];
  int a2[][]=new int [n][m];
  int mul[][]=new int [n][m];
  System.out.println("Enter Array Element "+n);
  for(int i=0;i<n;i++){
   for(int j=0;j<m; j++){
    a[i][j] =sc.nextInt();
   }
  }
  System.out.println("Enter the elements of 2nd matrix row wise : n");
  for (int i = 0; i < n; i++){
   for(int j = 0; j < m; j++){
     a2[i][j] =sc.nextInt();
   }
 }
 
  System.out.println("Multiplying the matrices : ");
  for(int i = 0; i < n; i++){
   for(int j = 0; j < m; j++){
    for(int k = 0; k < n; k++){
     mul[i][j] = mul[i][j] + a[i][k] * a2[k][j];
    }
   }
  }
  System.out.println("Product :");
  for (int i = 0; i < n; i++){
   for(int j = 0; j < m; j++){
    System.out.print(mul[i][j] + " ");
   }
   System.out.println();
  }
 }
}
