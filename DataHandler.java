package Lineage;
/*The DataHandler class will populate an ArrayList of Person objects
Have a method to see if the person is in the ArrayList
Have a Method to display the Person objects String representation.
Which will be the person's name, their mother's name. father's name and
their children if the person has any.
 */

import java.util.ArrayList;
import java.util.List;

public class DataHandler {

    //The object has one member, an ArrayList of Person objects
    List<Person> lineageList = new ArrayList<>();

    /* Constructor takes no arguments and calls
    populate list  to get data into lineage lis
     */
    public DataHandler(){

    }
}
