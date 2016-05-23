package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserModel;
import db.UserDAO;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private UserDAO db;
	
	public Servlet1(){
		super();
		db = new UserDAO();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws
			ServletException, IOException { 
		List<UserModel> listUserModel = db.getAll();		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException {
	}
}
