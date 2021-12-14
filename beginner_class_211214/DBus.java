public class DBus extends DCar {
    public void ppangppang() {
        System.out.println("PPANG PPANG!!!");
    }

    public static void main(String[] args) {
        DBus bus = new DBus();
        bus.run();
        bus.ppangppang();
    }
}
