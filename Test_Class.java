import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Test_Class extends Storage {
    /**
     * Last update: 29 April 2021
     *
     * The main method of the project
     *
     * Contributing authors:Dillon Halbert
     **/

    Article ex1 = new Article("title 1", "author", "there is a description", "urrrrrrrrrrrrlllllll.com", "no", "4/30");
    Article ex2 = new Article("title 2", "author", "there is maybe a description", "urrrrrrrrrrrrlllllll.com", "no", "4/30");


    ArrayList<Article> example = new ArrayList<>();


    /**
     * This method test the functionality of the InitializedStorage, add function, clear , and lastly the saveArrayToFile.
     * The overall goal is to see if the txt is in the document.
     */
    private void test1() {
        Scanner in = new Scanner(System.in);
        Storage test1 = new Storage();
        test1.initializeStorage();
        System.out.println("Enter number 1 if you want to clear txt file for testing");
        String key = in.nextLine();
        if (key.equals("1")) {
            test1.clear();
        } else {
            System.out.println("TXT FILE SAVED");
        }
        example.add(ex1);
        example.add(ex2);
        test1.saveArrayToFile();
    }

    /**
     * In this test i will pull the txt from and smack it into an array and print it .
     */
    private void test2(){
        Scanner in = new Scanner(System.in);
        Storage test2 = new Storage();
        System.out.println("Enter number 1 if you want to clear txt file for testing");
        String key = in.nextLine();
        if (key.equals("1")) {
            loadArray();
            int i;
            try {
                deleteArticle("title 2");
            } catch (IOException e) {
                System.out.println("Error with test2 deleteArticle:  " + e);
                e.printStackTrace();
            }
            System.out.println(example);
        }
    }


}

