package buchPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet implementation class Overview
 */
@WebServlet("/Overview")
public class Overview extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private ArrayList<Buch> list = new ArrayList<>();

    /*
     * @see HttpServlet#HttpServlet()
     */
    public Overview() {
        super();
        // TODO Auto-generated constructor stub
    }

    /*
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getServletContext().setAttribute("books", list);
        PrintWriter out = response.getWriter();

        System.out.print("<!DOCTYPE html><html><head><titel>Bibliothek</titel><body><table><tr><th>Id</th></tr>");
/*
        for(Buch b : this.list) {
            System.out.print("<tr><td><a href="Detail?id=" + b.getIsbn() + "">" + b.getIsbn() + "</a></td></tr>");
        }

        System.out.print("</table><a href"tabelle.html">Buch hinzufügen</a></body></html>");
    }
*/
    /*
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}