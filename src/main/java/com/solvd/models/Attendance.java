package com.solvd.models;

public class Attendance {
    private Students student;
    private Sessions session;

    private String attendanceRec;

    public Attendance(Students student, Sessions session, String attendanceRec) {
        this.student = student;
        this.session = session;
        this.attendanceRec = attendanceRec;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public Sessions getSession() {
        return session;
    }

    public void setSession(Sessions session) {
        this.session = session;
    }

    public String getAttendanceRec() {
        return attendanceRec;
    }

    public void setAttendanceRec(String attendanceRec) {
        this.attendanceRec = attendanceRec;
    }
}
