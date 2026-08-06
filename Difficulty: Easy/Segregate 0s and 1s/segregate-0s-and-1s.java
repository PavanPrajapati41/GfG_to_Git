class Solution {
    void segregate0and1(int[] arr) {
        int n = arr.length;
        int i =0, j = n-1;
        //Optimised
        while (i<j){
            if( arr[i] == 0) i++;
            else if(arr[j] == 1) j--;
            else if (i>j) break;
            else if( arr[i] == 1 && arr[j] == 0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
        }
      }
    }
  }