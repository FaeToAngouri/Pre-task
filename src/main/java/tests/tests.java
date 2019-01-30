package tests;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static questions.question1.freqKmer;

public class tests {

    //Tests for Question 1
    @Test
    public void test1_1() {
        boolean assertion = false;
        String dna = "ACAACTATGCATCACTATCGGGAACTATCCT";
        int k = 5;
        HashSet<String> test = new HashSet<>(freqKmer(dna, k));
        HashSet<String> result = new HashSet<>();
        result.add("ACTAT");
        assertion = test.equals(result);
        assert(assertion);
    }

    @Test
    public void test1_2() {
        boolean assertion = false;
        String dna = "CGATATATCCATAG";
        int k = 3;
        HashSet<String> test = new HashSet<>(freqKmer(dna, k));
        HashSet<String> result = new HashSet<>();
        result.add("ATA");
        assertion = test.equals(result);
        assert(assertion);
    }

    @Test
    public void test1_3() {
        boolean assertion = false;
        String dna = "ACGTTGCATGTCGCATGATGCATGAGAGCT";
        int k = 4;
        HashSet<String> test = new HashSet<>(freqKmer(dna, k));
        HashSet<String> result = new HashSet<>();
        result.add("CATG");
        result.add("GCAT");
        assertion = test.equals(result);
        assert(assertion);
    }

    @Test
    public void test1_4() {
        boolean assertion = false;
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
        assertion = test.equals(result);
        assert(assertion);
    }

    @Test
    public void test1_5() {
        boolean assertion = false;
        String dna = "A";
        int k = 1;
        HashSet<String> test = new HashSet<>(freqKmer(dna, k));
        HashSet<String> result = new HashSet<>();
        result.add("A");
        assertion = test.equals(result);
        assert(assertion);
    }

    //Tests for Question 2
    @Test
    public void test2_1() {
        assert(true);
    }

    @Test
    public void test2_2() {
        assert(true);
    }

    @Test
    public void test2_3() {
        assert(true);
    }

    @Test
    public void test2_4() {
        assert(true);
    }

    @Test
    public void test2_5() {
        assert(true);
    }

}
