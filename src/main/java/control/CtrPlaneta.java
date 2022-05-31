package control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelos.CalcularPeso;

import java.io.IOException;

/**
 * Servlet implementation class CtrPlaneta
 */

@WebServlet("/formularioPeso")
public class CtrPlaneta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CtrPlaneta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//recojo el planeta elegido
		String planeta = request.getParameter("planeta");
		
		//recojo el peso ingresado
		double peso = 0;
		
		try {
			
			peso = Double.parseDouble(request.getParameter("pesoIngresado"));
			
			
			String respuesta = CalcularPeso.cualquierPlaneta(planeta, peso);
			
			request.setAttribute("respuesta", respuesta);
			request.setAttribute("pesoIngresado", Double.toString(peso));
			
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace(System.out);
			
			String respuesta = "Lo sentimos.. debes ingresar un numero";
			
			request.setAttribute("respuesta", respuesta);
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
		
		
		
		

		
		
		
		//doGet(request, response);
	}

}