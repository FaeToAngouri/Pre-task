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

        Map<String, Integer> kmers = new HashMap<>();
        List<String> collection = new ArrayList<>();
        Set<String> freqKmers = new HashSet<>();

        // Create k-mer substrings and assign them to a hashmap
        // that tracks the frequency of occurrence
        for (int i = 0; i < dna.length() - (k - 1); i++) {
            String string = dna.substring(i, (i + (k)));
            if (!kmers.containsKey(string)) {
                kmers.put(string, 1);
                collection.add(string);
            }
            else {
                int hold = kmers.get(string);
                hold++;
                kmers.put(string, hold);
            }
        }

        // Find the maximum frequency of all k-mers
        int max = 1;
        for (String s : collection) {
            if (kmers.get(s) > max) {
                max = kmers.get(s);
            }
        }

        // Find the k-mers with the maximum frequency
        for (String s : collection) {
            if (kmers.get(s) == max) {
                freqKmers.add(s);
            }
        }

        return freqKmers;
    }

}
