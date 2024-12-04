import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Day2P1{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        List<String> input = new ArrayList<String>();
        while(s.hasNextLine()){
            String line = s.nextLine().trim();
            if(line.length() > 0){
                input.add(line);
            }
        }
        
        int count = 0;

        for(String s : input){
            boolean safe = true;
            String[] strArr = s.split(" ");
            int[] arr = new int[strArr.length];
            for(int i = 0; i < strArr.length; i++){
                arr[i] = Integer.parseInt(strArr[i]);
            }

            boolean increasing = arr[0] < arr[1];
            for(int i = 0; i < arr.length - 1; i++){
                if(!((arr[i] < arr[i+1]) == increasing && arr[i] != arr[i+1] && Math.abs(arr[i] - arr[i+1]) <= 3)){
                    safe = false;
                }
            }
            if(safe){
                count++;
            }
        }
        System.out.println(count);
    }
}