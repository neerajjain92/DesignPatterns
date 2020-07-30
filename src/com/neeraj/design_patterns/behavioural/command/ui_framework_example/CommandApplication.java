package com.neeraj.design_patterns.behavioural.command.ui_framework_example;

import com.neeraj.design_patterns.behavioural.command.ui_framework_example.framework.Button;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class CommandApplication {

    public static void main(String[] args) {
        var customerService = new CustomerService();
        var addCustomerCommand = new AddCustomerCommand(customerService);
        var button = new Button(addCustomerCommand);

        button.click();
    }
}
