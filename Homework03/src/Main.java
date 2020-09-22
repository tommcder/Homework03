//import org.junit.Test;
//import static org.junit.Assert.*;
public class Main {


    public static void main(String[] args)
    {
        Counter c = new Counter();
        c.click();
        c.click();
        c.unClick();
        System.out.println(c.getValue());
        int result = 5;
        System.out.println(result == c.getValue());
        //c.testCounter();

    }
}
