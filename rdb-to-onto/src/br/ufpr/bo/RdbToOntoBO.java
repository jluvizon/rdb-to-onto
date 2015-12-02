package br.ufpr.bo;

import br.ufpr.bean.Database;
import br.ufpr.bean.DatabaseDomain;
import br.ufpr.dao.DatabaseDao;
import br.ufpr.form.RdbToOntoForm;

public class RdbToOntoBO {
	
	DatabaseDao databaseDao = new DatabaseDao();
	
	public Database createDatabase(RdbToOntoForm form){
		
		Database database2 = databaseDao.get(18L);
		database2.getId();
		
		Database database = new Database();
		database.setName(form.getDatabaseName());
		
		databaseDao.saveOrUpdate(database);
		
		DatabaseDomain databaseDomain = new DatabaseDomain();
		databaseDomain.setDescription("financeiro");
		databaseDomain.setDatabase(database);
		
		
		databaseDao.saveOrUpdate(databaseDomain);
		return database;
	}

}
