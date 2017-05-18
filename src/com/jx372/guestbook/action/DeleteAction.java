package com.jx372.guestbook.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jx372.emaillist.action.Action;
import com.jx372.guestbook.dao.GuestBookDao;
import com.jx372.web.util.WebUtils;

public class DeleteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		new GuestBookDao().delete(request.getParameter("no"));
		WebUtils.redirect("/guestbook02/gb", request, response);
	}

}
