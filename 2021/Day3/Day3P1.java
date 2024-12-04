import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Day3P1{
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        List<String> input = new ArrayList<String>();
        while(s.hasNextLine()){
            String line = s.nextLine().trim();
            if(line.length() > 0){
                input.add(line);
            }
        }
        
        String gammaRate = "";
        String epsilonRate = "";

        for(int i = 0; i < input.get(0).length(); i++){
            int count0 = 0;
            int count1 = 0;
            for(String s : input){
                if(s.charAt(i) == '0'){
                    count0++;
                } else {
                    count1++;
                }
            }
            if(count0 > count1){
                gammaRate += "0";
                epsilonRate += "1";
            } else {
                gammaRate += "1";
                epsilonRate += "0";
            }
        }

        System.out.println(Integer.parseInt(gammaRate, 2) * Integer.parseInt(epsilonRate, 2));
    }
}
