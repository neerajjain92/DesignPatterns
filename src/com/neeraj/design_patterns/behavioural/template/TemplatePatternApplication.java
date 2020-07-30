package com.neeraj.design_patterns.behavioural.template;

import com.neeraj.design_patterns.behavioural.template.task.GenerateReportTask;
import com.neeraj.design_patterns.behavioural.template.task.TransferMoney;

/**
 * @author neeraj on 30/07/20
 * Copyright (c) 2019, DesignPatterns.
 * All rights reserved.
 */
public class TemplatePatternApplication {

    public static void main(String[] args) {
        var transferMoney = new TransferMoney();
        transferMoney.execute();

        var generateReport = new GenerateReportTask();
        generateReport.execute();
    }
}
