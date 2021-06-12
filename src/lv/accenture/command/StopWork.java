package lv.accenture.command;

import lv.accenture.singleobjects.CallCenter;

public class StopWork implements Work{
    private CallCenter callCenter;

    public StopWork(CallCenter callCenter) {
        this.callCenter = callCenter;
    }

    @Override
    public void applyCommand() {
        callCenter.setPaused(true);
    }
}
