import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
public class LoginServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
		throws IOException,ServletException
	{
		String s1=req.getParameter("uname");
		String s2=req.getParameter("pwd");
		PrintWriter out=res.getWriter();
		if(s1.equals("lakshmi")&&s2.equals("reddy"))
		{
			out.println("Login sucess......");
		}
		else
		{
			out.println("Login fail.........");
		}
	}
}