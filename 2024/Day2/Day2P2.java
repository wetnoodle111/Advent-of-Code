import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Day2P2{
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
            boolean actuallySafe = false;
            String[] strArr = s.split(" ");
            int[] arrL = new int[strArr.length];
            for(int i = 0; i < strArr.length; i++){
                arrL[i] = Integer.parseInt(strArr[i]);
            }

            for(int n = -1; n < arrL.length; n++){
                List<Integer> arr = new ArrayList<Integer>();
                for(int w : arrL){
                    arr.add(w);
                }
                if(n != -1){
                    arr.remove(n);
                }
                boolean safe = true;
                boolean increasing = arr.get(0) < arr.get(1);
                for(int i = 0; i < arr.size() - 1; i++){
                    if(!((arr.get(i) < arr.get(i+1)) == increasing && arr.get(i) != arr.get(i+1) && Math.abs(arr.get(i) - arr.get(i+1)) <= 3)){
                        safe = false;
                    }
                }
                if(safe){
                    actuallySafe = true;
                }
            }
            if(actuallySafe){
                count++;
            }
        }
        System.out.println(count);
    }
}