/**
 * A simple method that finds smallest missing integer which must be greater than zero,
 * if all numbers are negative then it should return 1
 *
 * @author Farrukh Gafurov
 * @since: 19.05.2019
 */

import java.util.Arrays;

public class Solution {

    public int findSmallestMissingPositiveInt(int[] A){
        Arrays.sort(A);

        if(A[0]>1 || A[A.length-1]<=0)
            return 1;

        for(int i=0;i<A.length-1;i++){
            if(A[i]<0 && A[i+1]<0)
                continue;

            if(A[i]<0){
                if(A[i+1]>1)
                    return 1;
            }

            if(A[i]>=0 && A[i+1]>0)
                if((A[i+1]-A[i])>1)
                    return A[i]+1;
        }

        return A[A.length-1] + 1;
    }
}
