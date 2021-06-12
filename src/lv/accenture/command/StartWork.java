package lv.accenture.command;

import lv.accenture.singleobjects.CallCenter;

public class StartWork implements Work{
    private CallCenter callCenter;

    public StartWork(CallCenter callCenter) {
        this.callCenter = callCenter;
    }

    @Override
    public void applyCommand() {
        callCenter.setPaused(false);
    }
}
