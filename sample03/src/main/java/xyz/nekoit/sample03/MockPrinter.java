package xyz.nekoit.sample03;

import java.util.ArrayList;

public class MockPrinter implements IPrinter {
    private ArrayList<String> tableau;

    public MockPrinter() {
        tableau = new ArrayList<>();
    }
    
    @Override
    public void PrintLine(String str) {
        tableau.add(str);
    }
    
    public ArrayList<String> GetLines() {
        return tableau;
    }
}
