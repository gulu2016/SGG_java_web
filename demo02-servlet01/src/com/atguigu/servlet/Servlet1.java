package com.atguigu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//s70-1-1 use annotate to map servlet and url
//@WebServlet("/s1")
//s70-1-2 it also support one servlet map many urls
@WebServlet(urlPatterns = {"/s1","/x1","/servlet1"})
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet1执行了");
    }
}
