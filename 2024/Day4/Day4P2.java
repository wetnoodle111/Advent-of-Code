import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Day4P2{
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

        for(int y = 1; y < input.size() - 1; y++){
            for(int x = 1; x < input.get(y).length() - 1; x++){
                if(input.get(y).charAt(x) == 'A'){
                    char[] a = new char[4];
                    int i = 0;
                    int sum = 0;
                    for(int y_ = -1; y_ <= 1; y_ += 2){
                        for(int x_ = -1; x_ <= 1; x_ += 2){
                            char c = input.get(y + y_).charAt(x + x_);
                            sum += c;
                            a[i] = c;
                            i++;
                        }
                    }

                    if(a[1] == a[2]){
                        continue;
                    }

                    if(sum == 320){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}