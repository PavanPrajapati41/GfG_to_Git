class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {

        ArrayList<Integer> result = new ArrayList<>();

        int[] freq = new int[100001];

        // Count elements of a
        for (int i = 0; i < a.length; i++) {
            freq[a[i]]++;
        }

        // Check elements of b
        for (int i = 0; i < b.length; i++) {
            if (freq[b[i]] > 0) {
                result.add(b[i]);
                freq[b[i]]--;
            }
        }

        Collections.sort(result);
        return result;
    }
}