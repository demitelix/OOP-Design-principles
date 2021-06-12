package lv.accenture.singleobjects;

import lv.accenture.command.Work;

public final class Director {

    private static Director director;

    private Director() {
    }

    public static Director getDirector(){
        if (director == null) {
            director = new Director();
        }
        return director;
    }

    public void sendCommand(Work work){
        work.applyCommand();
    }
}
