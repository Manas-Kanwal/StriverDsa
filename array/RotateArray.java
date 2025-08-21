package array;

public class RotateArray {
    public void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k % n;   // handle cases where k > n

    // Step 1: Reverse the whole array
    reverse(0, n - 1, nums);

    // Step 2: Reverse the first k elements
    reverse(0, k - 1, nums);

    // Step 3: Reverse the remaining n-k elements
    reverse(k, n - 1, nums);
}

static void reverse(int left , int right , int []arr) {
    // Standard array reverse logic
    while(left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}

}
