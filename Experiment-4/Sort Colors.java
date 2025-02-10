public class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) { // Move red (0) to the left
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) { // Keep white (1) in place
                mid++;
            } else { // Move blue (2) to the right
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        sol.sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
