package org.ashutosh.abstract_factory.gui_factory;

public class WindowsFactory implements GuiFactory{
    @Override
    public Button createButton(){
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox(){
        return new WindowsCheckbox();
    }
}
