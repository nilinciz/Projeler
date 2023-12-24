package com.example.web1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "OgrenciSilServlet", value = "/ogrenci-sil")
public class OgrenciSilServlet extends HttpServlet {
    private OgrenciVeri ogrenciVeri = new OgrenciVeri();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            String ogrenciId=request.getParameter("ogrenciId");

          ogrenciVeri.ogrenciSil(Integer.parseInt(ogrenciId));

            response.sendRedirect(request.getContextPath()+"/index");

        } catch (Exception ex) {
            throw new RuntimeException();
        }

    }

    public void destroy() {
    }
}