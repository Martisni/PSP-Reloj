package com.svalero.reloj.task;

import javafx.concurrent.Task;

public class StopWatchTask extends Task<Integer> {

    private int stopWatch;

    public StopWatchTask() {
        this.stopWatch = 0;
    }

    @Override
    protected Integer call() throws Exception {

        while (true) {
            Thread.sleep(1000);
            updateMessage(String.valueOf(this.stopWatch));
            this.stopWatch++;
        }
    }
}
