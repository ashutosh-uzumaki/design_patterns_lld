package org.ashutosh.abstract_factory.gui_factory;

public class MacFactory implements GuiFactory{
    @Override
    public Button createButton(){
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckbox();
    }

}
