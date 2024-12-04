import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Day1P1{
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
        List<Integer> leftList = new ArrayList<Integer>();
        List<Integer> rightList = new ArrayList<Integer>();

        for(String s : input){
            String[] sl = s.split(" ");
            leftList.add(Integer.parseInt(sl[0]));
            rightList.add(Integer.parseInt(sl[sl.length - 1]));
        }

        Collections.sort(leftList);
        Collections.sort(rightList);

        for(int i = 0; i < leftList.size(); i++){
            count += Math.abs(leftList.get(i) - rightList.get(i));
        }
        System.out.println(count);
    }
}