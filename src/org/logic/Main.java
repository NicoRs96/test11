package org.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        Logger logger = Logger.getLogger(Main.class.getName());

        list.add("andrea");
        list.add("pietro");
        list.add("paolo");
        list.add("nico");

        String curliest = list.toString();
        logger.info(curliest);

        Collections.sort(list);
        Collections.reverse(list);

        String change = list.toString();
        logger.info(change);
    }
}
