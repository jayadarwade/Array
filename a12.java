//12) WAP to find union of two given arrays of type int.
class Main {
 public static void main(String[] args) {
   int[] firstArr = {1, 2, 2, 4, 5, 6};
   int[] secondArr = {4, 9, 13, 15, 16, 17};
   int i = 0,j=0;
    while (i < firstArr.length && j < secondArr.length) {
      if (firstArr[i] < secondArr[j]) {
         System.out.print(firstArr[i] + " ");
         i++;
        } else if (secondArr[j] < firstArr[i]) {
         System.out.print(secondArr[j] + " ");
         j++;
         } else {
         System.out.print(firstArr[i] + " ");
         i++;
           j++;
         }
        }
       while (i < firstArr.length) {
            System.out.print(firstArr[i] + " ");
            i++;
        }
       while (j < secondArr.length) {
            System.out.print(secondArr[j] + " ");
            j++;
        }
    }

}



