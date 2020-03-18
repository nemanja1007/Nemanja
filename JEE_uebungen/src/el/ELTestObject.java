package el;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import buchPackage.Author;
import buchPackage.Buch;

/**
 * Servlet implementation class ELTestObject
 */
@WebServlet("/ELTestObject")
public class ELTestObject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ELTestObject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Buch b = new Buch();
		Author a = new Author();
		b.setTitel("Java ist auch eine Insel");
		b.setSeiten(20);
		b.setKategorie("Informatik");
		a.setName("Petrovic");
		a.setVorname("Nemanja");
		request.setAttribute("Buch", b);
		request.setAttribute("Author", a);
		RequestDispatcher rd = request.getRequestDispatcher("EL/elTestObject.jsp");
		rd.forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
