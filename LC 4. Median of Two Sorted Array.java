class Solution {
    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        if(arr1.length==0) {
            return singleARRAYmedian(arr2);
        }
        else if(arr2.length==0) {
            return singleARRAYmedian(arr1);
        }
        else {
            if (arr1[0] == arr1[arr1.length - 1] && 
            arr1[arr1.length - 1] == arr2[0] &&
            arr2[0] == arr2[arr2.length - 1]) {
            return arr1[0];
        }
        if(arr1.length>arr2.length) {
            return findMedianSortedArrays(arr2,arr1);
        }
    }
    
        int sizeOfcombined  = arr1.length + arr2.length;
        int stop = arr1.length;
        int sizeOfLeftSubarr = sizeOfcombined/2;
        // represent the index
        int aL = 0, aR = 0, bL = 0, bR = 0;
        // represent the actual elements
        int ALeft = 0, ARight = 0, BLeft = 0, BRight = 0;
        while(aL<=stop) {
            int contribOfarr1 = aL+1;
            int contribOfarr2 = sizeOfLeftSubarr - contribOfarr1;
            bL = contribOfarr2 - 1;
            aR = aL + 1;
            bR = bL + 1;

            // ALeft is empty
            if(aL<0) {
                ALeft = Integer.MIN_VALUE;
            }
            else {
                ALeft = arr1[aL];
            }
            // BLeft is empty
            if(bL<0) {
                BLeft = Integer.MIN_VALUE;
            }
            else {
                BLeft = arr2[bL];
            }
            // ARight is empty
            if(aR>=arr1.length) {
                ARight = Integer.MAX_VALUE;
            }
            else {
                ARight = arr1[aR];
            }
            // BRight is empty
            if(bR>=arr2.length) {
                BRight = Integer.MAX_VALUE;
            }
            else {
                BRight = arr2[bR];
            }

            if(ALeft<=BRight && BLeft<=ARight) {
                if(sizeOfcombined%2==0) {
                    return (Math.max(ALeft,BLeft) + Math.min(ARight,BRight))/2.0;
                }
                else {
                    return (Math.min(ARight,BRight));
                }
            }
            else {
                if(ALeft>BRight) {
                    aL = aL - 1;
                }
                else {
                    aL  = aL + 1;
                }
            }
        }
        return Integer.MIN_VALUE;
    }
    public static double singleARRAYmedian(int[] arr) {
        int len = arr.length;
        // for even
        if(len%2==0) {
            int idx = len/2;
            return (double) (arr[idx] + arr[idx-1])/2;
        }
        else {
            // for odd
            return (double) (arr[len/2]);
        }
    }
    
}
