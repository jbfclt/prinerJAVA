package xyz.nekoit.sample03;

public class CommandLinePrinter implements IPrinter {
    @Override
    public void PrintLine(String str) {
        System.out.println(str);
    }
}
