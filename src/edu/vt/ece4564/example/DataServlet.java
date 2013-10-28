package edu.vt.ece4564.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import android.util.Log;

public class DataServlet extends HttpServlet {
	public String[] workoutList1 = {" ", " ", " ", " ", " ", " "};
	public String[] workoutList2 = {" ", " ", " ", " ", " ", " "};
	public String[] workoutList3 = {" ", " ", " ", " ", " ", " "};
	public String[] workoutList4 = {" ", " ", " ", " ", " ", " "};
	public String[] workoutList5 = {" ", " ", " ", " ", " ", " "};
	public String[] workoutList6 = {" ", " ", " ", " ", " ", " "};
	public String[] workoutList7 = {" ", " ", " ", " ", " ", " "};
	public String[] workoutList8 = {" ", " ", " ", " ", " ", " "};
	public String[] workoutList9 = {" ", " ", " ", " ", " ", " "};
	public String[] workoutList10 = {" ", " ", " ", " ", " ", " "};
	public String[] workoutList = {" ", " ", " ", " ", " ", " "};
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		String workoutNum_ = req.getParameter("WorkoutPlanNum");
		
		switch (Integer.parseInt(workoutNum_)) {
			case 1:	for (int i =1; i < 6 ; i++) {
						workoutList[i] = workoutList1[i];
						}
					break;
			case 2:	for (int i =1; i < 6 ; i++) {
						workoutList[i] = workoutList2[i];
						} 
					break;   
			case 3:	for (int i =1; i < 6 ; i++) {
						workoutList[i] = workoutList3[i];
						}
					break;
			case 4:	for (int i =1; i < 6 ; i++) {
						workoutList[i] = workoutList1[i];
						}
					break;
			case 5:	for (int i =1; i < 6 ; i++) {
						workoutList[i] = workoutList2[i];
						} 
					break;   
			case 6:	for (int i =1; i < 6 ; i++) {
						workoutList[i] = workoutList3[i];
						}
					break;
			default: workoutList[1] = "Invalid Workout Plan #.";
					 workoutList[2] = "Please try again!";
					for (int i =3; i < 6 ; i++) {
						workoutList[i] = " ";
					}
			} 	
		//resp.getWriter().write("Data Servlet: Hello World");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
		                                   "Transitional//EN\">\n" +
		                "<HTML>\n" +
		                "<HEAD><TITLE>Data Servlet 8080 Hello WWW</TITLE></HEAD>\n" +
		                "<BODY>\n" +
		                "<WorkoutType>" + workoutList[1] + "</WorkoutType>" +
		                "<WorkoutType>" + workoutList[2] + "</WorkoutType>" +
		                "<WorkoutType>" + workoutList[3] + "</WorkoutType>" +
		                "<WorkoutType>" + workoutList[4] + "</WorkoutType>" +
		                "<WorkoutType>" + workoutList[5] + "</WorkoutType>" +
		                "<H1>Hello WWW </H1>\n" +
		                "</BODY></HTML>");
			
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	    //resp.setContentType("text/plain");
	    //resp.getWriter().println("Hello, world data");
		
		String workoutNum_ = req.getParameter("WorkoutPlanNum");
		if (workoutNum_ != "0") {
			//check workout plan number
			switch (Integer.parseInt(workoutNum_)) {
			case 1 :  workoutList1[1] = req.getParameter("WorkoutType1");
					workoutList1[2] = req.getParameter("WorkoutType2");
		  			workoutList1[3] = req.getParameter("WorkoutType3");
		  			workoutList1[4] = req.getParameter("WorkoutType4");
		  			workoutList1[5] = req.getParameter("WorkoutType5");
			        break;
			case 2 : 	workoutList2[1] = req.getParameter("WorkoutType1");
					workoutList2[2] = req.getParameter("WorkoutType2");
					workoutList2[3] = req.getParameter("WorkoutType3");
					workoutList2[4] = req.getParameter("WorkoutType4");
					workoutList2[5] = req.getParameter("WorkoutType5");
			  		break;
			case 3 : 	workoutList3[1] = req.getParameter("WorkoutType1");
					workoutList3[2] = req.getParameter("WorkoutType2");
					workoutList3[3] = req.getParameter("WorkoutType3");
					workoutList3[4] = req.getParameter("WorkoutType4");
					workoutList3[5] = req.getParameter("WorkoutType5");
					break;
			}
		}
		String urlportNum_ = req.getParameter("UrlNum");
		
		//String addr = req.getRemoteAddr();
		String host = req.getRemoteHost();
		String url = req.getRequestURL().toString();
		
		resp.getWriter().println("It stored :: ");
		resp.getWriter().println(workoutNum_);
		resp.getWriter().println(workoutList1[1]);
		resp.getWriter().println(workoutList1[2]);
		resp.getWriter().println(workoutList1[3]);
		resp.getWriter().println(workoutList1[4]);
		resp.getWriter().println(workoutList1[5]); 
		resp.getWriter().println(urlportNum_);
		//resp.getWriter().write(addr + " ");
		//resp.getWriter().println(host);
		//resp.getWriter().println(url);
	}
}
