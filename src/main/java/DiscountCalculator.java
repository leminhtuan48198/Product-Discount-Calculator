import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculator", value = "/calculate")
public class DiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));
        String description=request.getParameter("description");
        double discountAmount =listPrice* discountPercent *0.01 ;
        double discountPrice=listPrice-discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Description: " + description + "</h1>");
        writer.println("<h1>Discount Amount " + discountAmount + "</h1>");
        writer.println("<h1>Discount Price " + discountPrice + "</h1>");
        writer.println("</html>");
    }
}
