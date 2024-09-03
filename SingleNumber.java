public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] nums1 = {2, 2, 3, 2};
        int[] nums2 = {0, 1, 0, 1, 0, 1, 99};
        
        System.out.println("Single number in nums1: " + sn.singleNumber(nums1)); // Output: 3
        System.out.println("Single number in nums2: " + sn.singleNumber(nums2)); // Output: 99
    }
}
