import com.sort.HeapSort;

public class HeapSortTest {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        HeapSort.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
