import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Day3P1{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        String input = "";
        while(s.hasNextLine()){
            input += s.nextLine();
        }


        int sum = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == ')'){
                String line = "";
                int n = 0;
                boolean b = true;
                while(true){
                    if(i - n == 0){
                        break;
                    }
                    if(input.charAt(i - n) == 'm'){
                        line = Character.toString(input.charAt(i - n)) + line;
                        break;
                    } else {
                        line = Character.toString(input.charAt(i - n)) + line;
                        n++;
                    }
                }
                
                

                if(!(line.length() >= 8 && line.length() <= 12)){
                    continue;
                }

                if(!line.substring(0, 4).equals("mul(")){
                    continue;
                }

                if(line.indexOf(",") == -1){
                    continue;
                }

                if(line.indexOf(",") != line.lastIndexOf(",")){
                    continue;
                }

                line = line.substring(4, line.length() - 1);
                String[] nums = line.split(",");
                boolean ok = true;
                for(String s : nums){
                    try{
                        Integer.parseInt(s);
                    } catch (Exception e){
                        ok = false;
                        break;
                    }
                }
                if(!ok){
                    continue;
                }

                sum += Integer.parseInt(nums[0]) * Integer.parseInt(nums[1]);


            }
        }
        System.out.println(sum);
    }
}