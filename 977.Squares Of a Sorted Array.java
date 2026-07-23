import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] arr) {


    //  squaring using loop
        for (int k = 0; k < arr.length; k++) {
            arr[k] = arr[k] * arr[k];
        }
   // sorting
        Arrays.sort(arr);

        return arr;
    }

}
