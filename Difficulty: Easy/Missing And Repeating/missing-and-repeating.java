class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        
        ArrayList<Integer> result = new ArrayList<> ();
        int n = arr.length;
        int [] freq = new int [n+1];
        
        for (int i =0; i < n; i++){
            freq [arr[i]] ++;
        }
        int duplicate = -1;
        int missing = -1;
        
        for (int i =1; i <=n; i++){
            if (freq [i] == 2){
                duplicate = i;
            }
             if ( freq[i] == 0){
                 missing = i;
             }
        }
        result.add(duplicate);
        result.add(missing);
        return result;
    }
}
