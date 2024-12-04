import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Day1P1{
    static Scanner s = new Scanner(System.in);
    static int previous;
    static int current;
    static int count = 0;
    public static void main(String[] args){
        List<String> input = new ArrayList<String>();
        while(s.hasNextLine()){
            String line = s.nextLine().trim();
            if(line.length() > 0){
                input.add(line);
            }
        }

        
        previous = Integer.parseInt(input.get(0));
        for(String s : input){
            if(Integer.parseInt(s) > previous){
                count++;
            }
            previous = Integer.parseInt(s);
        }
        System.out.println("Output: " + count);
        
    }
}