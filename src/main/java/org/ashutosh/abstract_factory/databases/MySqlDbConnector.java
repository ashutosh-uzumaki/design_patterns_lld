package org.ashutosh.abstract_factory.databases;

public class MySqlDbConnector implements DBConnection{
    @Override
    public void dbConnect(){
        System.out.println("Connected to mysql db");
    }
}
