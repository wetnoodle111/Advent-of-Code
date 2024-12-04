import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Day6P2{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        String input = s.next();

        long[] fish = new long[9];

        String[] numsUnparsed = input.split(",");
        for(String s : numsUnparsed){
            fish[Integer.parseInt(s)]++;
        }

        for(int n = 0; n < 256; n++){
            long fishToAdd = fish[0];
            for(int i = 1; i <= 8; i++){
                fish[i - 1] = fish[i];
            }
            fish[6] += fishToAdd;
            fish[8] = fishToAdd;
        }

        long sum = (long)0;
        for(int i = 0; i < 9; i++){
            sum += fish[i];
        }
        System.out.println(sum);
        
    }
}