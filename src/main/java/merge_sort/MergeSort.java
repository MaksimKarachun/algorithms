package merge_sort;

public class MergeSort
{
    public static void mergeSort(int[] array)
    {
        int n = array.length;
        int middle = n / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[n - middle];

        for (int i = 0; i < middle; i++) {
            leftArray[i] = array[i];
        }
        for (int i = middle; i < n; i++) {
            rightArray[i - middle] = array[i];
        }
        if(leftArray.length != 1)
        mergeSort(leftArray);
        if(rightArray.length != 1)
        mergeSort(rightArray);

        merge(array, leftArray, rightArray);
    }

    private static void merge(int[] array, int[] left, int[] right)
    {
        //TODO
        int leftIndex = 0;
        int rightIndex = 0;
        for(int i = 0; i < left.length + right.length; i++){
            if (leftIndex == left.length){
                while (rightIndex < right.length) {
                    array[i] = right[rightIndex];
                    rightIndex++;
                    i++;
                }
                break;
            }
            if (rightIndex == right.length){
                while (leftIndex < left.length) {
                    array[i] = left[leftIndex];
                    leftIndex++;
                    i++;
                }
                break;
            }
            if (left[leftIndex] < right[rightIndex]) {
                array[i] = left[leftIndex];
                leftIndex++;
            }
            else {
                array[i] = right[rightIndex];
                rightIndex++;
            }
        }

    }
}
