package com.example.web2;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "DuyuruEkleServlet", value = "/duyuru-ekle")
public class DuyuruEkleServlet extends HttpServlet {
    private DuyuruVeri duyuruVeri = new DuyuruVeri();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            String ad=request.getParameter("ad");
            String icerik=request.getParameter("icerik");
            String gosterimtarihiParam = request.getParameter("gosterimtarihi");
            LocalDate gosterimtarihi = LocalDate.parse(gosterimtarihiParam, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            String bitistarihiParam = request.getParameter("bitistarihi");
            LocalDate bitistarihi = LocalDate.parse(bitistarihiParam, DateTimeFormatter.ISO_LOCAL_DATE_TIME);


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