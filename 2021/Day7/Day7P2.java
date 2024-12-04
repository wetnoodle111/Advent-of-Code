import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Day7P2{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        String input = s.next();

        String[] numsUnparsed = input.split(",");
        int[] nums = new int[numsUnparsed.length];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(numsUnparsed[i]);
        }
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length - 1];

        int minFuel = Integer.MAX_VALUE;
        for(int i = min; i <= max; i++){
            int sum = 0;
            for(int n : nums){
                for(int w = Math.abs(n - i); w > 0; w--){
                    sum += w;
                }
            }
            if(sum < minFuel){
                minFuel = sum;
            }
        }
        System.out.println(minFuel);
    }
}