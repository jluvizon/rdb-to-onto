package br.ufpr.action;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.ufpr.bean.Pessoa;
import br.ufpr.dao.PessoaDao;

public class GoOverviewAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		request.getSession().setAttribute(
				Globals.LOCALE_KEY, Locale.ENGLISH);
		
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1);
		new PessoaDao().saveOrUpdate(pessoa);
		
		return mapping.findForward("success");
	}

}
