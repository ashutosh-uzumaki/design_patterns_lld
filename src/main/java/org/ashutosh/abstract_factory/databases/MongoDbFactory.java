package org.ashutosh.abstract_factory.databases;

public class MongoDbFactory implements DbConnectionnFactory{
    @Override
    public DBConnection createDBConnection() {
        return new MongoDBConnector();
    }

    @Override
    public QueryExecutor createQueryExecutor() {
        return new Mongodbqueryexecutor();
    }
}
