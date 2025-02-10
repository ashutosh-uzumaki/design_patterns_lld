package org.ashutosh.abstract_factory.databases;

public class Application {
    private DbConnectionnFactory dbConnectionnFactory;
    private DBConnection dbConnection;
    private QueryExecutor queryExecutor;

    public Application(DbConnectionnFactory dbConnectionnFactory){
        this.dbConnectionnFactory = dbConnectionnFactory;
    }

    public void connect(){
        dbConnectionnFactory.createDBConnection();
    }

    public void executeQuery(String query){
        dbConnectionnFactory.createQueryExecutor().executeQuery(query);
    }
}
