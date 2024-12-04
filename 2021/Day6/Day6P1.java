import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Day6P1{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        String input = s.next();

        List<Integer> fish = new ArrayList<Integer>();

        String[] numsUnparsed = input.split(",");
        for(String s : numsUnparsed){
            fish.add(Integer.parseInt(s));
        }

        for(int n = 0; n < 80; n++){
            int fishToAdd = 0;
            for(int i = 0; i < fish.size(); i++){
                if(fish.get(i).equals(0)){
                    fish.set(i, 6);
                    fishToAdd++;
                } else {
                    fish.set(i, fish.get(i) - 1);
                }
            }
            for(int i = 0; i < fishToAdd; i++){
                fish.add(8);
            }
        }
        System.out.println(fish.size());
        
    }
}