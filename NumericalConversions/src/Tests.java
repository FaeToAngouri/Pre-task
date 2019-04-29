import org.junit.Test;

public class Tests {

    @Test
    public void test1() {
        String result = Converter.binaryToDecimal("10011011");
        System.out.println(result);
        assert(result.equals("155"));
    }

    @Test
    public void test2() {
        String result = Converter.decimalToBinary("155");
        System.out.println(result);
        assert (result.equals("10011011"));
    }


}
