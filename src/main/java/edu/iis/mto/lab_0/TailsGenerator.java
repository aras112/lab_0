package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    private ArrayList<String> strings;


    public List<String> tails(String value) {

        strings = new ArrayList<>();

        if (value == null) {
            return new ArrayList<>();
        }

        for (Integer i = 0; i < value.length(); i++) {
            strings.add(value.substring(i));
        }

        strings.add("");

        return strings;
    }
}
