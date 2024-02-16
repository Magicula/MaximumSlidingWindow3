public class Main {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        // Check if the input array is null or empty
        if (nums == null || nums.length == 0) return new int[0];

        // Length of the input array
        int n = nums.length;

        // Initialize an array to store the result
        int[] result = new int[n - k + 1];

        // Iterate through the input array using a sliding window of size k
        for (int i = 0; i <= n - k; i++) {
            // Initialize a variable to track the maximum value in the current window
            int max = Integer.MIN_VALUE;

            // Iterate through the current window and find the maximum value
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }

            // Store the maximum value of the current window in the result array
            result[i] = max;
        }

        // Return the result array containing maximum values for each window
        return result;
    }

    public static void main(String[] args) {
        // Example input array
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};

        // Size of the sliding window
        int k = 3;

        // Call the maxSlidingWindow function and get the result array
        int[] result = maxSlidingWindow(nums, k);

        // Print the result array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
