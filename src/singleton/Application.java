package singleton;

public class Application {
    public static void main(String[] args) {
        Database foo=Database.getInstance();
        foo.query("select * from K66A5");
        Database bar =Database.getInstance();
        System.out.println(bar== foo);
    }
}
