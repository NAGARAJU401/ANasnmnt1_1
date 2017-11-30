package com.example.user.anasnmnt1_1;
//Package objects contain version information about the implementation and specification

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //public is a method and fields can be accessed by the members of any class.
    //class is a collections of objects.
    //created MainActivity and extends with AppCompatActivity which is Parent class.

    @Override
    //we use override to tells the compiler that the following method overrides a method of its superclass.

    protected void onCreate(Bundle savedInstanceState) {
        //protected can be accessed by within the package and class and subclasses
        //The Void class is an uninstantiable placeholder class to hold a reference to the Class object
        // if there was one.Always followed by onStart().
        //Bundle is most often used for passing data through various Activities.
       //The savedInstanceState is a reference to a Bundle object that is passed into the onCreate method of every Android Activity

        super.onCreate(savedInstanceState);
        // call the super class onCreate to complete the creation of activity like the view hierarchy
        setContentView(R.layout.activity_main);
        //R means Resource
        //layout means design
        //  main is the xml you have created under res->layout->main.xml
        //  Whenever you want to change your current Look of an Activity or when you move from one Activity to another .
        // The other Activity must have a design to show . So we call this method in onCreate and this is the second statement to set
        // the design
    }
}
