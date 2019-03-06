abstract public class Person {


    private final float tax;

    public Person(String name, int balance, float tax) {
        this.name = name;
        this.balance = balance;
        this.tax = tax;
    }

    public float getTax() {
        return tax;
    }

    private String name;

    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Float calculateTax() {
        return getBalance() * getTax();
    }
}
