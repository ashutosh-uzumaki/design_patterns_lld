package org.ashutosh.abstract_factory.gui_factory;

public class WindowsButton implements Button{
    @Override
    public void render(){
        System.out.println("rendering windows button");
    }
}
