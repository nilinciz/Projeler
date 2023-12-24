package com.example.ornek2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ogrenci;
import model.OgrenciVeri;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "MvcServlet", value = "/mvc-servlet")
public class MvcServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        List<Ogrenci> ogrenciler= OgrenciVeri.ogrenciGetir();
        request.setAttribute("ogrenci_listesi",ogrenciler);//atama yapıyor

        RequestDispatcher ds=request.getRequestDispatcher("/ogrenci_listesi.jsp");

        try {
            ds.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }


    }
    public void destroy() {
    }
}