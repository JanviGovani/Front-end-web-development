import java.util.*;

class LongestUniqueSubarray {
    public static int longestUniqueSubarray(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxSize = 0;  // Tracks the longest unique subarray size
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            // Expand the window by adding the current element
            freqMap.put(arr[right], freqMap.getOrDefault(arr[right], 0) + 1);

            // Shrink the window if we have duplicate elements
            while (freqMap.get(arr[right]) > 1) {
                freqMap.put(arr[left], freqMap.get(arr[left]) - 1);
                if (freqMap.get(arr[left]) == 0) {
                    freqMap.remove(arr[left]); // Remove the key if its count is 0
                }
                left++;  // Move left pointer to shrink the window
            }

            // **Update maxSize only when the window is unique**
            maxSize = Math.max(maxSize, right - left + 1);
        }

        return maxSize;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 4, 1, 1, 3, 4, 2, 3};
        System.out.println("Longest subarray length with all unique elements: " + longestUniqueSubarray(arr));
    }
}
