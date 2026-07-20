lass Solution {
    private static int countInRange(int[] nums, int num, int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private static int majorityElementRec(int[] nums, int low, int high) {
        // Base case: a single element is always the majority.
        if (low == high) {
            return nums[low];
        }

        // Divide the array into two halves.
        int mid = low + (high - low) / 2;

        int left = majorityElementRec(nums, low, mid);
        int right = majorityElementRec(nums, mid + 1, high);

        // If both halves agree, return the common majority.
        if (left == right) {
            return left;
        }

        // Otherwise, count each candidate in the current range.
        int leftCount = countInRange(nums, left, low, high);
        int rightCount = countInRange(nums, right, low, high);

        return leftCount > rightCount ? left : right;
    }

    public int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }
}
