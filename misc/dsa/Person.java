package dsa;
public class Person {
    String name;
    boolean poor;
    Account account;

    Person(String name, boolean inDebt) {
        this.name = name;
        this.poor = inDebt;
    }

    void isDebt() {
        if (account.balance < 0) {
            this.poor = true;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Sana", false);
        //p1.display();
    }

}
