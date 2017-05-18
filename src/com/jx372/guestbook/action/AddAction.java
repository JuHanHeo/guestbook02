package com.jx372.guestbook.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jx372.emaillist.action.Action;
import com.jx372.guestbook.dao.GuestBookDao;
import com.jx372.guestbook.vo.GuestBookVo;
import com.jx372.web.util.WebUtils;

public class AddAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		GuestBookVo vo = new GuestBookVo();
		
		vo.setName(request.getParameter("name"));
		vo.setMessage(request.getParameter("message"));
		vo.setName(request.getParameter("name"));
		vo.setPasswd(request.getParameter("passwd"));
		System.out.println(request.getParameter("name"));
		new GuestBookDao().insert(vo);
		
		
		WebUtils.redirect("/guestbook02/gb", request, response);
	}

}
