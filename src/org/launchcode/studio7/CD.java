package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {
    private double storageCapacity;
    private String discType;
    private ArrayList<String> contents;
    private boolean RW;
    private final double discSpeed = 500;


    public CD(String name, double availableStorage, double totalStorage, double usedStorage, ArrayList<String> contents, boolean RW) {
        super(name, availableStorage, totalStorage, usedStorage, contents, RW);
    }


    @Override
    public void spinDisc() {
        System.out.println(getName() + " spins at " + discSpeed + " RPMs.");
    }

    @Override
    public void readDisc() {
        int i = 1;
        for (String track :
                getContents()) {
            System.out.println(i + ". " + track);
            i++;
        }
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}