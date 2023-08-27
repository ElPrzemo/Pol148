package org.example.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Note {


    private static int id;
    List<String> tags = new ArrayList();


    public Note(List<String> tags) {
        this.tags = tags;
        id++;
    }

    public static int getId() {
        return id;
    }

    public List<String> getTags() {
        return tags;
    }

    public void addNote(String note){
        this.tags.add(note);
    }

    public  boolean match(String filter, List<String> tags) {
        for (String tag : tags) {
            if (tag.equals(filter)) {
                System.out.println("Znaleziono pasujący element w liście.");
                return true;
            }
        }
        return false;
    }

}
