package presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_test
 */
@WebServlet("/Servlet_test")
public class Servlet_test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("doGet de la servlet /Servlet_test").append(request.getContextPath());

		// 2.--Transmettre des informations
//		String message = "texte introduit par l'utilisateur";
//		request.setAttribute("test", message);

		// boolean res = true;
		/*Creation liste legumes en Java*/
		java.util.List<String> legumes = new java.util.ArrayList<String>();
		legumes.add("poireau");
		legumes.add("haricot");
		legumes.add("carotte");
		legumes.add("pomme de terre");
		/* Rajouter la liste "legumes" comme attribut de la requete */
		request.setAttribute("legumes", legumes);

		/* Création d'une Map */
		java.util.Map<String, Integer> desserts = new java.util.HashMap<String, Integer>();
		desserts.put("cookies", 8);
		desserts.put("glaces", 3);
		desserts.put("muffins", 6);
		desserts.put("tartes aux pommes", 2);
		/* Rajouter la hashmap "desserts" comme attribut de la requete */
		request.setAttribute("desserts", desserts);
		
		
		// 3.--Choisir la page � retourner au client
		this.getServletContext().getRequestDispatcher("/JSTL.jsp").forward(request, response);
		
		// response.getWriter().append("/nClient cree: " + resCreate).append(request.getContextPath());		
//		RequestDispatcher distpatcher;
//		
//		if (res) {
//			distpatcher=request.getRequestDispatcher("bravo.html");
//		}else {
//			distpatcher=request.getRequestDispatcher("fail.html");
//		}
//
//		distpatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("doPost de la servlet /Servlet_test").append(request.getContextPath());

/*
		// 1.--Recup infos requete
//		String vNom = request.getParameter("nom");
//		String vPrenom = request.getParameter("prenom");
//		int vAge = Integer.parseInt(request.getParameter("age"));
//		int vIdConseiller = Integer.parseInt(request.getParameter("idConseiller"));
//		String vMail= request.getParameter("mail");
//		String vTel= request.getParameter("tel");

		// 2.--Transmettre des informations
		String message = "texte introduit par l'utilisateur";
		request.setAttribute("test", message);

		boolean res = false;
		
		// 3.--Choisir la page � retourner au client
		// response.getWriter().append("/nClient cree: " + resCreate).append(request.getContextPath());		
		RequestDispatcher distpatcher;
		
		if (res) {
			distpatcher=request.getRequestDispatcher("bravo.html");
		}else {
			distpatcher=request.getRequestDispatcher("fail.html");
		}

		distpatcher.forward(request, response);
*/		
	}

}
