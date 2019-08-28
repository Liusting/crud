package lgt.crud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lgt.crud.test.GetMessageCode;

@Controller
public class LoginController {
	/** serialVersionUID*/
    private static final long serialVersionUID = 1L;

    @RequestMapping(value= {"/sendSMS"},method = {RequestMethod.POST})
    @ResponseBody
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String  phone=request.getParameter("phone");
        System.out.println(phone);
        //根据获取到的手机号发送验证码
        String code = GetMessageCode.getCode(phone);
        System.out.println("返回code"+code);
        response.getWriter().print(code);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
