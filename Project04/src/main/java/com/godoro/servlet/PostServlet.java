package com.godoro.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/post")
public class PostServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest requst, HttpServletResponse response) 
			throws ServletException, IOException {
		
	}
}
