package quizPackage;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class QuizServlet
 */
@WebServlet("/QuizServlet")
public class QuizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Frage> fragenListe = new ArrayList<>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QuizServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		String gast = request.getParameter("gast");
		session.setAttribute("gast", gast);
		
		fragenListe.add(new Frage("Hauptstadt der Schweiz?", "Bern", 1));
		fragenListe.add(new Frage("Hauptstadt von Deutschland?", "Berlin", 2));
		fragenListe.add(new Frage("Hauptstadt von Serbien?", "Belgrad", 3));
		fragenListe.add(new Frage("Hauptstadt von Österreich?", "Wien", 4));

		RequestDispatcher rd = request.getRequestDispatcher("quiz/startseite.jsp");
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
