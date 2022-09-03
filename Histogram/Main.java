package Histogram;

import java.util.Map;

public class Main {
    private static final String STRING_TO_ANALYSE = "um um um dois dois dois tres quatro cinco um seis seis seis";

    public static void main(String[] args) {
    Histogram histogram = new Histogram();

    histogram.analyseString(STRING_TO_ANALYSE);

    for (String word : histogram){
        System.out.println(word + " : " + histogram.get(word));
    }


    }
}
