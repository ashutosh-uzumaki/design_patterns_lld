package org.ashutosh.abstract_factory.gui_factory;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void render(){
        System.out.println("Rendering windows check box");
    }
}
