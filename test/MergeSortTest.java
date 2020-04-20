import com.sort.MergeSort;

public class MergeSortTest {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        MergeSort.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
