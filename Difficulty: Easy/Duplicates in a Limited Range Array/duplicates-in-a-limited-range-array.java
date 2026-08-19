class Solution {
     public ArrayList<Integer> findDuplicates(int[] arr) {
         ArrayList<Integer> result = new ArrayList<>();

         int[] freq = new int[arr.length + 1];

         for (int i = 0; i < arr.length; i++) {
             freq[arr[i]]++;
         }

         for (int i = 1; i <= arr.length; i++) {
             if (freq[i] == 2) {
                 result.add(i);
             }
         }

         return result;
     }
 }