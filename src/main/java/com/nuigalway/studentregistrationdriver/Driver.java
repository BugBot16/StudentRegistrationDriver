/*
 * To change this license header, choose License Headers in Project Properties.
 * change
 * and open the template in the editor.
 */
package com.nuigalway.studentregistrationdriver;


import com.nuigalway.assignment1.*;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author user
 */
public class Driver {
    
    
    public static void main(String args[])
    {
     List<Student> studentlistSE = new ArrayList();         //studemt lists for each module
     List<Student> studentlistML = new ArrayList();
     List<Student> studentlistSC = new ArrayList();
   
        Student me = new Student("Sinead", "21", "25/02/1995","4BP", "12337161");       // create student objects
        Student friend = new Student("Dee", "21", "09/04/1995","4CT", "123345661");
        Student random = new Student("John", "22", "25/03/1996","4BP", "16578841");
        Student mature = new Student("Mary", "40", "05/07/1976","4EE", "17643701");
        
        studentlistSE.add(0,me);                                                         //add students to list
        studentlistSE.add(1,friend);                    
        Module SE = new Module("Software Engineering","CT404", studentlistSE);          //create module objects
       
   
        studentlistML.add(me);
        studentlistML.add(friend);
        studentlistML.add(random);
        Module ML = new Module("Machine Learning","CT101", studentlistML);
       
        
        
        studentlistSC.add(me);
        studentlistSC.add(friend);
        studentlistSC.add(random);
        studentlistSC.add(mature);
        Module SC = new Module("System On Chip","EE404", studentlistSC);
        
        
        List<Module> modulelist = new ArrayList();                  //crete list of modules
        modulelist.add(SE);
        modulelist.add(ML);                                         //add modules to list
        modulelist.add(SC);
        
        DateTime st = new DateTime(2016, 9, 05, 9, 0);              //create date using joda time datetime var
        
        DateTime end = new DateTime(2017,5,31,5,0);
        CourseProgramme Eng = new CourseProgramme("Electronic Engineering", modulelist, st, end ); //create course object
        
        System.out.println(Eng.getDetails());                       //print details of course
    }
    
}
