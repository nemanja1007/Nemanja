package el;

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
 * Servlet implementation class ELDemoServlet
 */
@WebServlet("/ELDemoServlet")
public class ELDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Person> list = new ArrayList<Person>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ELDemoServlet() {
        super();
        // TODO Auto-generated constructor stub
        list.add(new Person("Muster", "Heidi", new Adresse("Zürichstrasse 420", "8645 Jona")));
        list.add(new Person("Peter", "Hans", new Adresse("Rappistrasse 69", "8000 Zürich")));
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("EineZahl", 69);
		request.setAttribute("EinString", "Hello World");
		HttpSession session = request.getSession();
		session.setAttribute("Counter", 56);
		session.setAttribute("EineZahl", 99);
		request.setAttribute("Personen", list);
		Person p = new Person("Petrovic", "Nemanja", new Adresse("Bahnhofsstrasse 69", "8640 Rapperswil"));
		request.setAttribute("Person", p);
		RequestDispatcher rd = request.getRequestDispatcher("EL/demoEL.jsp");
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
