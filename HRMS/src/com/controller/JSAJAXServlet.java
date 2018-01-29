package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "JSAJAXServlet",urlPatterns = "/adminJSAJAX")
public class JSAJAXServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String newsTitle=request.getParameter("newsTile");
        if("".equals(newsTitle)){
            response.getWriter().print("²»ÄÜÎª¿Õ");
        }else {
            response.getWriter().print("OK");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
