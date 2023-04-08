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

/**
 *
 * @author Anurag-PC
 */
@WebServlet(name = "myfactorial", urlPatterns = {"/myfactorial"})
public class myfactorial extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String no = request.getParameter("A");
            int no1 = Integer.parseInt(no);
            double fact =1;
            for(int i=1;i<=no1;i++){
                fact = fact*i;
            }
                      
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>  <style>\n" +
"body {\n" +
"    margin: 0;\n" +
"    height: 100vh;\n" +
"    font-weight: 100;\n" +
"    background: radial-gradient(rgb(30, 138, 246),#1f1013);\n" +
"    -webkit-overflow-Y: hidden;\n" +
"    -moz-overflow-Y: hidden;\n" +
"    -o-overflow-Y: hidden;\n" +
"    overflow-y: hidden;\n" +
"    -webkit-animation: fadeIn 1 1s ease-out;\n" +
"    -moz-animation: fadeIn 1 1s ease-out;\n" +
"    -o-animation: fadeIn 1 1s ease-out;\n" +
"    animation: fadeIn 1 1s ease-out;\n" +
"}\n" +
"\n" +
"button{\n" +
"  position: absolute;\n" +
"  border: 2px solid white;\n" +
"  background: transparent;\n" +
"  font-family: 'Roboto', sans-serif;\n" +
"  color: white;\n" +
"  width: 250px;\n" +
"  height: 50px;\n" +
"  \n" +
"  border-radius: 5px;\n" +
"  opacity: .5;\n" +
"  top: 40vh;\n" +
"  bottom: 0px;\n" +
"  left: 0px;\n" +
"  right: 0px;\n" +
"  margin: auto;\n" +
"  transition: .3s;\n" +
"}\n" +
"\n" +
"button:hover{\n" +
"  border: 2px solid #104F55;\n" +
"  background-color: rgba(365,365,365,0.5);\n" +
"  cursor: pointer;\n" +
"  color: #104F55;\n" +
"  opacity: .8;\n" +
"  transition: .3s;\n" +
"  box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);\n" +
"}\n" +
"\n" +
".light {\n" +
"    position: absolute;\n" +
"    width: 0px;\n" +
"    opacity: .75;\n" +
"    background-color: white;\n" +
"    box-shadow: #e9f1f1 0px 0px 20px 2px;\n" +
"    opacity: 0;\n" +
"    top: 100vh;\n" +
"    bottom: 0px;\n" +
"    left: 0px;\n" +
"    right: 0px;\n" +
"    margin: auto;\n" +
"}\n" +
"\n" +
".x1{\n" +
"  -webkit-animation: floatUp 4s infinite linear;\n" +
"  -moz-animation: floatUp 4s infinite linear;\n" +
"  -o-animation: floatUp 4s infinite linear;\n" +
"  animation: floatUp 4s infinite linear;\n" +
"   -webkit-transform: scale(1.0);\n" +
"   -moz-transform: scale(1.0);\n" +
"   -o-transform: scale(1.0);\n" +
"  transform: scale(1.0);\n" +
"}\n" +
"\n" +
".x2{\n" +
"  -webkit-animation: floatUp 7s infinite linear;\n" +
"  -moz-animation: floatUp 7s infinite linear;\n" +
"  -o-animation: floatUp 7s infinite linear;\n" +
"  animation: floatUp 7s infinite linear;\n" +
"  -webkit-transform: scale(1.6);\n" +
"  -moz-transform: scale(1.6);\n" +
"  -o-transform: scale(1.6);\n" +
"  transform: scale(1.6);\n" +
"  left: 15%;\n" +
"}\n" +
"\n" +
".x3{\n" +
"  -webkit-animation: floatUp 2.5s infinite linear;\n" +
"  -moz-animation: floatUp 2.5s infinite linear;\n" +
"  -o-animation: floatUp 2.5s infinite linear;\n" +
"  animation: floatUp 2.5s infinite linear;\n" +
"  -webkit-transform: scale(.5);\n" +
"  -moz-transform: scale(.5);\n" +
"  -o-transform: scale(.5);\n" +
"  transform: scale(.5);\n" +
"  left: -15%;\n" +
"}\n" +
"\n" +
".x4{\n" +
"  -webkit-animation: floatUp 4.5s infinite linear;\n" +
"  -moz-animation: floatUp 4.5s infinite linear;\n" +
"  -o-animation: floatUp 4.5s infinite linear;\n" +
"  animation: floatUp 4.5s infinite linear;\n" +
"  -webkit-transform: scale(1.2);\n" +
"  -moz-transform: scale(1.2);\n" +
"  -o-transform: scale(1.2);\n" +
"  transform: scale(1.2);\n" +
"  left: -34%;\n" +
"}\n" +
"\n" +
".x5{\n" +
"  -webkit-animation: floatUp 8s infinite linear;\n" +
"  -moz-animation: floatUp 8s infinite linear;\n" +
"  -o-animation: floatUp 8s infinite linear;\n" +
"  animation: floatUp 8s infinite linear;\n" +
"  -webkit-transform: scale(2.2);\n" +
"  -moz-transform: scale(2.2);\n" +
"  -o-transform: scale(2.2);\n" +
"  transform: scale(2.2);\n" +
"  left: -57%;\n" +
"}\n" +
"\n" +
".x6{\n" +
"  -webkit-animation: floatUp 3s infinite linear;\n" +
"  -moz-animation: floatUp 3s infinite linear;\n" +
"  -o-animation: floatUp 3s infinite linear;\n" +
"  animation: floatUp 3s infinite linear;\n" +
"  -webkit-transform: scale(.8);\n" +
"  -moz-transform: scale(.8);\n" +
"  -o-transform: scale(.8);\n" +
"  transform: scale(.8);\n" +
"  left: -81%;\n" +
"}\n" +
"\n" +
".x7{\n" +
"  -webkit-animation: floatUp 5.3s infinite linear;\n" +
"  -moz-animation: floatUp 5.3s infinite linear;\n" +
"  -o-animation: floatUp 5.3s infinite linear;\n" +
"  animation: floatUp 5.3s infinite linear;\n" +
"  -webkit-transform: scale(3.2);\n" +
"  -moz-transform: scale(3.2);\n" +
"  -o-transform: scale(3.2);\n" +
"  transform: scale(3.2);\n" +
"  left: 37%;\n" +
"}\n" +
"\n" +
".x8{\n" +
"  -webkit-animation: floatUp 4.7s infinite linear;\n" +
"  -moz-animation: floatUp 4.7s infinite linear;\n" +
"  -o-animation: floatUp 4.7s infinite linear;\n" +
"  animation: floatUp 4.7s infinite linear;\n" +
"  -webkit-transform: scale(1.7);\n" +
"  -moz-transform: scale(1.7);\n" +
"  -o-transform: scale(1.7);\n" +
"  transform: scale(1.7);\n" +
"  left: 62%;\n" +
"}\n" +
"\n" +
".x9{\n" +
"  -webkit-animation: floatUp 4.1s infinite linear;\n" +
"  -moz-animation: floatUp 4.1s infinite linear;\n" +
"  -o-animation: floatUp 4.1s infinite linear;\n" +
"  animation: floatUp 4.1s infinite linear;\n" +
"  -webkit-transform: scale(0.9);\n" +
"  -moz-transform: scale(0.9);\n" +
"  -o-transform: scale(0.9);\n" +
"  transform: scale(0.9);\n" +
"  left: 85%;\n" +
"}\n" +
"\n" +
"button:focus{\n" +
"  outline: none;\n" +
"  float: inline-start;\n" +
"}\n" +
"\n" +
"@-webkit-keyframes floatUp{\n" +
"  0%{top: 100vh; opacity: 0;}\n" +
"  25%{opacity: 1;}\n" +
"  50%{top: 0vh; opacity: .8;}\n" +
"  75%{opacity: 1;}\n" +
"  100%{top: -100vh; opacity: 0;}\n" +
"}\n" +
"@-moz-keyframes floatUp{\n" +
"  0%{top: 100vh; opacity: 0;}\n" +
"  25%{opacity: 1;}\n" +
"  50%{top: 0vh; opacity: .8;}\n" +
"  75%{opacity: 1;}\n" +
"  100%{top: -100vh; opacity: 0;}\n" +
"}\n" +
"@-o-keyframes floatUp{\n" +
"  0%{top: 100vh; opacity: 0;}\n" +
"  25%{opacity: 1;}\n" +
"  50%{top: 0vh; opacity: .8;}\n" +
"  75%{opacity: 1;}\n" +
"  100%{top: -100vh; opacity: 0;}\n" +
"}\n" +
"@keyframes floatUp{\n" +
"  0%{top: 100vh; opacity: 0;}\n" +
"  25%{opacity: 1;}\n" +
"  50%{top: 0vh; opacity: .8;}\n" +
"  75%{opacity: 1;}\n" +
"  100%{top: -100vh; opacity: 0;}\n" +
"}\n" +
"\n" +
".header{\n" +
"  position: absolute;\n" +
"  top: 40%;\n" +
"  left: 50%;\n" +
"  transform: translate(-50%, -50%);\n" +
"  font-family: 'Roboto', sans-serif;\n" +
"  font-weight: 200;\n" +
"  color: white;\n" +
"  font-size: 2em;\n" +
"}\n" +
"\n" +
"#head1, #head2,#head3, #head4, #head5{\n" +
"  opacity: 0;\n" +
"}\n" +
"\n" +
"#head1{\n" +
"  -webkit-animation: fadeOut 1 5s ease-in;\n" +
"  -moz-animation: fadeOut 1 5s ease-in;\n" +
"  -o-animation: fadeOut 1 5s ease-in;\n" +
"  animation: fadeOut 1 5s ease-in;\n" +
"}\n" +
"\n" +
"#head2{\n" +
"  -webkit-animation: fadeOut 1 5s ease-in;\n" +
"  -moz-animation: fadeOut 1 5s ease-in;\n" +
"  -o-animation: fadeOut 1 5s ease-in;\n" +
"  animation: fadeOut 1 5s ease-in;\n" +
"  -webkit-animation-delay: 6s;\n" +
"  -moz-animation-delay: 6s;\n" +
"  -o-animation-delay: 6s;\n" +
"  animation-delay: 6s;\n" +
"}\n" +
"\n" +
"#head3{\n" +
"  -webkit-animation: fadeOut 1 5s ease-in;\n" +
"  -moz-animation: fadeOut 1 5s ease-in;\n" +
"  -o-animation: fadeOut 1 5s ease-in;\n" +
"  animation: fadeOut 1 5s ease-in;\n" +
"  -webkit-animation-delay: 12s;\n" +
"  -moz-animation-delay: 12s;\n" +
"  -o-animation-delay: 12s;\n" +
"  animation-delay: 12s;\n" +
"}\n" +
"\n" +
"#head4{\n" +
"  -webkit-animation: fadeOut 1 5s ease-in;\n" +
"  -moz-animation: fadeOut 1 5s ease-in;\n" +
"  -o-animation: fadeOut 1 5s ease-in;\n" +
"  animation: fadeOut 1 5s ease-in;\n" +
"  -webkit-animation-delay: 17s;\n" +
"  -moz-animation-delay: 17s;\n" +
"  -o-animation-delay: 17s;\n" +
"  animation-delay: 17s;\n" +
"}\n" +
"\n" +
"#head5{\n" +
"  -webkit-animation: finalFade 1 5s ease-in;\n" +
"  -moz-animation: finalFade 1 5s ease-in;\n" +
"  -o-animation: finalFade 1 5s ease-in;\n" +
"  animation: finalFade 1 5s ease-in;\n" +
"  -webkit-animation-fill-mode: forwards;\n" +
"  -moz-animation-fill-mode: forwards;\n" +
"  -o-animation-fill-mode: forwards;\n" +
"  animation-fill-mode: forwards;\n" +
"  -webkit-animation-delay: 22s;\n" +
"  -moz-animation-delay: 22s;\n" +
"  -o-animation-delay: 22s;\n" +
"  animation-delay: 22s;\n" +
"}\n" +
"\n" +
"@-webkit-keyframes fadeIn{\n" +
"  from{opacity: 0;}\n" +
"  to{opacity: 1;}\n" +
"}\n" +
"\n" +
"@-moz-keyframes fadeIn{\n" +
"  from{opacity: 0;}\n" +
"  to{opacity: 1;}\n" +
"}\n" +
"\n" +
"@-o-keyframes fadeIn{\n" +
"  from{opacity: 0;}\n" +
"  to{opacity: 1;}\n" +
"}\n" +
"\n" +
"@keyframes fadeIn{\n" +
"  from{opacity: 0;}\n" +
"  to{opacity: 1;}\n" +
"}\n" +
"\n" +
"@-webkit-keyframes fadeOut{\n" +
"  0%{opacity: 0;}\n" +
"  30%{opacity: 1;}\n" +
"  80%{opacity: .9;}\n" +
"  100%{opacity: 0;}\n" +
"}\n" +
"\n" +
"@-moz-keyframes fadeOut{\n" +
"  0%{opacity: 0;}\n" +
"  30%{opacity: 1;}\n" +
"  80%{opacity: .9;}\n" +
"  100%{opacity: 0;}\n" +
"}\n" +
"\n" +
"@-o-keyframes fadeOut{\n" +
"  0%{opacity: 0;}\n" +
"  30%{opacity: 1;}\n" +
"  80%{opacity: .9;}\n" +
"  100%{opacity: 0;}\n" +
"}\n" +
"\n" +
"@keyframes fadeOut{\n" +
"  0%{opacity: 0;}\n" +
"  30%{opacity: 1;}\n" +
"  80%{opacity: .9;}\n" +
"  100%{opacity: 0;}\n" +
"}\n" +
"\n" +
"@-webkit-keyframes finalFade{\n" +
"  0%{opacity: 0;}\n" +
"  30%{opacity: 1;}\n" +
"  80%{opacity: .9;}\n" +
"  100%{opacity: 1;}\n" +
"}\n" +
"\n" +
"@-moz-keyframes finalFade{\n" +
"  0%{opacity: 0;}\n" +
"  30%{opacity: 1;}\n" +
"  80%{opacity: .9;}\n" +
"  100%{opacity: 1;}\n" +
"}\n" +
"\n" +
"@-o-keyframes finalFade{\n" +
"  0%{opacity: 0;}\n" +
"  30%{opacity: 1;}\n" +
"  80%{opacity: .9;}\n" +
"  100%{opacity: 1;}\n" +
"}\n" +
"\n" +
"@keyframes finalFade{\n" +
"  0%{opacity: 0;}\n" +
"  30%{opacity: 1;}\n" +
"  80%{opacity: .9;}\n" +
"  100%{opacity: 1;}\n" +
"}\n" +
"\n" +
"a{\n" +
"    colour:white;\n" +
"    text-decoration: none;\n" +
"}\n" +
"h2{\n" +
"    margin-top: 5%;\n" +
"}\n" +
"\n" +
"#footer{\n" +
"  font-family: 'Roboto', sans-serif;\n" +
"  font-size: 1.2em;\n" +
"  color: white;\n" +
"  position: fixed;\n" +
"  -webkit-transform: translate(95vw,90vh);\n" +
"  -moz-transform: translate(95vw,90vh);\n" +
"  transform: translate(95vw,90vh);\n" +
"  transform: translate(95vw,90vh);\n" +
"}\n" +
"</style>");
            
            
out.println("<title>Myfactorial</title>");            
out.println("</head>");
out.println("<body>" + 
"<p id='head1' class='header'>Your</p>\n" +
"<p id='head2' class='header'>Result</p>\n" +
"<p id='head3' class='header'>Factorial of given Number = " + fact +"</p>\n" +
"<p id='head5' class='header'>A mini Project by Anurag !!  \n" +
"    <button><h2><a style=\"color: white;\" href=\"index.html\">Thank You !</a></h2>  </button> </p>\n" +
"\n" +
"  <div class='light x1'></div>\n" +
"  <div class='light x2'></div>\n" +
"  <div class='light x3'></div>\n" +
"  <div class='light x4'></div>\n" +
"  <div class='light x5'></div>\n" +
"  <div class='light x6'></div>\n" +
"  <div class='light x7'></div>\n" +
"  <div class='light x8'></div>\n" +
"  <div class='light x9'></div>");
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
