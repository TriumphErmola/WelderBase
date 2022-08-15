package com.example.welderbase.model;

public class Welder extends BaseEntity{

    private String naksStamp;

    private int welderRank;

    private boolean HM;

    private boolean Nerj;

    public Welder(String naksStamp, int welderRank, boolean HM, boolean nerj) {
        super();
        this.naksStamp = naksStamp;
        this.welderRank = welderRank;
        this.HM = HM;
        Nerj = nerj;
    }

    public String getNaksStamp() {
        return naksStamp;
    }

    public void setNaksStamp(String naksStamp) {
        this.naksStamp = naksStamp;
    }

    public int getWelderRank() {
        return welderRank;
    }

    public void setWelderRank(int welderRank) {
        this.welderRank = welderRank;
    }

    public boolean isHM() {
        return HM;
    }

    public void setHM(boolean HM) {
        this.HM = HM;
    }

    public boolean isNerj() {
        return Nerj;
    }

    public void setNerj(boolean nerj) {
        Nerj = nerj;
    }

    @Override
    public String toString() {
        return "Welder{" +
                "naksStamp='" + naksStamp + '\'' +
                ", welderRank=" + welderRank +
                ", HM=" + HM +
                ", Nerj=" + Nerj +
                '}';
    }
}
