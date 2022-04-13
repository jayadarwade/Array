//4) Write a Program to search an element in array and also find total occurance of given element and index
import java.util.Scanner;
class Search{
   public static void main(String arg[]){
     Scanner sc =new Scanner(System.in);
     int n;
     System.out.println("Enter the total number of element");
     n=sc.nextInt();
     int arr[]=new int [n];
     System.out.println("Enter the element of the array");
     for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
     }
     System.out.println("Enter the element to be search");
     int search=sc.nextInt();
     int flag=0;
     for(int i=0;i<n;i++){
      if (arr[i]==search){
       System.out.println("Element "+search+"found at "+i+"position ");
        flag++;
      }
     }
     if(flag==0)
      System.out.println("Element "+search+"not found ");
     else 
      System.out.println("total occurance"+flag);
 }
}       
