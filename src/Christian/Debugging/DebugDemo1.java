package Christian.Debugging;

public class DebugDemo1
{
    public static void main(String args[])
    {
        double bill1 = 45.00;
        double bill2 = 35.00;
        System.out.println("Tips: ");
        calculateTip(bill2);
        calculateTip(bill1);

    }
    public static void calculateTip(double bill)
    {
        final double rate = 0.02; // Consider these are percentage
        double tip;
        tip = bill * rate;
        System.out.println("Tip: " + tip);
    }
}