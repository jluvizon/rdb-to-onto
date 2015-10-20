package br.ufpr.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class GoRdbToOntoAction extends BaseAction {
	
	protected static final String SUCCESS = "success";
	protected static final String FAILURE = "failure";

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		
		return mapping.findForward("success");
	}

}
