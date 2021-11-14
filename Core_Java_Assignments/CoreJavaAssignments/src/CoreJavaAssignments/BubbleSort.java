package CoreJavaAssignments;


import java.util.Arrays;
public class BubbleSort {
 
 
    public static void main(String args[]) {

        int[] unsorted = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        bubbleSort(unsorted);
        int[] test = { 5, 3, 2, 1};
        bubbleSort(test);
     
    }  
    public static void bubbleSort(int[] unsorted){
        System.out.println("unsorted array before sorting : " + Arrays.toString(unsorted));

        for(int i=0; i<unsorted.length -1; i++){
            for(int j= 1; j<unsorted.length -i; j++){
             
                if(unsorted[j-1] > unsorted[j]){
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j-1];
                    unsorted[j-1] = temp;
                }
            }
            System.out.printf("unsorted array after %d pass %s: %n", i+1, Arrays.toString(unsorted));
        }
    }
}

