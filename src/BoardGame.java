import java.util.Scanner;
public class BoardGame {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Would you like a medium or large map? Type (m) for medium or (l) for large.");
        String response = r.nextLine();
        response = response.toLowerCase();
        if (response.equals("m")){
            Board game = new Board(20, 25, 30, 25, 20);
            System.out.println(game);
        } else if (response.equals("l")) {
            Board game = new Board(30, 35, 40, 35, 30);
            System.out.println(game);
        }


                TheBoard gui = new TheBoard();


    }
}
