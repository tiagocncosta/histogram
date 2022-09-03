package Histogram;

import java.util.*;

public class Histogram implements Iterable<String>{
    TreeMap<String, String> histogram;
    public Histogram() {
        this.histogram = new TreeMap<>();
    }

    public void analyseString(String stringToAnalyse) {


        String[] words = stringToAnalyse.split("\\s+");

        Iterator<String> stringIterator = Arrays.stream(words).iterator();

        histogram = new TreeMap<String, String>();

        while (stringIterator.hasNext()) {
            String word = stringIterator.next();
            if (histogram.containsKey(word)) {
                String count = histogram.get(word);
                histogram.put(word, count + "*");
            } else {
                histogram.put(word, "*");
            }

            }

    }

    public String get(String word){
        return histogram.get(word);
    }

    @Override
    public Iterator<String> iterator() {
        return histogram.keySet().iterator();
    }
}
