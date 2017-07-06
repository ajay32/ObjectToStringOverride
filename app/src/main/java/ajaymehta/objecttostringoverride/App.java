package ajaymehta.objecttostringoverride;

/**
 * Created by Avi Hacker on 7/4/2017.
 */

public class App {

    public static void main(String args[]) {



        Student ajay = new Student(23, "Ajay");  // for the third override method

        System.out.println(ajay); // if we dont override our object in its class (Student it will pritn (packagename.object) ajaymehta.objecttostringoverride.Student@a298b7 <--
        // but we want ki when we print student ..it shoud print his details that we pass in constructor ..(birth details)
    }
}
