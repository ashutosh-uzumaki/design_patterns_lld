package org.ashutosh.abstract_factory.gui_factory;

public class MacCheckbox implements Checkbox{
    @Override
    public void render(){
        System.out.println("rendering the mac check box");
    }
}
