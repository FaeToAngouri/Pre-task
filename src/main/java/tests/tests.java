package tests;

import org.junit.jupiter.api.Test;
import questions.coordinate;

import java.util.*;

import static questions.question1.freqKmer;
import static questions.question2.matchKmer;

public class tests {

    //Tests for Question 1
    @Test
    public void test1_1() {
        String dna = "ACAACTATGCATCACTATCGGGAACTATCCT";
        int k = 5;
        HashSet<String> test = new HashSet<>(freqKmer(dna, k));
        HashSet<String> result = new HashSet<>();
        result.add("ACTAT");
        System.out.println(test);
        assert(test.equals(result));
    }

    @Test
    public void test1_2() {
        String dna = "CGATATATCCATAG";
        int k = 3;
        HashSet<String> test = new HashSet<>(freqKmer(dna, k));
        HashSet<String> result = new HashSet<>();
        result.add("ATA");
        System.out.println(test);
        assert(test.equals(result));
    }

    @Test
    public void test1_3() {
        String dna = "ACGTTGCATGTCGCATGATGCATGAGAGCT";
        int k = 4;
        HashSet<String> test = new HashSet<>(freqKmer(dna, k));
        HashSet<String> result = new HashSet<>();
        result.add("CATG");
        result.add("GCAT");
        System.out.println(test);
        assert(test.equals(result));
    }

    @Test
    public void test1_4() {
        String dna = "ACTGAGTG";
        int k = 3;
        HashSet<String> test = new HashSet<>(freqKmer(dna, k));
        HashSet<String> result = new HashSet<>();
        result.add("ACT");
        result.add("CTG");
        result.add("TGA");
        result.add("GAG");
        result.add("AGT");
        result.add("GTG");
        System.out.println(test);
        assert(test.equals(result));
    }

    @Test
    public void test1_5() {
        String dna = "A";
        int k = 1;
        HashSet<String> test = new HashSet<>(freqKmer(dna, k));
        HashSet<String> result = new HashSet<>();
        result.add("A");
        System.out.println(test);
        assert(test.equals(result));
    }

    //Tests for Question 2
    @Test
    public void test2_1() {
        String dna1 = "AAACTCATC";
        String dna2 = "TTTCAAATC";
        int k = 3;
        Set<coordinate> test = new HashSet<>(matchKmer(dna1, dna2, k));
        System.out.println(test);
        // [(0, 4), (6, 6), (0, 0), (4, 2)]
        assert(test.size() == 4);
    }

    @Test
    public void test2_2() {
        String dna1 = "AGCTAT";
        String dna2 = "ATAGCG";
        int k = 3;
        Set<coordinate> test = new HashSet<>(matchKmer(dna1, dna2, k));
        System.out.println(test);
        // [(0, 2), (3, 0)]
        assert(test.size() == 2);
    }

    @Test
    public void test2_3() {
        String dna1 = "ACGGTATGACTACGA";
        String dna2 = "ACGTGAT";
        int k = 4;
        Set<coordinate> test = new HashSet<>(matchKmer(dna1, dna2, k));
        System.out.println(test);
        // [(8, 3)]
        assert(test.size() == 1);
    }

}
