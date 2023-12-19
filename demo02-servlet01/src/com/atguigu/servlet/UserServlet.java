package com.atguigu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class UserServlet  extends HttpServlet {
    //s67-3-1 if Tomcat create the object of this class, will call service function
    //s67-3-2 take req as input, take resp as output
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取请求中的参数
        String username = req.getParameter("username");
        //s68-1-1 first way to set content-Type in html response header
        //resp.setHeader("Content-Type","text/html");
        //s68-1-2 second way to set content-Type in html response header
        //s68-1-3 Content-Type will tell client what type of content it is
        resp.setContentType("text/html");
        if("atguigu".equals(username)){
            //通过响应对象响应信息
            resp.getWriter().write("NO");
        }else{
            resp.getWriter().write("YES");
        }

    }
}
