package com.svalero.reloj.task;

import javafx.concurrent.Task;

public class TimerTask extends Task<Integer> {

    private int timerWatch;

    public TimerTask() {
        this.timerWatch = 0;
    }

    @Override
    protected Integer call() throws Exception {

        while (true) {
            Thread.sleep(1000);
            updateMessage(String.valueOf(this.timerWatch));
            this.timerWatch--;
        }
    }
}

