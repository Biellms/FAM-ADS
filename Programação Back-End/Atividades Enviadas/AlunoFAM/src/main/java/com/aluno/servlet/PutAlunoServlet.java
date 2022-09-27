package com.aluno.servlet;

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

import com.aluno.dao.AlunoDAO;
import com.aluno.model.Aluno;

/**
 * Servlet implementation class PutAlunoServlet
 */
@WebServlet("/PutAlunoServlet")
public class PutAlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PutAlunoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long ra = Long.parseLong(request.getParameter("ra"));
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date dataNasc;
		try {
			dataNasc = format.parse(request.getParameter("dataNasc"));
		} catch(ParseException e) {
			dataNasc = null;
		}
		double renda = Double.parseDouble(request.getParameter("renda"));
		
		AlunoDAO dao = new AlunoDAO();
		dao.putAluno(new Aluno(ra, nome, email, dataNasc, renda));
		
		PrintWriter out = response.getWriter();
				
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Aluno Alterado</title>\r\n"
				+ "<link rel='stylesheet' type='text/css' href='/AlunoFAM/Aluno/global.css'>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<main>\r\n"
				+ "<h2>Aluno Alterado!</h2>"
				+ "<a class='a' href='/AlunoFAM/Aluno/'>Voltar</a>"
				+ "</main>\r\n"
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
