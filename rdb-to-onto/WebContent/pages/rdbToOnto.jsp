<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<div class="panel panel-default">
	<div class="panel-heading"><bean:message key="label.relational.database.to.ontology" /></div>
	<div class="panel-body">
		<form role="form">
			<div class="form-group">
				<label for="databaseStructure"><bean:message key="label.database.structure" />:</label> <input type="file"
					class="form-control" id="databaseStructure">
			</div>
			
			<div class="form-group">
				<label for="databaseRecords"><bean:message key="label.database.records" />:</label> <input type="file"
					class="form-control" id="databaseRecords">
			</div>
			
			<button type="submit" class="btn btn-primary"><bean:message key="button.submit" /></button>
		</form>
	</div>
</div>