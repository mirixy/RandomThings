import java.util.Scanner;
import java.io.*;
public class Human {
    String name;
    String height;
    String age;
    String occupation;
    int x;

    public static void writeToFile (String fileName, String n){

        try {
            FileWriter fw = new FileWriter(fileName, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.write(n+ "\n");
            pw.close();
        } catch (IOException e){
            System.out.println("An Error occurred");
        }
    }

    public static void main (String[] args){

        Human[] hr = new Human[2];
        int x =0;
        while (x < hr.length){
            hr[x] = new Human();
            System.out.println("put in the Name ");
            String name = getInput();
            hr[x].name = name;
            System.out.println("put in the height ");
            String height = (getInput());
            hr[x].height = height;
            System.out.println("put in the age ");
            String age = (getInput());
            hr[x].age = age;
            System.out.println("put in the occupation ");
            String oc = (getInput());
            hr[x].occupation = oc;
            x++;
        }

        for (int i = 0; i < hr.length; i++){
            System.out.println("Name: " + hr[i].name);
            writeToFile("HumanR.txt", hr[i].name);
            System.out.println("Height: " + hr[i].height);
            writeToFile("HumanR.txt", hr[i].height);
            System.out.println("Age: " + hr[i].age);
            writeToFile("HumanR.txt", hr[i].age);
            System.out.println("Occupation: " + hr[i].occupation);
            writeToFile("HumanR.txt", hr[i].occupation);
            System.out.println();
        }



    }


    public static String getInput(){
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        return userInput;
    }
}
