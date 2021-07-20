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

/*The class should only be created once because it uses a lot of data and time
Singleton design pattern to achieve  goal
 */

public class DataHandler {

    //An instance of object for Singleton
    private static DataHandler obj;
    //The object has one member, an ArrayList of Person objects
    private ArrayList<Person> lineageList = new ArrayList<>();
    private int indexOfName; //Stores an index pointing to a person in the list


    /* Constructor takes no arguments and calls
    populate list  to get data into lineage list.
    This constructor is private because we don't want more than one instance
     */
    private DataHandler() {

        //Call it's method that populates the lineageList field
        populateList();
    }

    //Factory method to create it's own instaance
    public static DataHandler getInstance(){

        //check if instance has not been created
        if(obj == null){

            obj = new DataHandler();
        }

        return obj;
    }

    /*Populates the lineageList and stores information
    from a file into the respective fields of a Person
    and stores the object in lineageList
     */
    private void populateList() {

        try {
            //Create a file that will be used to populate list
            File inFile = new File("Lineages.txt.txt");
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

    //The method searches the lineageList to see if the name exists in list
    private boolean nameExists(String name){

        boolean exists = false;

        for(int i = 0;i < lineageList.size();i++){
            //Is the argument name in the list
            if(name == lineageList.get(i).getName()){

                indexOfName = i;
                exists = true;
                return exists;
            }
        }

        return exists;

    }

    //Returns the Person's information from the list of people
    public void getPersonInfo(String name){

        //Test if the name is in object
        if(this.nameExists(name)){

            //Display the person's info
            System.out.print(lineageList.get(indexOfName));
        }else{

            System.out.println("The person doesn't exist in the data base");
        }
    }

}
