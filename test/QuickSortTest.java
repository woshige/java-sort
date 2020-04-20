import com.sort.QuickSort;

public class QuickSortTest {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        QuickSort.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
