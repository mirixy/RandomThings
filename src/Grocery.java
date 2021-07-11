import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Grocery {
   static ArrayList<String> articleList = new ArrayList<>();
   static ArrayList<String> priceList = new ArrayList<>();
    // Method to collect the user input
   public static String userInput(){
       Scanner sc = new Scanner(System.in);
       return sc.nextLine();
       
   }
    // Get the sum of the price array list
   public static double totalOf(){
       double sum = 0;
       double temp;
       for (String s : priceList) {
           temp = Double.parseDouble(s);
           sum += temp;
       }
       return sum;
   }
    // write the grocery list to a file
   public static void fileWriter(String temp){
       try {
           FileWriter fw = new FileWriter("grocery.txt", true);
           PrintWriter pw = new PrintWriter(fw);
           pw.write(temp);
           pw.close();
       } catch(IOException e){
           System.out.println("An error occurred");
       }
   }

    public static void printer(){
        // iterates through the items and prints them to the console
        for (int i = 0; i < articleList.size(); i++){
            System.out.println(articleList.get(i) + " " + priceList.get(i)+ " EUR");
            String temp = articleList.get(i) + " " + priceList.get(i) + " EUR\n";
            // writes the output to the file
            fileWriter(temp);
        }
        // prints out the total sum
        System.out.println("Total of: " + totalOf() + " EUR");
        // writes the total sum
        fileWriter("Total: "+ (totalOf())+ " EUR\n");
    }

    public static void mainLoop(){
        while (true){
            System.out.println("Please type in your item: ");
            articleList.add(userInput());
            System.out.println("Thank you, now please add the price of this item: ");
            priceList.add(userInput());
            System.out.println("Do you want to add another item ?, type N for No: ");
            String choose = userInput();
            // if user puts 'N' in , the loop breaks, else it continues the loop
            if(choose.equals("N")){
                break;
            }

        }
    }
    // main area
    public static void main (String[] args){
        System.out.println("Welcome to your Shopping List!\n");
        // as long as the user don't put 'N' in , the user can add more items.
        mainLoop();
        printer();



    }
}
