package Lineage;

import java.util.Scanner;

/*User is prompted to input a Name
The program searches for it in it's data and returns
The person's name, mom's name, father's name and children
Else it prints that person is not in the base
 */
public class LineageMain {

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
        DataHandler data = DataHandler.getInstance();
        /*The user is prompted to input the name of person
        whose information they would like to display
         */
        System.out.println("Please Enter a person's name?");
        //Regular expression to be used after testing program with file
        String name = in.nextLine();

        //The name is looked up
        data.getPersonInfo(name);
    }
}
