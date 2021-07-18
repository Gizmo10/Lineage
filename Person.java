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

    //Setters for the fields
    public void setName(String name){

        pName = name;
    }

    public void setMomName(String name){

        maternalParent = name;
    }

    public void setDadName(String name){

        paternalParent = name;
    }

    public void setChildrenNames(ArrayList<String> children){

        if(!children.isEmpty()){
            //Iterate through list and match populate list one item at a time
            for(int i = 0;i < children.size();i++){

                childrenNames.add(children.get(i));

        }

        }

    }





}
