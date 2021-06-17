package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        ArrayList<String> tlc = new ArrayList<>(Arrays.asList("Intro-Lude", "Creep", "Kick Your Game", "Diggin' on You", "Case Of The Fake People", "CrazySexyCool(Introlude)", "Red Light Special", "Waterfalls", "Intermission-Lude", "Let's Do It Again", "If I Was Your Girlfriend", "Sexy – Interlude", "Take Our Time", "Can I Get a Witness – Interlude", "Switch", "Sumthin' Wicked This Way Comes"));

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCD = new CD("CrazySexyCool", 0, 650, 650, tlc, false);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCD.readDisc();

        myCD.spinDisc();

        myCD.writeToDisc(150);


    }
}
