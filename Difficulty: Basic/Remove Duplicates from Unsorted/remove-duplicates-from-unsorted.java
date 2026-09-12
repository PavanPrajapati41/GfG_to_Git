class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] seen = new boolean[100001];

        for (int i = 0; i < arr.length; i++) {
            if (!seen[arr[i]]) {
                result.add(arr[i]);
                seen[arr[i]] = true;
            }
        }

        return result;
    }
}