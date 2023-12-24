package com.example.web3;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;


@WebServlet(name = "DuyurularServlet", value = "/index")
public class DuyurularServlet extends HttpServlet {
        private DuyuruVeri duyuruVeri = new DuyuruVeri();
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/html");
            List<Duyuru> duyurular = null;
            try {
                duyurular = duyuruVeri.duyuruGetir();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            request.setAttribute("duyuruListesi", duyurular);
            RequestDispatcher rs1 = request.getRequestDispatcher("/anasayfa.jsp");
            try {
                rs1.forward(request,response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            }
        }

        public void destroy() {
        }
    }