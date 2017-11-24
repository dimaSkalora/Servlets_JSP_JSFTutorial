package servlets.wideskills_com_servlet.lesson_15;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ServletContextAttributeListenerDemo extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        ServletContext ctx = getServletContext();
        String attributeName="ContextAttribute";
        String attributeValue="Initial Value";
        ctx.setAttribute(attributeName, attributeValue);
        attributeValue="New Value";
        ctx.setAttribute(attributeName, attributeValue);
        ctx.removeAttribute(attributeName);
    }
}
