import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
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
        
        int x = 0;
        int y = 0;
        int aim = 0;

        for(String s : input){
            String[] i = s.split(" ");
            switch(i[0].charAt(0)){
                case 'u':
                    aim -= Integer.parseInt(i[1]);
                    break;
                case 'd':
                    aim += Integer.parseInt(i[1]);
                    break;
                case 'f':
                    x += Integer.parseInt(i[1]);
                    y += Integer.parseInt(i[1]) * aim;
                    break;
            }
        }
        System.out.println(x * y);
    }
}
