package Invoicing.Module;

public class Invoice {
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Invoice() {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "amount=" + amount +
                '}';
    }
}
