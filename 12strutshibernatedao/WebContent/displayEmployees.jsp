<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<head>

<script language="javascript" type="text/javascript">
function addEmployee()
{
	document.forms[0].action = "GetEmployee.do?method=getEmployee";
	document.forms[0].submit();
}
function editEmployee(employeeId)
{
	alert(employeeId);
	document.forms[0].employeeId.value = employeeId;
	document.forms[0].action = "GetEmployee.do?method=getEmployee";
	document.forms[0].submit();
}
function deleteEmployee(employeeId)
{
	alert(employeeId);
	var agree = confirm("Are you sure you want to delete");
	if(agree)
	{
		document.forms[0].employeeId.value = employeeId;
		document.forms[0].action = "DeleteEmployee.do?method=deleteEmployee";
		document.forms[0].submit();
		return true;
	}
	else
	{
		return false;
	}
}

</script>
</head>
<body>


<h5 id="font"><strong>List of Employee </strong></h5><br /><br />
<html:form action="/DisplayEmployees">
<html:hidden property="employeeId"/>
<table align="center">
<tr>
<td>

<table class="sortable" id="sorter">
<tr>
<th class="tdfont">ID</th>
<th class="tdfont">First Name</th>
<th class="tdfont">Middle Name</th>
<th class="tdfont">Last Name</th>
<th class="tdfont">Edit</th>
<th class="tdfont">Delete</th>
</tr>

<logic:present name="EmployeeListForm" property="arlEmployee">
	<logic:iterate id="employee" name="EmployeeListForm" property="arlEmployee" indexId="listIndexId">
	<tr>
		<td class="tdfont"><%=listIndexId + 1%></td>
		<td class="tdfont"><bean:write name="employee" property="firstName"/></td>
		<td class="tdfont"><bean:write name="employee" property="middleName"/></td>
		<td class="tdfont"><bean:write name="employee" property="lastName"/></td>
		<td><a href="javascript:editEmployee(<bean:write name="employee" property="employeeId"/>)">
		<img src="images/edit_small.gif" width="35" height="35" /></a></td>

		<td><a href="javascript:deleteEmployee(<bean:write name="employee" property="employeeId"/>)">
		<img src="images/delete.gif" width="35" height="35" /></a></td>	
	</tr>			
	</logic:iterate>
</logic:present>		             
</table>
</td>
</tr>
</table>
<br/>
<strong>
<p align="center"><html:button property="method"  onclick="addEmployee()">Add Employee</html:button>
</p>
</strong>
</html:form>
<br/><br/><br/><br/><br/>


</body>
</html>