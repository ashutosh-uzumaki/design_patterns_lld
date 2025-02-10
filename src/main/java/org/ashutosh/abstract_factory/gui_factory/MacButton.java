package org.ashutosh.abstract_factory.gui_factory;

public class MacButton implements Button{
    @Override
    public void render(){
        System.out.println("rendering mac button");
    }
}
