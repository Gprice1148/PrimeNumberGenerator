import PrimeNumber.PrimeNumberDriver;
import PrimeNumber.PrimeNumberGeneratorImpl;
import Util.InputUtil;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String primeNumbersString = PrimeNumberDriver.PrimeNumberDriver();
        System.out.println(primeNumbersString);
    }

}
