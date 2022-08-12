package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        CD myCd = new CD();
        DVD myDvd =  new DVD("Rock & Roll");

        myCd.spinDisc();
        myDvd.spinDisc();
        myCd.writeDate("More data to write");
        System.out.println(myCd.readData());
    }
}
