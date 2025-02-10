package org.ashutosh.abstract_factory.databases;

public class MySQLDbFactory implements DbConnectionnFactory{


    @Override
    public DBConnection createDBConnection() {
        return new MySqlDbConnector();
    }

    @Override
    public QueryExecutor createQueryExecutor() {
        return new Mysqlqueryexecutor();
    }
}
