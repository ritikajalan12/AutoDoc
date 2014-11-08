package com.hp;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "Minor", urlPatterns = {"/Minor"})
public class Minor extends HttpServlet 
{
     String name=" ";
   String comments=" ";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         Minor[] s=new Minor[10];
        
       for(int t=0;t<10;t++)
       {
           s[t]=new Minor();
       }
        String filename="C:/prac/test.txt";
        out.print("<html>\n" +
"<head>\n" +
"<title>Documentation</title>\n" +
"<meta charset=\"utf-8\">\n" +
"<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
"</head>\n" +
"<body>\n" +
"<div id=\"background\">\n" +
"  <div id=\"page\">\n" +
"    <div class=\"header\">\n" +
"      <div class=\"footer\">\n" +
"        <div class=\"body\">\n" +
"          <div id=\"sidebar\"> <a href=\"#\"><img id=\"logo\" src=\"images/logo.jpg\" with=\"250\" height=\"100\" alt=\"\"></a>\n" +
"            <div class=\"footenote\"> <span>&copy; Copyright &copy; 2014.</span> <span><a href=\"#\">Domain Name</a> all rights reserved\n" +
" | TO know more: <a href=\"http://www.csstemplatesfree.org\">CONTACT ritika jalan</a></span></div>\n" +
"         </div>");
        try {
            int j,k=0,i=0,u=0,s1=0,h=0,s2=0,q=0;
            readfile file =new readfile(filename);
            String[] arr=file.openfile();
           for(j=0;j<arr.length;j++)
           {
                   Pattern r=Pattern.compile("^(class|public class)");
            Matcher m=r.matcher(arr[j]);
                  if(m.find())
                  {
                      k=m.end();
                   s[i].name=arr[j].substring(k);
                  i++;
                  }   
           }
           out.print("<h1 style=color:black;text-align:center>CLASSES</h1>");
           for(int t=0;t<=i-1;t++)
           {
           out.print("<h2 style=color:black;text-align:center>"+s[t].name+"</h2>");
          
           }
           out.print("<h1 style=color:black;text-align:center>FUNCTIONS</h1>");
           for(u=0;u<arr.length;u++)
           {  
           Pattern r=Pattern.compile("^(void|int|char|double|boolean)(.*?)\\(");
         Matcher m=r.matcher(arr[u]);     
         if(m.find())
         {
             s1=u;
             out.print("<h2 style=color:black;text-align:center>function name:"+m.group(2)+"</h2>");
             out.print("<h2 style=color:black;text-align:center>return type:"+m.group(1)+"</h2>");
              Pattern r1=Pattern.compile("\\((.*?)\\)");
         Matcher m1=r1.matcher(arr[s1]);
         if(m1.find())
         {
             out.print("<h2 style=color:black;text-align:center>function arguments:"+m1.group(1)+"</h2>");
             String u1=m1.group(1);
             if(u1.equals(""))
             {
                  out.print("<h2 style=color:black;text-align:center>number of arguments:0</h2>"); 
             }
             else
             {
            int j1= u1.split(",").length;
             out.print("<h2 style=color:black;text-align:center>number of arguments:"+j1+"</h2>");    
         }
         }
           } 
           }
           out.print("<h1 style=color:black>CONSTRUCTORS</h1>");
           for(q=0;q<=i-1;q++)
           {
             for(h=0;h<arr.length;h++)
             {
               Pattern r=Pattern.compile("^"+(s[q].name));
               Matcher m=r.matcher(arr[h]);
               if(m.find())
               {
                  s2=h;
                   Pattern p1=Pattern.compile("\\((.*?)\\)");
                   Matcher m1=p1.matcher(arr[s2]);
                   if(m1.group(1).equals(""))
                   out.print("<h3>"+s[q].name+":default</h3>");
                   else
                    out.print("<h3>"+s[q].name+":parametrized</h3>");
               }
               }  
           }
          // Pattern p2=Pattern.compile("");
           //Matcher m2=p2.matcher()
        }
        finally
        {
            out.close();
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
