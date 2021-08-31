package se.lexicon.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Meeting {

    private int id;
    private String topic;
    private LocalDate meetingDate;
    private LocalTime start;
    private LocalTime end;
    private Person  organizer;
    private List<Person> attendants = new ArrayList<>();

    public Meeting(int id, String topic, LocalDate meetingDate, LocalTime start, LocalTime end, Person organizer) {
        this.id = id;
        this.topic = topic;
        this.meetingDate = meetingDate;
        this.start = start;
        this.end = end;
        this.organizer = organizer;

    }

    public int getId() {
        return id;
    }


    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(LocalDate meetingDate) {
        this.meetingDate = meetingDate;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public Person getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Person organizer) {
        this.organizer = organizer;
    }

    public List<Person> getAttendants() {
        return attendants;
    }

    public void setAttendants(List<Person> attendants) {
        this.attendants = attendants;
    }

    public void addAttendant(Person person) {
           // todo: add person to attendants list
        attendants.add(person);

    }

     public void removeAttendant (Person person){
        attendants.remove(person);
     }

    public int compareTo(Meeting meeting){
        return 0;
    }


}
