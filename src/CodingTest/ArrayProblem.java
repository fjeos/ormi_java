package CodingTest;

public class ArrayProblem {
    public static void main(String[] args) {
        System.out.println(search(new int[] {1,2,3,4,5} ,5));
        System.out.println(search(new int[] {1,2,3,4,5} ,6));
    }

    static int search(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if(target == nums[i]){
                return i;
            }
        }
        return -1;
    }
}
