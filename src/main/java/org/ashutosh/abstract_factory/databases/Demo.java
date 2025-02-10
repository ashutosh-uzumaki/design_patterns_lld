package org.ashutosh.abstract_factory.databases;



public class Demo {
    public static void main(String[] args) {
        DbConnectionnFactory dbConnectionnFactory = null;
        String db = "mysql";
        if(db.equalsIgnoreCase("mysql")){
            dbConnectionnFactory = new MySQLDbFactory();
        }else if(db.equalsIgnoreCase("mongodb")){
            dbConnectionnFactory = new MongoDbFactory();
        }else{
            dbConnectionnFactory = new PostgreSQLFactory();
        }

        Application app = new Application(dbConnectionnFactory);
        app.connect();
        app.executeQuery("INSERT INTO products VALUES");
    }
}
