/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Anurag;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.text.DecimalFormat;

/**
 *
 * @author Anurag-PC
 */
@WebServlet(name = "myfactorial1", urlPatterns = {"/myfactorial1"})
public class myfactorial1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param num
     * @param request servlet request
     * @param response servlet response
     * @return 
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public double factorial(int num)
    {
        if(num==1 || num==0) return 1;
        else return num*factorial(num-1);
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body> <style>\n " +
"\n" +
"		table {\n" +
"			width: 700px;\n" +
"			margin: auto;\n" +
"			text-align: center;\n" +
"			table-layout: fixed;\n" +
"		}\n" +
"\n" +
"		\n" +
"		table,\n" +
"		td,\n" +
"		tr {\n" +
"			padding: 12px;\n" +
"			color: rgb(255, 255, 255);\n" +
"			background: hsl(206, 88%, 32%);\n" +
"			border: 1px solid black;\n" +
"			border-collapse: collapse;\n" +
"			font-size: 20px;\n" +
"			font-family: 'Lucida Sans',\n" +
"				'Lucida Sans Regular',\n" +
"				'Lucida Grande',\n" +
"				'Lucida Sans Unicode',\n" +
"				Geneva, Verdana, sans-serif;\n" +
"		}\n" +
"\n" +
"		\n" +
"		th {\n" +
"			color: white;\n" +
"			border: 1px solid black;\n" +
"			border-collapse: collapse;\n" +
"			background: #14229c;\n" +
"		}\n" +
"\n" +
                    "button{\n" +
"  position: absolute;\n" +
"  border: 2px solid white;\n" +
"  background: #0a5b99;\n" +
"  font-family: 'Roboto', sans-serif;\n" +
"  color: white;\n" +
"  width: 250px;\n" +
"  height: 50px;\n" +
                    
"  \n" +
"  border-radius: 5px;\n" +
  

"  right: 80vh;\n" +
"  margin: auto;\n" +
"  transition: .3s;\n" +
"}\n" +
"\n" +
                    "a{\n + \"text-decoration: none;\"}"+
"button:hover{\n" +

                    
"  background: #00ccff;\n" +
"  cursor: pointer;\n" +
"  color: #104F55;\n" +
"  opacity: .8;\n" +
"  transition: .3s;\n" +
"  box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);\n" +
"}\n" +
"\n" +
"	\n" +
"		td:hover {\n" +
"			background: #00ccff;\n" +
"		}\n" + 
"	</style>");
            
            out.println("<h1 style=\"text-align: center;color: #14229c;\"> Table of the Factorial </h1>");
            out.println("<table>");
            out.println("<tr> <th> Number </th> <th> Factorial </th> </tr>");
            
            String no = request.getParameter("A");
            int no1 = Integer.parseInt(no);
            double fact =1;
            DecimalFormat df = new DecimalFormat("#");
            df.setMaximumFractionDigits(60);
            for(int i=1;i<=no1;i++){
                out.println("<tr> <td>");
                out.println(i + "</td> <td>");
                fact = fact*i;
                //out.println(df.format(fact) + "</td> </tr>");
//                out.println(fact+"</td> </tr>");
                out.println(df.format(factorial(i))+"</td></tr>");
                System.out.println(df.format(factorial(i)));
            }
                      
            out.println("</table> <br> <br> <br> <br> <button><h2><a style=\"color: white;text-decoration: none;\" href=\"index.html\">Home</a></h2> </button>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
