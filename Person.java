package Lineage;
/*The class stores a person's information
Their parents' names and their children name(children in ArrayList
 */

import java.util.ArrayList;

public class Person {
    //Fields of the Person object
    private String pName; //The name of the Person
    private String maternalParent; //Mom name
    private String paternalParent; //Dad name
    private ArrayList<String> childrenNames = new ArrayList<String>();

    //The constructor of the Person class
    public Person(String pName){

        this.pName = pName;
    }



}
