package array;
import java.util.stream.IntStream;


public class SquaresOfASortedArray977 {

    /*Given an integer array nums sorted in non-decreasing order,
    return an array of the squares of each number sorted in non-decreasing order.*/
    public static void main(String[] args) {

    }
    public int[] sortedSquares(int[] nums) {
        //int[] squares = new int[nums.length];
        /*Set<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            sortedSet.add(nums[i] * nums[i]);
        }*/
        return IntStream.of(nums)
                .map(x-> x * x)
                .sorted()
                .toArray();

    }

    public int[] sortedSquaresNew(int[] nums) {
        int[] squares = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            squares[i] = Math.abs(nums[start]) > Math.abs(nums[end]) ? start++ : end--;

        }
        return squares;
    }

}
