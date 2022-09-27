package com.aluno.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aluno.dao.AlunoDAO;
import com.aluno.model.Aluno;

/**
 * Servlet implementation class DeleteAlunoServlet
 */
@WebServlet("/DeleteAlunoServlet")
public class DeleteAlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteAlunoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long ra = Long.parseLong(request.getParameter("ra"));
		AlunoDAO dao = new AlunoDAO();
		dao.deleteAluno(new Aluno(ra, null, null, null, 0));
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Aluno Deletado</title>\r\n"
				+ "<link rel='stylesheet' type='text/css' href='/AlunoFAM/Aluno/global.css'>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<main>\r\n"
				+ "<h2>Aluno Deletado!</h2>"
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
