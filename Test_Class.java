import java.util.ArrayList;
import java.util.Scanner;
public class Test_Class extends Storage {
   /** Last update: 29 April 2021

    The main method of the project

    Contributing authors:Dillon Halbert
 **/

   Article ex1 = new Article("title 1","author","there is a description","urrrrrrrrrrrrlllllll.com","no","4/30");
    Article ex2 = new Article("title 2","author","there is maybe a description","urrrrrrrrrrrrlllllll.com","no","4/30");
    Article ex3 = new Article("title 3","author","there is no description","urrrrrrrrrrrrlllllll.com","no","4/30");

    ArrayList<Article> example = new ArrayList<>();



    private boolean test1(){
        Scanner in = new Scanner(System.in);
    Storage test1 = new Storage();
    test1.initializeStorage();
    System.out.println("Enter number 1 if you want to clear txt file for testing");
    String key = in.nextLine();
    if (key.equals("1")){ test1.clear();}

    else{ System.out.println("TXT FILE SAVED"); }

    example.add(ex1);
    test1.storeTxt();
    example.add(ex2);
    example.remove(ex1);
        return false;
}
private boolean test2(){
    return false;
}

}