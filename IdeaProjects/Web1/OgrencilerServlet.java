package com.example.web1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "OgrencilerServlet", value = "/index")
public class OgrencilerServlet extends HttpServlet {
    private OgrenciVeri ogrenciVeri= new OgrenciVeri();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


        List<Ogrenci> ogrenciler= null;
        try {
            ogrenciler = ogrenciVeri.ogrenciGetir();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        request.setAttribute("ogrenci_listesi", ogrenciler);
        RequestDispatcher rs1=request.getRequestDispatcher("/anasayfa.jsp");
        try {
            rs1.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    public void destroy() {
    }
}