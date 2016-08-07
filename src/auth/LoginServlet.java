package auth;

import util.HttpServletResponseUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Dean on 16/8/7.
 */
public class LoginServlet extends HttpServlet {

    /**
     * 执行必需的初始化
     *
     * @throws ServletException
     */
    public void init() throws ServletException {
        super.init();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        System.out.println("userName is " + userName + " ; password is " + password);

//        resp.setContentType("text/html;charset=utf-8");
        HttpServletResponseUtil.setConfig(resp);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("登陆成功");
        printWriter.flush();
        printWriter.close();
    }

    /**
     * 什么也不做
     */
    public void destroy() {
        super.destroy();
    }

}
