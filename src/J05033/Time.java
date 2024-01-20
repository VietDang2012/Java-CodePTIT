package J05033;

public class Time {
    private int hr, mn, sc;

    public Time() {

    }

    public Time(int hr, int mn, int sc) {
        this.hr = hr;
        this.mn = mn;
        this.sc = sc;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getHr() {
        return hr;
    }

    public void setMn(int mn) {
        this.mn = mn;
    }

    public int getMn() {
        return mn;
    }

    public void setSc(int sc) {
        this.sc = sc;
    }

    public int getSc() {
        return sc;
    }

    public int getTotalTime() {
        return (sc + (60 * mn) + (3600 * hr));
    }
}
