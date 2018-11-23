import java.io.PrintWriter;
import java.util.ArrayList;

/* Acts as a database */
class EventHolder {
    //Currently ignores year
    private static ArrayList<ArrayList<Event>> outer = new ArrayList<ArrayList<Event>>(12);
    private static ArrayList<Event> jan = new ArrayList<Event>(31);
    private static ArrayList<Event> feb = new ArrayList<Event>(28);
    private static ArrayList<Event> mar = new ArrayList<Event>(31);
    private static ArrayList<Event> apr = new ArrayList<Event>(30);
    private static ArrayList<Event> may = new ArrayList<Event>(31);
    private static ArrayList<Event> june = new ArrayList<Event>(30);
    private static ArrayList<Event> july = new ArrayList<Event>(31);
    private static ArrayList<Event> aug = new ArrayList<Event>(31);
    private static ArrayList<Event> sep = new ArrayList<Event>(30);
    private static ArrayList<Event> oct = new ArrayList<Event>(31);
    private static ArrayList<Event> nov = new ArrayList<Event>(30);
    private static ArrayList<Event> dec= new ArrayList<Event>(31);

    static {
        for ( int i=0; i<31;i++) {
            jan.add(null);
        }
        outer.add(0,jan);
        for ( int i=0; i<28;i++) {
            feb.add(null);
        }
        outer.add(1,feb);
        for ( int i=0; i<31;i++) {
            mar.add(null);
        }
        outer.add(2,mar);
        for ( int i=0; i<30;i++) {
            apr.add(null);
        }
        outer.add(3,apr);
        for ( int i=0; i<31;i++) {
            may.add(null);
        }
        outer.add(4,may);
        for ( int i=0; i<30;i++) {
            june.add(null);
        }
        outer.add(5,june);
        for ( int i=0; i<31;i++) {
            july.add(null);
        }
        outer.add(6,july);
        for ( int i=0; i<31;i++) {
            aug.add(null);
        }
        outer.add(7,aug);
        for ( int i=0; i<30;i++) {
            sep.add(null);
        }
        outer.add(8,sep);
        for ( int i=0; i<31;i++) {
            oct.add(null);
        }
        outer.add(9,oct);
        for ( int i=0; i<31;i++) {
            nov.add(null);
        }
        outer.add(10,nov);
        for ( int i=0; i<31;i++) {
            dec.add(null);
        }
        outer.add(11,dec);
    }

    static private String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};

    static void addEvent(Event event) {
        int month = (event.getMonth()-1);
        int day = (event.getDay()-1);
        switch(month) {
            case 0:
                jan.set(day,event);
                break;
            case 1:
                feb.set(day,event);
                break;
            case 2:
                mar.set(day,event);
                break;
            case 3:
                apr.set(day,event);
                break;
            case 4:
                may.set(day,event);
                break;
            case 5:
                june.set(day,event);
                break;
            case 6:
                july.set(day,event);
                break;
            case 7:
                aug.set(day,event);
                break;
            case 8:
                sep.set(day,event);
                break;
            case 9:
                oct.set(day,event);
                break;
            case 10:
                nov.set(day,event);
                break;
            case 11:
                dec.set(day,event);
                break;
            default:
                break;
        }
    }

    static void deleteEvent(int day, int month) {
        switch(month-1) {
            case 0:
                jan.set((day-1),null);
                break;
            case 1:
                feb.set((day-1),null);
                break;
            case 2:
                mar.set((day-1),null);
                break;
            case 3:
                apr.set((day-1),null);
                break;
            case 4:
                may.set((day-1),null);
                break;
            case 5:
                june.set((day-1),null);
                break;
            case 6:
                july.set((day-1),null);
                break;
            case 7:
                aug.set((day-1),null);
                break;
            case 8:
                sep.set((day-1),null);
                break;
            case 9:
                oct.set((day-1),null);
                break;
            case 10:
                nov.set((day-1),null);
                break;
            case 11:
                dec.set((day-1),null);
                break;
            default:
                break;
        }
    }

    static ArrayList<ArrayList<Event>> getOuter() {
        return outer;
    }

    static ArrayList<Event> getMonth(String month) {
        int m = Integer.valueOf(month);
        switch(m) {
            case 0:
                return jan;
            case 1:
                return feb;
            case 2:
                return mar;
            case 3:
                return apr;
            case 4:
                return may;
            case 5:
                return june;
            case 6:
                return july;
            case 7:
                return aug;
            case 8:
                return sep;
            case 9:
                return oct;
            case 10:
                return nov;
            case 11:
                return dec;
            default:
               return jan;
        }
    }

    static void printEventsFromList(PrintWriter out, ArrayList<Event> eventList) {
        for (Event event : eventList) {
            if(event != null) {
                out.print("<p>Day: " + event.getDay() + " " + months[event.getMonth()-1] +  "</p>");
                out.print("<p>Event name: " + event.getName() + "</p>");
                out.print("<p>Location: " + event.getLocation() + "</p>");
                out.print("<p>Start time:" + event.getStartTime() + "</p>");
                out.print("<p>End time:" + event.getEndTime() + "</p>");
            }
        }
    }
}
