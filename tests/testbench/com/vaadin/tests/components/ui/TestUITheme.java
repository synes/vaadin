package com.vaadin.tests.components.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.terminal.WrappedRequest;
import com.vaadin.tests.components.AbstractTestUI;
import com.vaadin.ui.Label;

@Theme("tests-tickets")
public class TestUITheme extends AbstractTestUI {

    @Override
    protected void setup(WrappedRequest request) {
        Label label = new Label("A red label");
        label.setStyleName("red");
        addComponent(label);
    }

    @Override
    public String getTestDescription() {
        return "UI with @Theme(\"tests-tickets\")";
    }

    @Override
    protected Integer getTicketNumber() {
        return Integer.valueOf(7885);
    }

}