package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private double availableStorage; //totalSpace - usedSpace
    private double totalStorage;
    private double usedStorage;
    private ArrayList<String> contents;
    private boolean RW;

    public BaseDisc(String name, double availableStorage, double totalStorage, double usedStorage, ArrayList<String> contents, boolean RW) {
        this.name = name;
        this.availableStorage = availableStorage;
        this.totalStorage = totalStorage;
        this.usedStorage = usedStorage;
        this.contents = contents;
        this.RW = RW;
    }

    public String writeToDisc(double storageToBeWritten) {
        // check for RW
        if (!RW) {
            return name + " is not writable.";
        } else {
            // check for available storage
            if (storageToBeWritten < this.availableStorage) {
                usedStorage += storageToBeWritten;
                availableStorage -= storageToBeWritten;
                return "Data successfully saved to disc";
            }
            return "Not enough space on disc";
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public boolean getRW() {
        return RW;
    }
}
