package com.example.web2;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "DuyuruSilServlet", value = "/duyuru-sil")
public class DuyuruSilServlet extends HttpServlet {
    private DuyuruVeri duyuruVeri = new DuyuruVeri();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            String duyuruId=request.getParameter("duyuruId");

          duyuruVeri.duyuruSil(Integer.parseInt(duyuruId));

            response.sendRedirect(request.getContextPath()+"/index");

        } catch (Exception ex) {
            throw new RuntimeException();
        }

    }

    public void destroy() {
    }
}