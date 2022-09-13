package br.com.fam.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fam.dao.FuncionarioDAO;
import br.com.fam.pojo.Funcionario;

/**
 * Servlet implementation class ServletLista
 */
@WebServlet("/ListaServlet")
public class ListaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FuncionarioDAO dao = new FuncionarioDAO();
		List<Funcionario> lista = dao.getFuncionarios();
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset='ISO-8859-1'>");
	    out.println("<title>Funcionários</title>");
	    out.println("</head>");
	    out.println("<body>");
		out.println("<table border='1'>");
		out.println("<tr>\r\n"
				+ "<th>RE</th><th>nome</th><th>data admissao</th><th>salário</th>\r\n"
				+ "</tr>");
		for( Funcionario f: lista ) {
			out.println("<tr>\r\n"
					+ "<td>"+f.getRe()+"</td>"
					+ "<td>"+f.getNome()+"</td>"
					+ "<td>" + f.getDataAdmissao() + "</td>"
					+ "<td>" +f.getSalario() + "</td>\r\n"
					+ "</tr>");
			
		}
		out.println("</table><br/>");
		out.println("<a href='http://localhost:9000/FAM/formList.html'>Cadastrar Funcionario</a><br><br>");
		out.println("<a href='http://localhost:9000/FAM/formDelete.html'>Excluir Funcionario</a>");
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