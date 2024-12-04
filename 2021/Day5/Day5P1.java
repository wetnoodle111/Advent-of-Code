import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Day5P1{
    static Scanner s = new Scanner(System.in);
    static int[][] map;
    static int count = 0;
    public static void main(String[] args){
        List<String> input = new ArrayList<String>();
        while(s.hasNextLine()){
            String line = s.nextLine().trim();
            if(line.length() > 0){
                input.add(line);
            }
        }

        List<line> lines = new ArrayList<line>();

        for(String s : input){
            String[] x1andy2 = s.split(",");
            String[] y1andx2 = x1andy2[1].split(" ");
            lines.add(new line(Integer.parseInt(x1andy2[0]), Integer.parseInt(y1andx2[0]), Integer.parseInt(y1andx2[2]), Integer.parseInt(x1andy2[2])));
        }

        map = new int[999][999];
        for(int[] a : map){
            Arrays.fill(a, 0);
        }

        for(line l : lines){
            if(l.x1 == l.x2){
                int max = Math.max(l.y1, l.y2);
                int min = Math.min(l.y1, l.y2);
                for(int i = max; i >= min; i--){
                    modify(l.x1, i);
                }
            } else if(l.y1 == l.y2){
                int max = Math.max(l.x1, l.x2);
                int min = Math.min(l.x1, l.x2);
                for(int i = max; i >= min; i--){
                    modify(i, l.y1);
                }
            }
            
        }
        System.out.println(count);
        
        
    }

    static void modify(int x, int y){
        map[y][x]++;
        if(map[y][x] == 2){
            count++;
        }
    }
}

class line{
    int x1;
    int y1;
    int x2;
    int y2;
    line(int x1_, int y1_, int x2_, int y2_){
        x1 = x1_;
        y1 = y1_;
        x2 = x2_;
        y2 = y2_;
    }
}
