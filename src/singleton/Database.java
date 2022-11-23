package singleton;

public class Database {
    private static Database instance;

    private Database() {
    }

    public static Database getInstance(){
        if(Database.instance==null){
            Database.instance=new Database();
        }
        return Database.instance;
    }
    public void query(String sql){
        System.out.println("execute " + sql);
    }

}
