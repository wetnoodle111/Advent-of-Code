import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Day3P2{
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        List<String> oxygen = new ArrayList<String>();
        List<String> carbon = new ArrayList<String>();
        while(s.hasNextLine()){
            String line = s.nextLine().trim();
            if(line.length() > 0){
                oxygen.add(line);
                carbon.add(line);
            }
        }


        List<String> numsWith0 = new ArrayList<String>();
        List<String> numsWith1 = new ArrayList<String>();
        for(int i = 0; i < oxygen.get(0).length() && oxygen.size() > 1; i++){
            numsWith0.clear();
            numsWith1.clear();
            int count0 = 0;
            int count1 = 0;
            for(String s : oxygen){
                if(s.charAt(i) == '0'){
                    count0++;
                    numsWith0.add(s);
                } else {
                    count1++;
                    numsWith1.add(s);
                }
            }
            List<String> majorityNum;
            if(count1 >= count0){
                majorityNum = numsWith1;
            } else {
                majorityNum = numsWith0;
            }
            List<String> toRemove = new ArrayList<String>();
            for(String s : oxygen){
                if(!majorityNum.contains(s)){
                    toRemove.add(s);
                }
            }
            for(String s : toRemove){
                oxygen.remove(s);
            }
        }

        for(int i = 0; i < carbon.get(0).length() && carbon.size() > 1; i++){
            numsWith0.clear();
            numsWith1.clear();
            int count0 = 0;
            int count1 = 0;
            for(String s : carbon){
                if(s.charAt(i) == '0'){
                    count0++;
                    numsWith0.add(s);
                } else {
                    count1++;
                    numsWith1.add(s);
                }
            }
            List<String> majorityNum;
            if(count1 >= count0){
                majorityNum = numsWith1;
            } else {
                majorityNum = numsWith0;
            }
            List<String> toRemove = new ArrayList<String>();
            for(String s : carbon){
                if(majorityNum.contains(s)){
                    toRemove.add(s);
                }
            }
            for(String s : toRemove){
                carbon.remove(s);
            }
        }

        System.out.println(Integer.parseInt(oxygen.get(0), 2) * Integer.parseInt(carbon.get(0), 2));
    }
}
