<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<head>
<script language="javascript" type="text/javascript">
	function addEmployee(){
	//	alert("createEmployee");
		document.forms[0].action = "AddEmployee.do?method=addEmployee";
		document.forms[0].submit();
	}
	function editEmployee(){
		//	alert("createEmployee");
			document.forms[0].action = "AddEmployee.do?method=updateEmployee";
			document.forms[0].submit();
		}
		
</script>
</head>	
<title></title>
<html:form action="/AddEmployee" > 
	<html:hidden property="employeeId"/>
  <table width="738" height="710" align="center"> 
    <tr> 
      <td width="117" height="17" bgcolor="#CCCCCC"><strong>Personal Details </strong></td> 
      <td height="17" colspan="2"></td> 
      <td width="109" height="17"></td> 
      <td height="17" colspan="2"></td> 
    </tr> 
    <tr> 
      <td height="34" align="right" >First Name :</td> 
      <td width="146"><html:text property="firstName" maxlength="25" /></td> 
      <td width="98">&nbsp;</td> 
      <td align="right">Middle name :</td> 
      <td width="144"><html:text property="middleName" maxlength="25" /></td> 
      <td width="96">&nbsp;</td> 
    </tr> 
    <tr> 
      <td align="right">Last name :</td> 
      <td height="36"><html:text property="lastName" maxlength="25" /></td> 
      <td height="36">&nbsp;</td> 
      <td align="right">Gender :</td> 
      <td height="36"><html:text property="gender" maxlength="25" /></td> 
      <td height="36">&nbsp;</td> 
    </tr> 
   
   <tr> 
      <td height="17" bgcolor="#CCCCCC"><strong>Present Address</strong></td> 
      <td height="17" colspan="2"></td> 
      <td height="17"></td> 
      <td height="17" colspan="2"></td> 
    </tr> 
    <tr> 
      <td align="right">Address line1 :</td> 
      <td height="39" colspan="2"><html:text property="presentAddressLine1" maxlength="25" /></td> 
      <td align="right">Address line2 :</td> 
      <td height="39" colspan="2"><html:text property="presentAddressLine2" maxlength="25" /></td> 
    </tr> 
    <tr> 
      <td align="right">City :</td> 
      <td height="39" colspan="2"><html:text property="presentCity" maxlength="25" /></td> 
      <td align="right">State :</td> 
      <td height="39" colspan="2"><html:text property="presentState" maxlength="25" /></td> 
    </tr> 
    <tr> 
 	  <td align="right">Zipcode :</td> 
      <td height="39" colspan="2"><html:text property="presentZipcode" maxlength="25" /></td> 
    </tr> 
    <tr> 
      <td height="17" bgcolor="#CCCCCC"><strong>Permanent Address</strong> </td> 
      <td height="17" colspan="2"></td> 
      <td height="17"></td> 
      <td height="17" colspan="2"></td> 
    </tr> 
    <tr> 
      <td align="right">Address line1 :</td> 
      <td height="39" colspan="2"><html:text property="permanentAddressLine1" maxlength="25" /></td> 
      <td align="right">Address line2 :</td> 
      <td height="39" colspan="2"><html:text property="permanentAddressLine2" maxlength="25" /></td> 
    </tr> 
    <tr> 
      <td align="right">City :</td> 
      <td height="39" colspan="2"><html:text property="permanentCity" maxlength="25" /></td> 
      <td align="right">State :</td> 
      <td height="39" colspan="2"><html:text property="permanentState" maxlength="25" /></td> 
    </tr> 
    <tr> 
      <td align="right">Zipcode :</td> 
      <td height="39" colspan="2"><html:text property="permanentZipcode" maxlength="25" /></td> 
    </tr> 
    <tr> 
      <td height="17" bgcolor="#CCCCCC"><strong>Contact Details</strong></td> 
      <td height="17" colspan="2"></td> 
      <td height="17"></td> 
      <td height="17" colspan="2"></td> 
    </tr> 
    <tr> 
      <td align="right">Office :</td> 
      <td height="39" colspan="2"><html:text property="officePhone" maxlength="25" /></td> 
      <td align="right">Home :</td> 
      <td height="39" colspan="2"><html:text property="homePhone" maxlength="25" /></td> 
    </tr> 
    <tr> 
      <td align="right">Mobile :</td> 
      <td height="39" colspan="2"><html:text property="mobilePhone" maxlength="25" /></td> 
    </tr> 
    <tr> 
      <td align="right">Email id  :</td> 
      <td height="39" colspan="2" ><html:text property="emailID" maxlength="25" /></td> 
      <td height="39"  align="right">&nbsp;</td> 
      <td height="39" colspan="2">&nbsp;</td> 
    </tr> 
    <tr> 
      <td align="right">&nbsp;</td> 
      <td height="39" colspan="2">&nbsp;</td> 
      <td height="39"></td> 
      <td height="39" colspan="2"></td> 
    </tr> 
    <tr> 
      <td height="24">&nbsp;</td> 
      <td height="24" colspan="2">&nbsp;</td> 
      <td height="24"><html:button property="method"  onclick="addEmployee()">Add</html:button></td> 
      <td height="24"><html:button property="method"  onclick="editEmployee()">Edit</html:button></td>
      <td height="24" colspan="2">&nbsp;</td> 
    </tr> 
  </table> 
</html:form> 
</html>