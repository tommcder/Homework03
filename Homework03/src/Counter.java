public class Counter {
    private int value;

    public int getValue()
    {
        return value;
    }

    public void click()
    {
        value = value + 3;
    }

    public void reset()
    {
        value = 0;
    }

    public void unClick()
    {
        value = value - 1;
    }



}
