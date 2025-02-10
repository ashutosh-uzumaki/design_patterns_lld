package org.ashutosh.abstract_factory.databases;

public class PostgreSQLConnector implements DBConnection{
    @Override
    public void dbConnect(){
        System.out.println("connected to postgresql");
    }
}
