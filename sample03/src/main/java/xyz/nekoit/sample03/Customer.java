package xyz.nekoit.sample03;

public class Customer implements ICustomer {
    String name;
    String cid;

    public Customer(String name, String cid) {
        this.name = name;
        this.cid = cid;
    }
    
    @Override
    public String GetCID() {
        return cid;
    }

    @Override
    public String GetName() {
        return name;
    }

    @Override
    public void Print(IPrinter printer) {
        StringBuilder affichage = new StringBuilder();
        affichage.append(cid);
        affichage.append(" ");
        affichage.append(name);
        printer.PrintLine(affichage.toString());
        // printer.PrintLine(String.format("%s %s", cid, name));
    }
}
