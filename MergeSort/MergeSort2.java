import java.util.Scanner;
class MergeSort2 {
    private static void printArray(int[] array) {
        for(int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static int[] mergesort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int midpoint = array.length / 2;
        int[] left = new int[midpoint];
        int[] right;

        if (array.length % 2 == 0) {
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1];
        }
        for(int i=0; i<midpoint ;i++){
            left[i]=array[i];
        }
        for(int j=0; j<right.length ;j++){
            right[j]=array[midpoint+j];
        }
        int[] result = new int[array.length];

        left = mergesort(left);
        right = mergesort(right);

        result = merge(left, right);

        return result;
    }
    private static int[] merge(int[] left, int[] right){
        int[] result =new int[left.length + right.length];

        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;

        while (leftPointer<left.length || rightPointer<right.length) {
            if (leftPointer<left.length && rightPointer<right.length) {
                if(left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            }
            else if(leftPointer<left.length) {
                result[resultPointer++] = left[leftPointer++];
            }
            else if (rightPointer<right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;

    }
    public static void main(String args[]) {
        int[] array = {5, 4, 6, 2, 3, 7, 6 , 0, 3, 3};
        System.out.println("Input: ") ;
        printArray(array);

        array = mergesort(array);
        System.out.println("Output: ") ;
        printArray(array);

    }
}
