package com.example.welderbase.model;

import java.time.LocalDate;

public class WelderWorkFlow extends BaseEntity {

    private String workpoint;
    private LocalDate date;
    private String weldingProcess;

    public String getWorkpoint() {
        return workpoint;
    }

    public void setWorkpoint(String workpoint) {
        this.workpoint = workpoint;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getWeldingProcess() {
        return weldingProcess;
    }

    public void setWeldingProcess(String weldingProcess) {
        this.weldingProcess = weldingProcess;
    }
}
