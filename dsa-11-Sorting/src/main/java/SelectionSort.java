public class SelectionSort {
    public static int[] selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[minIndex]) minIndex=j;
            }

            swap(array,minIndex,i);

        }
        return array;
    }

    public static void swap(int[] array, int ind1, int ind2){
        int temp = array[ind1];
        array[ind1]= array[ind2];
        array[ind2] = temp;
    }

}
