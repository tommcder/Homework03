public class Car {
    private double milesPer;
    private double fuelLevel = 0;

    public Car(double mpg)
    {
        milesPer=mpg;
    }
    public double getGasInTank()
    {
        System.out.println(fuelLevel+" gallons remaining.");
        return fuelLevel;

    }

    public double addGas(int gas)
    {
        fuelLevel = fuelLevel+gas;
        return fuelLevel;
    }
    public double drive(double miles)
    {
        double a = miles/milesPer;
        fuelLevel = fuelLevel-a;
        return fuelLevel;
    }
}

