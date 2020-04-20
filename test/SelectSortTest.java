import com.sort.SelectSort;

public class SelectSortTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        SelectSort.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("----------------------");
        int[] arr2 = {5,4,3,2,1};
        SelectSort.sort(arr2);
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
