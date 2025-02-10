package org.ashutosh.abstract_factory.databases;

import java.sql.SQLOutput;

public class Mysqlqueryexecutor implements QueryExecutor{


    @Override
    public void executeQuery(String query) {
        System.out.println(query);
    }
}
