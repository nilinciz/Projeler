package com.example.web3;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(name = "DuyuruSilServlet", value = "/duyuruSil")
public class DuyuruSilServlet extends HttpServlet {
        private DuyuruVeri duyuruVeri = new DuyuruVeri();

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            try {
                String duyuruId=request.getParameter("duyuruId");
                duyuruVeri.duyuruSil(Integer.parseInt(duyuruId));
                response.sendRedirect(request.getContextPath()+"/index");
            } catch (Exception ex) {
                ex.printStackTrace(); // Hatanın tam izini yazdırır
                throw new RuntimeException(ex);
            }

        }


        public void destroy() {
        }
    }