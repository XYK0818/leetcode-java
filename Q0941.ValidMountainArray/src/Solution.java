public class Solution {
    public static boolean validMountainArrayWhile(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }

    public static boolean validMountainArrayFor(int[] arr) {
        //if size is < 2 then it not mountain
        if(arr.length<3) return false;


        int topidx=0;
        int top=0;

        //find max value and that index
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>top)
            {
                top = arr[i];
                topidx=i;
            }
        }

        //check that one side mountain or not .
        if(top==arr[arr.length-1] || top==arr[0]) return false;

        //check perfact mountain or not
        int i=0;
        while(i<topidx)
        {
            if(arr[i] >= arr[i+1]) return false;
            i++;

        }

        while(topidx<arr.length-1)
        {
            if(arr[topidx] <= arr[topidx+1]) return false;
            topidx++;

        }
        return true;
    }
}
