package questions;

import java.util.*;

public class question1 {

    /* @Param   String dna is a valid string
     * @Param   int k is a positive integer greater than zero
     *          but less than the length of dna
     *
     * @Return  Set of strings
     * @Return  null if preconditions violated
     *
     * freKmer is a function that takes in a string dna and an
     * integer k and finds the most frequently occurring k-mer.
     *
     */
    public static Set<String> freqKmer (String dna, int k) {
        if ( k <= 0 || k > dna.length()) {
            return null;
        }

        Map<String, Integer> mapKmers = new HashMap<>();
        List<String> listKmers = new ArrayList<>();
        Set<String> freqKmers = new HashSet<>();

        // Create all k-mer substrings and assign them to a
        // hashmap that tracks the frequency of occurrence
        for (int i = 0; i < dna.length() - (k - 1); i++) {
            String string = dna.substring(i, (i + (k)));
            if (!mapKmers.containsKey(string)) {
                mapKmers.put(string, 1);
                listKmers.add(string);
            }
            else {
                int hold = mapKmers.get(string);
                hold++;
                mapKmers.put(string, hold);
            }
        }

        // Find the maximum frequency of all k-mers
        int max = 1;
        for (String s : listKmers) {
            if (mapKmers.get(s) > max) {
                max = mapKmers.get(s);
            }
        }

        // Find the k-mers with the maximum frequency
        for (String s : listKmers) {
            if (mapKmers.get(s) == max) {
                freqKmers.add(s);
            }
        }

        return freqKmers;
    }

}
