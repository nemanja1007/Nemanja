package quizPackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

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
@WebServlet("/frage.html")
public class QuizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Frage> fragenListe = new ArrayList<>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QuizServlet() {
		super();
		Frage f = new Frage("Was ist die Hauptstadt der Schweiz?", new String[] {"Bern", "Berlin"}, 1 );
		fragenListe.add(f);
		f = new Frage("Was gibt 2+2*2?", new String[] {"8", "6"}, 2 );
		fragenListe.add(f);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String next = request.getParameter("nextFrage");
		
		Integer nextFrage = 1;
		if(next != null){
			nextFrage = Integer.parseInt(next);
		}
		HttpSession session = request.getSession();
		session.setAttribute("Frage",  fragenListe.get(0));
		
		
		
		Integer countFrage = 0;
		if(session.getAttribute("CountFrage") != null) {
			countFrage = (Integer) session.getAttribute("CountFrage");
		}
		if(nextFrage > countFrage) {
			session.setAttribute("Frage", fragenListe.get(countFrage));
			session.setAttribute("CountFrage", ++countFrage);
		}
		RequestDispatcher rd = request.getRequestDispatcher("quiz/frageseite.jsp");
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
