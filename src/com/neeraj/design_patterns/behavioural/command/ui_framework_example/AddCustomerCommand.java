package com.neeraj.design_patterns.behavioural.command.ui_framework_example;

import com.neeraj.design_patterns.behavioural.command.ui_framework_example.framework.Command;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class AddCustomerCommand implements Command {

    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        this.customerService.addCustomer();
    }
}
