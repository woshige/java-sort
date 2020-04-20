import com.sort.ShellSort;

public class ShellSortTest {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        ShellSort.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
