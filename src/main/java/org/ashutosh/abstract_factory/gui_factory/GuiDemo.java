package org.ashutosh.abstract_factory.gui_factory;

public class GuiDemo {
    public static void main(String[] args) {
        GuiFactory factory = null;
        String os = "windows";
        if(os.equalsIgnoreCase("windows")){
            factory = new WindowsFactory();
        }else if(os.equalsIgnoreCase("mac")){
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
