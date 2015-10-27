<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#"><bean:message key="label.rdb.to.onto" /></a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<li><a href="#"><bean:message key="label.overview" /></a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"><bean:message key="label.download" /><span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#"><bean:message key="label.project" /></a></li>
						<li><a href="#"><bean:message key="label.documentation" /></a></li>
					</ul>
				</li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"><bean:message key="label.template" /><span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#"><bean:message key="label.database.structure" /></a></li>
						<li><a href="#"><bean:message key="label.database.records" /></a></li>
					</ul>
				</li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"><bean:message key="label.scripts" /><span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#"><bean:message key="label.upper.level.ontology" /></a></li>
						<li><a href="#"><bean:message key="label.project.database" /></a></li>
					</ul>
				</li>
				<li><a href="#"><bean:message key="label.contact" /></a></li>
			</ul>
		</div>
	</div>
</nav>
