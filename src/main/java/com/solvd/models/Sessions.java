package com.solvd.models;

import java.sql.Time;
import java.util.Date;

public class Sessions {
    private Long id;
    private Date sessionDate;
    private Time sessionTime;

    public Sessions(Long id, Date sessionDate, Time sessionTime) {
        this.id = id;
        this.sessionDate = sessionDate;
        this.sessionTime = sessionTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(Date sessionDate) {
        this.sessionDate = sessionDate;
    }

    public Time getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(Time sessionTime) {
        this.sessionTime = sessionTime;
    }
}
