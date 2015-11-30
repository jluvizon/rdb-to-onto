package br.ufpr.bo;

import br.ufpr.bean.Database;
import br.ufpr.dao.DatabaseDao;
import br.ufpr.form.RdbToOntoForm;

public class RdbToOntoBO {
	
	DatabaseDao databaseDao = new DatabaseDao();
	
	public Database createDatabase(RdbToOntoForm form){
		Database database = new Database();
		database.setName(form.getDatabaseName());
		databaseDao.saveOrUpdate(database);
		return database;
	}

}
