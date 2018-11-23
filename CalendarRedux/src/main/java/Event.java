public class Event {
    private int day;
    private int month;
    private int year;
    private String name;
    private String location;
    private String startTime;
    private String endTime;

    Event(int d,int m, int y, String name, String location, String startTime, String endTime) {
        this.day = d;
        this.month = m;
        this.year = y;
        this.name = name;
        this.location = location;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    int getDay() {
        return day;
    }

    int getMonth() {
        return month;
    }

    String getName() {
        return name;
    }

    String getLocation() {
        return location;
    }

    String getStartTime() {
        return startTime;
    }

    String getEndTime() {
        return endTime;
    }

}
