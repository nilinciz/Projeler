package com.example.veritabani;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    Connection con;
    Statement ifade=null;
    ResultSet sonuc=null;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        try {
            con = veritabaniBaglanti.veritabaniBaslat();
            String sorgu="SELECT * FROM ogrenci";
            ifade=con.createStatement();
            sonuc=ifade.executeQuery(sorgu);
            out.println("<table border='1'>");
            out.println("<tr><th>İsim</th><th>Soyisim</th><th>Eposta</th></tr>");

            while(sonuc.next()){
                String isim=sonuc.getString("isim");
                String soyisim=sonuc.getString("soyisim");
                String eposta=sonuc.getString("eposta");
                out.println("<tr>");
                out.println("<td>"+isim+"</td>");
                out.println("<td>"+soyisim+"</td>");
                out.println("<td>"+eposta+"</td>");
                out.println("</tr>");
            }
            out.println("</table>");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        out.println("</body></html>");

    }

    public void destroy() {
    }
}