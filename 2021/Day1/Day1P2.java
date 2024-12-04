import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Day1P2{
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

        int previous = Integer.MAX_VALUE;
        int current;
        int count = 0;
        for(int i = 0; i + 2 < input.size(); i++){
            current = Integer.parseInt(input.get(i)) + Integer.parseInt(input.get(i + 1)) + Integer.parseInt(input.get(i + 2));
            if(previous < current){
                count++;
            }
            previous = current;
        }
        System.out.println(count);
    }
}