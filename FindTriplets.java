
import java.util.Arrays;
public class FindTriplets {

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, 4};
        int n = arr.length;

        int found = 0;

      
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         int sum = arr[i] + arr[j];
        //         int complement = -sum;
        //
        //         if (map.containsKey(complement)) {
        //             System.out.println("Triplet found: " + map.get(complement) + ", " + arr[i] + ", " + arr[j]);
        //             found = true;
        //             break;  // Exit inner loop after finding a triplet
        //         } else {
        //             map.put(arr[j], arr[j]);
        //         }
        //     }
        //     if (found) break;  // Exit outer loop if triplet found
        // }

       
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    found = 1;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        if (found!=0) {
            System.out.println("No triplets found with zero sum");
        }
    }
}
