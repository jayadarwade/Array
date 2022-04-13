//13) WAP to find intersection of two given arrays of type int.
class Main {
 public static void main(String[] args) {
        int[] firstArr = {1, 2, 3, 4, 15, 6};
        int[] secondArr = {4, 9, 13, 15, 16, 17};
        int i = 0;
        int j = 0;
        while (i < firstArr.length && j < secondArr.length) {
            if (firstArr[i] < secondArr[j]) {
                i++;
            } else if (firstArr[i] > secondArr[j]) {
                j++;
            } else {
                System.out.print(firstArr[i] + " ");
                i++;
                j++;
            }
        }
    }
}

