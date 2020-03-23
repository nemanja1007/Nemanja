package lottoPackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LottozahlenServlet
 */
@WebServlet("/LottozahlenServlet")
public class LottozahlenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LottozahlenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int zahl;
		int zahl2;
		int zahl3;
		int zahl4;
		int zahl5;
		int zahl6;
		
		Zufallszahl z = new Zufallszahl();
		zahl = z.getZahl();
		zahl2 = z.getZahl();
		zahl3 = z.getZahl();
		zahl4 = z.getZahl();
		zahl5 = z.getZahl();
		zahl6 = z.getZahl();
		
		request.setAttribute("Zahl", zahl);
		request.setAttribute("Zahl2", zahl2);
		request.setAttribute("Zahl3", zahl3);
		request.setAttribute("Zahl4", zahl4);
		request.setAttribute("Zahl5", zahl5);
		request.setAttribute("Zahl6", zahl6);
		
		RequestDispatcher rd = request.getRequestDispatcher("lotto/lottozahlen.jsp");
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
