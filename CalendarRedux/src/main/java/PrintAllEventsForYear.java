import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/PrintAllMonths")
public class PrintAllEventsForYear extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<h3>List of Events for this year:</h3>");
        ArrayList<ArrayList<Event>> eventListYear = EventHolder.getOuter();
        for(ArrayList<Event> eventList : eventListYear) {
            EventHolder.printEventsFromList(out,eventList);
        }
    }
}
