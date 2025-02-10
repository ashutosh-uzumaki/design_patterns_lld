package org.ashutosh.abstract_factory.databases;

public interface DbConnectionnFactory {
    DBConnection createDBConnection();
    QueryExecutor createQueryExecutor();
}
