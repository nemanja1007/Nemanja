package buchPackage;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BibliothekStart
 */
@WebServlet("/buch/BuchServlet")
public class BuchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// private ArrayList <Bibliothek> list = new ArrayList <Bibliothek>();
	// private ArrayList <Buch> buchList = new ArrayList <Buch>();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BuchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String titel = "";
		if (request.getParameter("titel") != null) {
			titel = request.getParameter("titel");
		}
		int seiten = 0;
		if (request.getParameter("seiten") != null) {
			try {seiten = Integer.parseInt(request.getParameter("seiten"));}
			catch(NumberFormatException ne) {
				ne.printStackTrace();
			}
			
		}
		int isbn = 0;
		if (request.getParameter("isbn") != null) {
			try {isbn = Integer.parseInt(request.getParameter("isbn"));}
			catch(NumberFormatException ne) {
				ne.printStackTrace();
			}
			
		}
		String kategorie="";
		if (request.getParameter("kategorie") != null) {
			kategorie = request.getParameter("kategorie");
		}
		String name="";
		if (request.getParameter("name") != null) {
			name = request.getParameter("name");
		}
		String vorname="";
		if (request.getParameter("vorname") != null) {
			vorname = request.getParameter("vorname");
		}
		if(request.getParameter("gebDatum")!=null) {
            String stringDatum= request.getParameter("gebDatum");
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            try {
                Date datum = sdf.parse(stringDatum);

            }catch (ParseException e) {
                e.printStackTrace();
            }
		}

		Bibliothek bibliothek = Bibliothek.getBibliothek();

		// ((ArrayList<Buch>) request.getServletContext().getAttribute("Buch))
		Buch b = new Buch();
		Author a = new Author();
		b.setIsbn(isbn);
		b.setTitel(titel);
		b.setSeiten(seiten);
		b.setKategorie(kategorie);
		a.setName(name);
		a.setVorname(vorname);
		//a.setGeburtsdatum(datum);
		b.setAuthor(a);
		
		bibliothek.getBuchList().add(b);
		
		request.setAttribute("Buch", b);
		request.setAttribute("buchListe", bibliothek.getBuchList());
		RequestDispatcher rd = request.getRequestDispatcher("ausgabe.jsp");
		rd.forward(request, response);

	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
	
