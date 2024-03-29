package org.global_software_support.JavaSolidMVC.view;

import org.global_software_support.JavaSolidMVC.constants.Constants;
import org.global_software_support.JavaSolidMVC.controller.Controller;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame implements FormListener{

    private static final long serialVersionUID = 1L;
    private FormPanel formPanel;
    private TextPanel textPanel;
    private Controller controller;

    public MainFrame(){
        super(Constants.APPLICATION_TITLE);

        initializeClass();
        setLayout();
    }

    private void setLayout() {
        add(this.formPanel, BorderLayout.WEST);
        add(this.textPanel, BorderLayout.CENTER);

        setSize(700, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initializeClass() {
        this.controller = new Controller(this);
        this.formPanel = new FormPanel();
        this.formPanel.setFormListener(this);
        this.textPanel = new TextPanel();
    }

    @Override
    public void okButtonClicked(String personName, String personOccupation) {
        this.controller.addPerson(personName,personOccupation);
        this.controller.refreshScreen();
    }

    public void refreshTextArea(String name, String occupation) {
        this.textPanel.addText(name+" - "+occupation);
    }

    public void clearText() {
        this.textPanel.clearText();
    }
}
