import com.sort.BubbleSort;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        BubbleSort.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        int[] arr2 = {5,4,3,2,1};
        BubbleSort.sort(arr2);
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
