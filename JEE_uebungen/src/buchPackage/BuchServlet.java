package buchPackage;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BuchServlet
 */
@WebServlet("/BuchServlet")
public class BuchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Bibliothek bi = new Bibliothek();
	ArrayList<Buch> buecherListe = new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titel = "";
		if(request.getParameter("titel") != null)
			titel = request.getParameter("titel");
		
		String seiten ="";
		if(request.getParameter("seiten") != null)
			seiten = request.getParameter("seiten");
		
		String kategorie ="";
		if(request.getParameter("kategorie") != null)
			kategorie= request.getParameter("kategorie");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		try {
			Date datum = sdf.parse("17.03.2020");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(request.getServletContext().getAttribute("buecher") == null)
			request.getServletContext().setAttribute("buecher",  buecherListe);
		
		((ArrayList<Buch>) request.getServletContext().getAttribute("buecher").add(new Buch(titel, seiten, kategorie)));
		request.getRequestDispatcher("buch/ausgabe.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
