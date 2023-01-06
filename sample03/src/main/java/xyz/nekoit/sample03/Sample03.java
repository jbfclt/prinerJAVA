package xyz.nekoit.sample03;

public class Sample03 {

    public static void main(String[] args) {
        Customer a = new Customer("James Bond", "007");
        IPrinter printer = new CommandLinePrinter();
        MockPrinter fauxPrinter = new MockPrinter();
        a.Print(fauxPrinter);
    }
}
