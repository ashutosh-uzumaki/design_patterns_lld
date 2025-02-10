package org.ashutosh.abstract_factory.databases;

public class MongoDBConnector implements DBConnection{
    @Override
    public void dbConnect(){
        System.out.println("connected to mongo db");
    }
}
