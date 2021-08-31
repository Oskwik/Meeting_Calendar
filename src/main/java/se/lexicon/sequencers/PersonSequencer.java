package se.lexicon.sequencers;

public class PersonSequencer {

    private int peronsId = 1;

    public int nextPersonId;{
        return peronsId++;
    }

    private void reset(){
        peronsId = 1;

    }

}
