package com.inflearn.javatest;

public class Study {

    private StudyStatus studyStatus;

    private int limit;

    public void setStudyStatus(StudyStatus studyStatus) {
        this.studyStatus = studyStatus;
    }

    public StudyStatus getStudyStatus() {
        return studyStatus;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
