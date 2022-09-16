package br.com.fam.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fam.dao.FuncionarioDAO;
import br.com.fam.pojo.Funcionario;

/**
 * Servlet implementation class AlterarServlet
 */
@WebServlet("/gravarAlteracao")
public class AlterarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int re = Integer.parseInt(request.getParameter("re"));
		String nome = request.getParameter("nome");
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date dataAdmissao;
		try {
			dataAdmissao = format.parse(request.getParameter("dataAdmissao"));
		} catch (ParseException e) {
			dataAdmissao = null;
		}
		double salario = Double.parseDouble(request.getParameter("salario"));
		FuncionarioDAO dao = new FuncionarioDAO();
		dao.putFuncionario(new Funcionario(re, nome, dataAdmissao, salario));
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "<link rel='stylesheet' type='text/css' href='./style.css'>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "Funcionario alterado<br>"
				+ "<a href='http://localhost:9000/FAM/lista.jsp'>Tabela funcionarios</a>"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
