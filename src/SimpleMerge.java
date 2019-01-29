/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] out = new int[arr1.length + arr2.length];
        for (int i = 0, idx1 = 0, idx2 = 0; i < out.length; i++) {
            if (idx2 == arr2.length || idx1 < arr1.length && arr1[idx1] < arr2[idx2])
                out[i] = arr1[idx1++];
            else
                out[i] = arr2[idx2++];
        }
        return out;
    }

}
