public class Question3_1 {
    private int idNumber;
    private double annualSales;

    public Question3_1(int idNumber, double annualSales) {
        this.idNumber = idNumber;
        this.annualSales = annualSales;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getAnnualSales() {
        return annualSales;
    }

    public void setAnnualSales(double annualSales) {
        this.annualSales = annualSales;
    }

    public void display() {
        System.out.println("ID: " + idNumber + ", Annual Sales: ZAR" + annualSales);
    }
}