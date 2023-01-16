package com.solvd.models;

public class MeetingRooms {
    private Long id;
    private String meetingRoomType;

    public MeetingRooms(Long id, String meetingRoomType) {
        this.id = id;
        this.meetingRoomType = meetingRoomType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMeetingRoomType() {
        return meetingRoomType;
    }

    public void setMeetingRoomType(String meetingRoomType) {
        this.meetingRoomType = meetingRoomType;
    }
}
