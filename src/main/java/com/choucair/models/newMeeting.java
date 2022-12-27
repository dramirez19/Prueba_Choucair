package com.choucair.models;

public class newMeeting {

    private String meetingName;
    private String meetingNumber;

    public newMeeting(String meetingName, String meetingNumber) {
        this.meetingName = meetingName;
        this.meetingNumber = meetingNumber;
    }

    public String getMeetingName() {
        return meetingName;
    }
    public String getMeetingNumber() {
        return meetingNumber;
    }
}
