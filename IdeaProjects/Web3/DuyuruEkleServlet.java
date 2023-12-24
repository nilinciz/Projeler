package com.example.web3;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


@WebServlet(name = "DuyuruEkleServlet", value = "/duyuruEkle")
public class DuyuruEkleServlet extends HttpServlet {
        private DuyuruVeri duyuruVeri = new DuyuruVeri();
        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
            try {
                String ad=request.getParameter("ad");
                String icerik=request.getParameter("icerik");
                String gosterimtarihi = request.getParameter("gosterimtarihi");
                String bitistarihi = request.getParameter("bitistarihi");

                Duyuru duyuru1 = new Duyuru(ad,icerik,gosterimtarihi,bitistarihi);

                duyuruVeri.duyuruEkle(duyuru1);

                response.sendRedirect(request.getContextPath()+"/index");

            } catch (Exception ex) {
                ex.printStackTrace(); // Hatanın tam izini yazdırır
                throw new RuntimeException(ex);
            }

        }


        public void destroy() {
        }
    }