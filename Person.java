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
    private ArrayList<String> childrenNames = new ArrayList<>();

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
            //Iterate through list and populate list one item at a time
            for(int i = 0;i < children.size();i++){

                childrenNames.add(children.get(i));

        }

        }

    }

    //Getter for the name which will be used to distinguish objects
    public String getName(){

        return pName;
    }

    //getter for mom name
    private  String getMomName(){

        return maternalParent;
    }

    //getter for dad name
    private String getDadName(){

        return paternalParent;
    }

    //getter for children
    private String getChildren(){

        if(!childrenNames.isEmpty()){

            //s is first name
            String s = childrenNames.get(0);

            //Concatenate rest of names
            for(int i = 1;i < childrenNames.size();i++){

                s += " \n" +  childrenNames.get(i);
            }

            return s;

        }else{

            return "No children";
        }

    }





}
