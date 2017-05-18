package com.jx372.guestbook.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jx372.emaillist.action.Action;
import com.jx372.web.util.WebUtils;

public class DeleteConfirmAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		WebUtils.forward("/WEB-INF/views/deleteform.jsp", request, response);
		
	}



}
