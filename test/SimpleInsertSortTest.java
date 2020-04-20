import com.sort.MergeSort;

public class SimpleInsertSortTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        MergeSort.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
