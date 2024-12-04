import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Day8P1{
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
            String[] s1 = s.split(" ");
            for(int i = 11; i <= 14; i++){
                switch(s1[i].length()){
                    case 2:
                    case 4:
                    case 3:
                    case 7:
                        count++;
                        break;
                }
            }
        }
        System.out.println(count);
        
    }
}