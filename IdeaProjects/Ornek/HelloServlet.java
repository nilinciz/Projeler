package com.example.ornek2;

import java.io.*;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        //veri oluşturma
        String[] students={"Yusuf","Hatice"};
        request.setAttribute("student_list",students);

        //request dispatcher oluşturma
        RequestDispatcher ds=request.getRequestDispatcher("/view_students.jsp");

        //jsp gönderme
        try {
            ds.forward(request, response);
        }
        catch (ServletException e){
            throw new RuntimeException(e);
        }
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}