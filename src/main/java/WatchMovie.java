import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System. in);
        System.out.print("Enter the movie ticket price \n");
        int price = sc.nextInt();
        System.out.print("Enter movie rating \n");
        int rating = sc.nextInt();

        if (rating>=5 && price<=12){
            System.out.print("Im interested in watching the movie \n");
        }
        else{
            System.out.print("Im not interested in watching the movie \n");
        }

sc.close();
    }
}
