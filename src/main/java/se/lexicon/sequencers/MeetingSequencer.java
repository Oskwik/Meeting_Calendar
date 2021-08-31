package se.lexicon.sequencers;

public class MeetingSequencer {


    private int meetingId = 1;


    public int nextMeeting(){
        return meetingId++;

    }
    public void reset(){
        meetingId = 1;

    }
}
