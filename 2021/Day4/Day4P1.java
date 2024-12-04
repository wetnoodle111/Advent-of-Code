import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Day4P1{
    static Scanner s = new Scanner(System.in);
    public static List<Integer> drawnNumbers = new ArrayList<Integer>();
    public static void main(String[] args){

        List<String> input = new ArrayList<String>();
        while(s.hasNextLine()){
            String line = s.nextLine().trim();
            if(line.length() > 0){
                input.add(line);
            }
        }
        
        List<board> boards = new ArrayList<board>();

        List<String> numbers =  new ArrayList<String>();

        for(String s : input.get(0).split(",")){
            numbers.add(s);
        }
        input.remove(0);

        board currentBoard = new board();
        for(int i = 0; i + 4 < input.size(); i += 5){
            for(int n = 0; n <= 4; n++){
                for(String s : input.get(i + n).split(" ")){
                    if(s.length() > 0){
                        currentBoard.myBoard.get(n).add(s);
                    }
                }
            }
            boards.add(currentBoard);
            currentBoard = new board();
        }

        board winningBoard = new board();
        int i = 0;
        boolean b1 = true;
        while(b1){
            drawnNumbers.add(Integer.parseInt(numbers.get(i)));
            for(board b : boards){
                if(b.check()){
                    winningBoard = b;
                    System.out.println("I ran");
                    b1 = false;
                    break;
                }
            }
            i++;
        }
        int sum = 0;
        for(List<String> l : winningBoard.myBoard){
            for(String s : l){
                if(!drawnNumbers.contains(Integer.parseInt(s))){
                    sum += Integer.parseInt(s);
                }
            }
        }
        sum *= (drawnNumbers.get(drawnNumbers.size()-1));
        System.out.println(sum);

    }
}

class board{
    List<List<String>> myBoard = new ArrayList<List<String>>();
    board(){
        for(int i = 0; i < 5; i++){
            myBoard.add(new ArrayList<String>());
        }
    }

    boolean check(){

        //check vertical
        for(int i = 0; i < 5; i++){
            boolean b = true;
            for(List<String> l : myBoard){
                if(!Day4P1.drawnNumbers.contains(Integer.parseInt(l.get(i)))){
                    b = false;
                }
            }
            if(b){
                return true;
            }
        }


        //check horizontal
        for(List<String> l : myBoard){
            boolean b = true;
            for(int i = 0; i < 5;  i++){
                if(!Day4P1.drawnNumbers.contains(Integer.parseInt(l.get(i)))){
                    b = false;
                }
            }
            if(b){
                return true;
            }
        }
        return false;
    }
}
