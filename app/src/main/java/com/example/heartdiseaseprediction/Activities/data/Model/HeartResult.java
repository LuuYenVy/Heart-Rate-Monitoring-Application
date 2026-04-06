package com.example.heartdiseaseprediction.Activities.data.Model;

public class HeartResult {
    private String beat;
    private String time;
    private boolean isDanger;

    public HeartResult(String beat, String time, boolean isDanger) {
        this.beat = beat;
        this.time = time;
        this.isDanger = isDanger;
    }

    public String getBeat() { return beat; }
    public String getTime() { return time; }
    public boolean isDanger() { try {
        int bpm = Integer.parseInt(beat);

        return bpm < 50 || bpm > 120;
    } catch (NumberFormatException e) {
        return false;
    }
    }
}
