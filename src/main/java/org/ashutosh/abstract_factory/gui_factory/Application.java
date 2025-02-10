package org.ashutosh.abstract_factory.gui_factory;

public class Application {
    private final GuiFactory factory;
    private Button button;
    private Checkbox checkbox;
    public Application(GuiFactory factory){
        this.factory = factory;
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void renderUI(){
        button.render();
        checkbox.render();
    }
}
