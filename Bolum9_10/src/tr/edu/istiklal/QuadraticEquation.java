package tr.edu.istiklal;

public class QuadraticEquation {

    
    private double a;
    private double b;
    private double c;

    
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    
    public double getA() {
        return a;
    }

    
    public double getB() {
        return b;
    }

    
    public double getC() {
        return c;
    }

   
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

  
    public double getRoot1() {
        double d = getDiscriminant();
        if (d < 0)
            return 0;
        return (-b + Math.sqrt(d)) / (2 * a);
    }

   
    public double getRoot2() {
        double d = getDiscriminant();
        if (d < 0)
            return 0;
        return (-b - Math.sqrt(d)) / (2 * a);
    }

    
    public String getResult() {
        double d = getDiscriminant();
        if (d > 0)
            
            return getRoot1() + " " + getRoot2();
        else if (d == 0)
            
            return String.valueOf(getRoot1());
        else
            
            return "";
    }
}