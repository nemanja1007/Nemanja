package buchPackage;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Speichern
 */
@WebServlet("/speichern.html")
public class Speichern extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Speichern() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("isbn"));
		int id = Integer.parseInt(request.getParameter("isbn"));
		ArrayList<Buch> list = (ArrayList<Buch>) request.getServletContext();
		
		
		
		for (Buch b : list) {
			b.setTitel(request.getParameter("titel"));
			b.setSeiten(Integer.parseInt(request.getParameter("seiten")));
			b.setKategorie(request.getParameter("kategorie"));
			b.setIsbn(Integer.parseInt(request.getParameter("neueISBN")));
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
