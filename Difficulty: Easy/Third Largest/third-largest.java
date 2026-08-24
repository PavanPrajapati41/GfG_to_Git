class Solution {
    public int thirdLargest(List<Integer> arr) {
        
        if(arr.size () <3){  // check if elements > 3
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;
        
        for (int x : arr){  // Enhanced For Loop
            if (x >= max){
                tmax = smax;
                smax = max;
                max = x;
            }
             else if ( x>= smax){
                 tmax = smax;
                 smax = x;
             }
              else if ( x >= tmax){
                  tmax = x;
              }
        }
        return tmax;
        }
    }
