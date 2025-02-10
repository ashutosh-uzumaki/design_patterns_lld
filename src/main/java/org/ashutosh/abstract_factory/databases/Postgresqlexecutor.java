package org.ashutosh.abstract_factory.databases;

public class Postgresqlexecutor implements QueryExecutor{
    @Override
    public void executeQuery(String query) {
        System.out.println(query);
    }
}
