package com.orjujeng.timesheet.Vo;

import java.io.Serializable;

public class Overview implements Serializable {

    private int newMember;
    private  int supportMember;
    private int supportProjects;

    private int timesheetCollection;

    public int getNewMember() {
        return newMember;
    }

    public void setNewMember(int newMember) {
        this.newMember = newMember;
    }

    public int getSupportMember() {
        return supportMember;
    }

    public void setSupportMember(int supportMember) {
        this.supportMember = supportMember;
    }

    public int getSupportProjects() {
        return supportProjects;
    }

    public void setSupportProjects(int supportProjects) {
        this.supportProjects = supportProjects;
    }

    public int getTimesheetCollection() {
        return timesheetCollection;
    }

    public void setTimesheetCollection(int timesheetCollection) {
        this.timesheetCollection = timesheetCollection;
    }
}
