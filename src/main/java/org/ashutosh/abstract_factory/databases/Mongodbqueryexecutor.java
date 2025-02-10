package org.ashutosh.abstract_factory.databases;

public class Mongodbqueryexecutor implements QueryExecutor{
    @Override
    public void executeQuery(String query){
        System.out.println(query);
    }
}
