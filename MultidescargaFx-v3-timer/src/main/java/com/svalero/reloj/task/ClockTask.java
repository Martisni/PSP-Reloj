package com.svalero.reloj.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.concurrent.Task;

public class ClockTask extends Task<Integer> {

    private DateTimeFormatter dtf;

    public ClockTask() {
        dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    }

    
    @Override
    protected Integer call() throws Exception {

        while (true) {
            Thread.sleep(1000);
            LocalDateTime now = LocalDateTime.now();
            updateMessage(dtf.format(now));
        }
    }
}
