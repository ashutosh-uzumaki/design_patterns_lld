package org.ashutosh.abstract_factory.databases;

public class PostgreSQLFactory implements DbConnectionnFactory{

    @Override
    public DBConnection createDBConnection() {
        return new PostgreSQLConnector();
    }

    @Override
    public QueryExecutor createQueryExecutor() {
        return new Postgresqlexecutor();
    }
}
