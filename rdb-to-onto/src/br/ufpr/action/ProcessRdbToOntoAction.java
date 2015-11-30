package br.ufpr.action;

import java.util.Scanner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.ufpr.bo.RdbToOntoBO;
import br.ufpr.form.RdbToOntoForm;

public class ProcessRdbToOntoAction extends BaseAction {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		RdbToOntoForm rdbToOntoForm = (RdbToOntoForm) form;
		
		/*Scanner scanner = new Scanner(rdbToOntoForm.getDatabaseStructure().getInputStream(), "UTF-8");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();*/
		RdbToOntoBO rdbToOntoBO = new RdbToOntoBO();
		rdbToOntoBO.createDatabase(rdbToOntoForm);
		
		return null;
		
	}

}
