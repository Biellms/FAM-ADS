package br.com.fam.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fam.dao.FuncionarioDAO;
import br.com.fam.pojo.Funcionario;

/**
 * Servlet implementation class ExcluirServlet
 */
@WebServlet("/excluirFuncionario")
public class ExcluirServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExcluirServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int re = Integer.parseInt(request.getParameter("re"));
		FuncionarioDAO dao = new FuncionarioDAO();
		dao.deleteFuncionario(new Funcionario(re,null,null,0));
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset='ISO-8859-1'>");
	    out.println("<title>Resultado</title>");
	    out.println("<link rel='stylesheet' type='text/css' href='./style.css'>");
	    out.println("</head>");
	    out.println("<body>");
		out.println("Funcionario excluido<br/>");
		out.println("<a href='http://localhost:9000/FAM/ListaServlet'>voltar ao menu principal</a>");
	    out.println("</body>");
	    out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
