

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBServlet
 */
//@WebServlet({"/insert.do","/select.do","/delete.do","/update.do"})
@WebServlet("*.do") // '*'을 쓸 때는 '/'를 쓰지 않는다.

public class DBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service()");
		
		String method = request.getMethod(); //GET
		
		if(method.contentEquals("GET")) {
			doGet(request , response);
		}
		else {
			doPost(request , response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet()");
		process(request,response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		process(request,response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) { 
		
		String uri = request.getRequestURI();
		StringBuffer url = request.getRequestURL();
		String contextPath = request.getContextPath();
		int len = contextPath.length();
		
		//String day = "sunday";
		//String sub = day.substring(2);
		//System.out.println("sub : " + sub); //0부터 시작이고  n부터 나머지 출력 nday 
	
		
		System.out.println("uri : " + uri);
		System.out.println("url : " + url);
		System.out.println("contextPath : " + contextPath);
		System.out.println("len : " + len);
		
		String  command = uri.substring(len);
		System.out.println("command : " + command);
	
		if(command.equals("/insert.do")) {
			System.out.println("insert.do 요청이 들어왔습니다.");
			
			
			
			
			
			
		}
		
		else if(command.equals("/update.do")) {
			System.out.println("update.do 요청이 들어왔습니다.");	
			


		
			
			
			
		}
		
		else if(command.equals("/delete.do")) {
			System.out.println("delete.do 요청이 들어왔습니다.");	
			
			
			
			
			
			
			
		}
		
		else if(command.equals("/select.do")) {
			System.out.println("select.do 요청이 들어왔습니다.");	
			
			
			
			
			
			
			
		}
	
	
		System.out.println("------------------------------------------");
		
	}
	

}
