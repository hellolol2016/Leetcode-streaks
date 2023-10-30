import java.util.*;

class sortIntegerByOneBits{
    public int[] sortByBits(int[] arr) {
        Integer[] array = new Integer[arr.length];
        for(int i =0;i<arr.length;i++){
            array[i] = arr[i];
        }

        Arrays.sort(array, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if(Integer.bitCount(a) == Integer.bitCount(b)){
                    return a-b;
                }
                return Integer.bitCount(a)-Integer.bitCount(b);
            }
        });


        for(int i =0;i<arr.length;i++){
            arr[i] = array[i];
        }

        return arr;
    }
}