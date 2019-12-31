package com.exercise40.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class readIndividualServlet
 */
@WebServlet("/readIndividualServlet")
public class readIndividualServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html chartset='utf-8'");
		PrintWriter output = response.getWriter();
		
		output.append("id Product: "+request.getParameter("idProduct"));
		
		output.close();
	}

}
