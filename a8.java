//8)How do you separate zeros and non-zeros in a given Array in java?
//	Sample Input- {0,10,43,27,0,98,75,59,191,0}
//	Sample Output-[10, 43, 27, 98, 75, 59, 191, 0, 0, 0] 
class Separate{
 public static void main(String args[]){
  int i,temp=0;
  int a[] = {0,10,43,27,0,98,75,59,191,0};
  int pos=0;
       for(i=0;i<a.length;i++){
         if(a[i]!=0){
           a[pos]=a[i];
           pos++;
         }
       }
       while(pos<a.length){
         a[pos]=0;
         pos++;
       } 
       for(i=0;i<a.length;i++)
       System.out.println(a[i]+" ");  
 } 
} 
