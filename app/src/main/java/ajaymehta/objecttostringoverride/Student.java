package ajaymehta.objecttostringoverride;

/**
 * Created by Avi Hacker on 7/4/2017.
 */

public class Student {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;

    }

    // TODO..uncomment one at a time..to see what toString() method can do..it prints object details..passed in constructor
    // you can print name , age , or both ..or whatever u pass in constructor..

  /*  @Override
    public String toString() {   // its the method of ...Object class..so it applies to every object..n u can create it in any class..coz all classes inherit Object class.
        return " "+this.age;  // we have to return string..
    }
*/


    @Override
    public String toString() {
        return " "+this.name;
    }



/*
    @Override
    public String toString() {
        return " "+this.age+" "+this.name;
    }
*/

}
