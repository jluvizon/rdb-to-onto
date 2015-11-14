package br.ufpr.form;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class RdbToOntoForm extends ActionForm {

	private static final long serialVersionUID = 1L;

	private FormFile databaseStructure;
	private FormFile databaseRecords;
	
	public FormFile getDatabaseStructure() {
		return databaseStructure;
	}
	public void setDatabaseStructure(FormFile databaseStructure) {
		this.databaseStructure = databaseStructure;
	}
	public FormFile getDatabaseRecords() {
		return databaseRecords;
	}
	public void setDatabaseRecords(FormFile databaseRecords) {
		this.databaseRecords = databaseRecords;
	}

}
