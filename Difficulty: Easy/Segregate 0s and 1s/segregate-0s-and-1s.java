class Solution {
    void segregate0and1(int[] arr) {
        int zeros = 0;
        int n = arr.length;
        for (int ele : arr) {
            if (ele == 0) {
                zeros++;
            }
        }
        for (int i = 0; i < zeros; i++) {
            arr[i] = 0;
        }
        for (int i = zeros; i <n; i++) {
            arr[i] = 1;
        }
    }
}