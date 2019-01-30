package questions;

import java.util.*;

public class question2 {

    /* @Param   String dna is a valid string
     * @Param   int k is a positive integer greater than zero
     *          but less than the length of dna
     *
     * @Return  Set of coordinates
     * @Return  null if preconditions violated
     *
     * matchKmer is a function that takes in two strings of dna and
     * an integer k and finds the matching kmers from both strands.
     * Matches could be explicit (A-A, C-C, etc) or implicit (A-T, G-C, etc).
     *
     */
    public static Set<coordinate> matchKmer (String dna1, String dna2, int k) {
        if (k > dna1.length() || k > dna2.length()) {
            return null;
        }
        if (k <= 0) {
            return null;
        }

        List<String> listKmers1 = new ArrayList<>();
        List<String> listKmers2 = new ArrayList<>();
        List<String> listKmers1Pair = new ArrayList<>();
        Set<coordinate> matchKmers = new HashSet<>();

        // Create all k-mer substrings from the first strand
        for (int i = 0; i < dna1.length() - (k - 1); i++) {
            String string = dna1.substring(i, (i + (k)));
            if (!listKmers1.contains(string)) {
                listKmers1.add(string);
            }
        }

        // Create all k-mer substrings from the second strand
        for (int j = 0; j < dna2.length() - (k - 1); j++) {
            String string = dna2.substring(j, (j + (k)));
            if (!listKmers2.contains(string)) {
                listKmers2.add(string);
            }
        }

        // Find all matching k-mers between both strands
        for (int i = 0; i < listKmers1.size(); i++) {
            for (int j = 0; j < listKmers2.size(); j++) {
                if (listKmers1.get(i).equals(listKmers2.get(j))) {
                    coordinate x = new coordinate(i, j);
                    matchKmers.add(x);
                }
            }
        }

        // Convert one set of k-mers to their implicit match (A-T, C-G, etc)
        for (String s : listKmers1) {
            String t = "";
            for (int n = 0; n < k; n++) {
                if (s.charAt(n) == 'A') {
                    t += "T";
                }
                if (s.charAt(n) == 'T') {
                    t += "A";
                }
                if (s.charAt(n) == 'C') {
                    t += "G";
                }
                if (s.charAt(n) == 'G') {
                    t += "C";
                }
            }
            listKmers1Pair.add(t);
        }

        // Find all matching implicit k-mers
        for (int i = 0; i < listKmers1Pair.size(); i++) {
            for (int j = 0; j < listKmers2.size(); j++) {
                if (listKmers1Pair.get(i).equals(listKmers2.get(j))) {
                    coordinate x = new coordinate(i, j);
                    matchKmers.add(x);
                }
            }
        }

        return matchKmers;
    }

}
