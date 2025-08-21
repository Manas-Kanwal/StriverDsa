package array;
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;  

        // Edge case: if array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }

        // j points to the position where the next unique element should be placed
        int j = 1;

        // i scans through the array starting from index 1
        int i = 1;

        // Traverse the array
        while (i < n) {
            // If the current element is different from the previous one,
            // it means nums[i] is a new unique element
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];  // Place unique element at index j
                j++;                // Move j forward
            }
            i++; // Always move i forward to check next element
        }

        // j is the count of unique elements
        return j;
    }
}
