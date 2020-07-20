package Amin;



public class DebugDemo1{

    public static void main(String args[]){
        double bill1 = 45.00;
        double bill2 = 35.00;
        System.out.println("Tips: ");
        calculateTip(bill2);// Debug: had typo
        calculateTip(bill1);
    }

    public static void calculateTip(double bill){ // Debub: static added since non-static cannot be referenced
        final double rate = 0.02; // Consider these are percentage 
        double tip;
        tip = bill * rate; // Debug: variable 'money' was not defiend. So, changed to parameter 'bill'.
        System.out.println("Tips: " + tip);
    }
}