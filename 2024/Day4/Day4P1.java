import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Day4P1{
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

        for(int y = 0; y < input.size(); y++){
            for(int x = 0; x < input.get(y).length(); x++){
                if(input.get(y).charAt(x) == 'X'){
                        for(int x_ = -1; x_ <= 1; x_++){
                            for(int y_ = -1; y_ <= 1; y_++){
                                boolean b = true;
                                if(x_ == 0 && y_==0){
                                    continue;
                                }
                                try{
                                    for(int i = 1; i <= 3; i++){
                                        if(input.get(y + (i * y_)).charAt(x + (i * x_)) != "XMAS".charAt(i)){
                                            b = false;
                                        }
                                    }
                                } catch (Exception e){
                                    continue;
                                }
                                if(b){
                                    count++;
                                }
                            }
                        }
                }
            }
        }

        System.out.println(count);
    }
}