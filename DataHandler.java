package Lineage;
/*The DataHandler class will populate an ArrayList of Person objects
Have a method to see if the person is in the ArrayList
Have a Method to display the Person objects String representation.
Which will be the person's name, their mother's name. father's name and
their children if the person has any.
 */

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataHandler {

    //The object has one member, an ArrayList of Person objects
    List<Person> lineageList = new ArrayList<>();

    /* Constructor takes no arguments and calls
    populate list  to get data into lineage lis
     */
    public DataHandler() {

        //Call it's method that populates the lineageList field
        populateList();
    }

    /*Populates the lineageList and stores information
    from a file into the respective fields of a Person
    and stores the object in lineageList
     */
    private void populateList() {

        try {
            //Create a file that will be used to populate list
            File inFile = new File("Lineages.txt");
            //Check if the file exists before working with it
            if (inFile.exists()) {
                //Declare this to read the contents f the file
                Scanner input = new Scanner(inFile);
                String inputLine;
                Person p = new Person();
                ArrayList<String> children = new ArrayList<>();//The children names are stored here

            /*Extracts a single line of input from file
            while there is still input to read
             */
                while (input.hasNext()) {

                    //Get the line of input string
                    inputLine = input.nextLine();
                    //Split  the names from input into an array
                    String[] names = inputLine.split(",");

                    //Build a Person object from input and add to lineageList
                    for (int i = 0; i < names.length; i++) {

                        if (i == 0) {
                            //Person's name
                            p.setName(names[i]);
                        } else if (i == 1) {
                            //Mom name
                            p.setMomName(names[i]);
                        } else if (i == 2) {
                            //Dad's name
                            p.setDadName(names[i]);
                        } else {
                            //Add to local ArrayList
                            children.add(names[i]);

                        }
                    }

                    //Set the Person object's children
                    p.setChildrenNames(children);

                    //Add the newly constructed Person to lineageList
                    lineageList.add(p);

                }


            }
        }catch(Exception e){

        }
    }



}