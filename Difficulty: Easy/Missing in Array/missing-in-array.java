class Solution {
    int missingNum(int arr[]) {
        
        long  n = arr.length +1;
        long sum = n*(n+1)/2;
        long ArraySum = 0;
        for(int ele : arr){
            ArraySum +=ele;
        }
        return (int) (sum - ArraySum);
    }
}