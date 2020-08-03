<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Admin DataTable</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<style>
body {
	color: #566787;
	background: #f5f5f5;
	font-family: 'Varela Round', sans-serif;
	font-size: 13px;
}
.table-responsive {
    margin: 20px 0;
}
.table-wrapper {
	background: #fff;
	padding: 20px 25px;
	border-radius: 3px;
	min-width: 1000px;
	box-shadow: 0 1px 1px rgba(0,0,0,.05);
}
.table-title {        
	padding-bottom: 15px;
	background: #435d7d;
	color: #fff;
	padding: 16px 30px;
	min-width: 100%;
	margin: -20px -25px 10px;
	border-radius: 3px 3px 0 0;
}
.table-title h2 {
	margin: 5px 0 0;
	font-size: 24px;
}
.table-title .btn-group {
	float: right;
}
.table-title .btn {
	color: #fff;
	float: right;
	font-size: 13px;
	border: none;
	min-width: 50px;
	border-radius: 2px;
	border: none;
	outline: none !important;
	margin-left: 10px;
}
.table-title .btn i {
	float: left;
	font-size: 21px;
	margin-right: 5px;
}
.table-title .btn span {
	float: left;
	margin-top: 2px;
}
table.table tr th, table.table tr td {
	border-color: #e9e9e9;
	padding: 12px 15px;
	vertical-align: middle;
}
table.table tr th:first-child {
	width: 60px;
}
table.table tr th:last-child {
	width: 100px;
}
table.table-striped tbody tr:nth-of-type(odd) {
	background-color: #fcfcfc;
}
table.table-striped.table-hover tbody tr:hover {
	background: #f5f5f5;
}
table.table th i {
	font-size: 13px;
	margin: 0 5px;
	cursor: pointer;
}	
table.table td:last-child i {
	opacity: 0.9;
	font-size: 22px;
	margin: 0 5px;
}
table.table td a {
	font-weight: bold;
	color: #566787;
	display: inline-block;
	text-decoration: none;
	outline: none !important;
}
table.table td a:hover {
	color: #2196F3;
}
table.table td a.edit {
	color: #FFC107;
}
table.table td a.delete {
	color: #F44336;
}
table.table td i {
	font-size: 19px;
}
table.table .avatar {
	border-radius: 50%;
	vertical-align: middle;
	margin-right: 10px;
}
.pagination {
	float: right;
	margin: 0 0 5px;
}
.pagination li a {
	border: none;
	font-size: 13px;
	min-width: 30px;
	min-height: 30px;
	color: #999;
	margin: 0 2px;
	line-height: 30px;
	border-radius: 2px !important;
	text-align: center;
	padding: 0 6px;
}
.pagination li a:hover {
	color: #666;
}	
.pagination li.active a, .pagination li.active a.page-link {
	background: #03A9F4;
}
.pagination li.active a:hover {        
	background: #0397d6;
}
.pagination li.disabled i {
	color: #ccc;
}
.pagination li i {
	font-size: 16px;
	padding-top: 6px
}
.hint-text {
	float: left;
	margin-top: 10px;
	font-size: 13px;
}    
/* Custom checkbox */
.custom-checkbox {
	position: relative;
}
.custom-checkbox input[type="checkbox"] {    
	opacity: 0;
	position: absolute;
	margin: 5px 0 0 3px;
	z-index: 9;
}
.custom-checkbox label:before{
	width: 18px;
	height: 18px;
}
.custom-checkbox label:before {
	content: '';
	margin-right: 10px;
	display: inline-block;
	vertical-align: text-top;
	background: white;
	border: 1px solid #bbb;
	border-radius: 2px;
	box-sizing: border-box;
	z-index: 2;
}
.custom-checkbox input[type="checkbox"]:checked + label:after {
	content: '';
	position: absolute;
	left: 6px;
	top: 3px;
	width: 6px;
	height: 11px;
	border: solid #000;
	border-width: 0 3px 3px 0;
	transform: inherit;
	z-index: 3;
	transform: rotateZ(45deg);
}
.custom-checkbox input[type="checkbox"]:checked + label:before {
	border-color: #03A9F4;
	background: #03A9F4;
}
.custom-checkbox input[type="checkbox"]:checked + label:after {
	border-color: #fff;
}
.custom-checkbox input[type="checkbox"]:disabled + label:before {
	color: #b8b8b8;
	cursor: auto;
	box-shadow: none;
	background: #ddd;
}
/* Modal styles */
.modal .modal-dialog {
	max-width: 400px;
}
.modal .modal-header, .modal .modal-body, .modal .modal-footer {
	padding: 20px 30px;
}
.modal .modal-content {
	border-radius: 3px;
	font-size: 14px;
}
.modal .modal-footer {
	background: #ecf0f1;
	border-radius: 0 0 3px 3px;
}
.modal .modal-title {
	display: inline-block;
}
.modal .form-control {
	border-radius: 2px;
	box-shadow: none;
	border-color: #dddddd;
}
.modal textarea.form-control {
	resize: vertical;
}
.modal .btn {
	border-radius: 2px;
	min-width: 100px;
}	
.modal form label {
	font-weight: normal;
}	
body{
background-color:#BEB0B0;
border-radius: 15px;
}
.table-title{
background-color:#1CD1D4;
}
.table 
{
background-color:#D9EEEE;
border-radius: 35px;
}

input, textarea, select, option {
 background-color:#FFF3F3;
 }
input, textarea, select {
 padding:3px;
 border:1px solid #F5C5C5;
 border-radius:5px;
 width:150px;
 box-shadow:1px 1px 2px #C0C0C0 inset;
 }
submit
 {color:#BEB0B0;
 }
 .table-responsive
 {border-radius: 35px;
 }
 i
 {border-radius: 35px;
 }
 .table-wrapper
 {width:1200px;
 }
 .container-fluid
 {border-radius: 35px;
 }

</style>
<script>
$(document).ready(function(){
	// Activate tooltip
	$('[data-toggle="tooltip"]').tooltip();
	
	// Select/Deselect checkboxes
	var checkbox = $('table tbody input[type="checkbox"]');
	$("#selectAll").click(function(){
		if(this.checked){
			checkbox.each(function(){
				this.checked = true;                        
			});
		} else{
			checkbox.each(function(){
				this.checked = false;                        
			});
		} 
	});
	checkbox.click(function(){
		if(!this.checked){
			$("#selectAll").prop("checked", false);
		}
	});
});
</script>
</head>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<body>
<center>
<div class="container-fluid">
	<div class="table-responsive">
		<div class="table-wrapper">
			<div class="table-title">
				<div class="row">
					<div class="col-sm-8">
						<h2>Manage Students &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;The Admin is : ${adminName}&emsp;</h2>
						<c:set var = "adminName" scope = "session" value = "${adminName}"/>
						<input type="hidden" name="adminName1" value="${adminName}" >
					</div>
					<div class="col-sm-4">
						<a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New student</span></a>
						<a href="#deleteEmployeeModalAll" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a>						
					</div>
				</div>
			</div>
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>
							<span class="custom-checkbox">
								<input type="checkbox" id="selectAll">
								<label for="selectAll"></label>
							</span>
						</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>CIN</th>
						<th>NumInscription</th>
						<th>Class</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
				<tr>
					
					
						<td>
							
						</td>
						<center><td><form action="adminServletSearchFName" method="post" > <input type="search" name="fnameS" Placeholder="Search..." > </form></td>
						<td><form action="adminServletSearchLName" method="post" > <input type="search" name="lnameS" Placeholder="Search..." > </form></td>
						<td><form action="adminServletSearch" method="post" > <input type="search" name="CINS" Placeholder="Search..." > </form></td>
						<td><form action="adminServletSearchInscID" method="post" > <input type="search" name="inscS" Placeholder="Search..." > </form></td>
						<td><form action="adminServletSearchClassII" method="post" > <input type="search"   name="ClassII" Placeholder="Search..." > </form></td>
						
						<td><form action="adminServletSearchAllStudents" method="post" > <input type="Submit" value="Show All Students"  name="inscS" Placeholder="Search..." > </form></td>
						
						</center>
					</tr>
				 <c:if test = "${l.size() >0}">
				 <c:set var = "numPage" scope = "session" value = "${numPage}"/>
        <c:choose>
				 <c:when test = "${numPage + 5 <= l.size()}">
    
				<c:forEach var = "i" begin = "${numPage}" end = "${numPage + 4}">
					<tr>
					
					
						<td>
							<span class="custom-checkbox">
								<input type="checkbox" id="checkbox1" name="options[]" value="1">
								<label for="checkbox1"></label>
							</span>
						</td>
						<td><c:out value = "${l.get(i).getFName()}"/></td>
						<td><c:out value = "${l.get(i).getLName()}"/></td>
						<td><c:out value = "${l.get(i).getCIN()}"/></td>
						<td><c:out value = "${l.get(i).getInscID()}"/></td>
						<td><c:out value = "${l.get(i).getClassII()}"/></td>
						<td>
							<a href="#editEmployeeModal${i}" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
							<a href="#deleteEmployeeModal${i}" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
						</td>
					</tr>
					</c:forEach>
					<tr>
					</c:when>
					<c:otherwise>
					
					<c:forEach var = "i" begin = "${numPage}" end = "${l.size()-1}">
					<tr>
					
					
						<td>
							<span class="custom-checkbox">
								<input type="checkbox" id="checkbox1" name="options[]" value="1">
								<label for="checkbox1"></label>
							</span>
						</td>
						<td><c:out value = "${l.get(i).getFName()}"/></td>
						<td><c:out value = "${l.get(i).getLName()}"/></td>
						<td><c:out value = "${l.get(i).getCIN()}"/></td>
						<td><c:out value = "${l.get(i).getInscID()}"/></td>
						<td><c:out value = "${l.get(i).getClassII()}"/></td>
						<td>
							<a href="#editEmployeeModal${i}" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
							<a href="#deleteEmployeeModal${i}" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
						</td>
					</tr>
					</c:forEach>
					<tr>
					</c:otherwise>
					</c:choose>
				  </c:if>		 
				</tbody>
			</table>
			<div class="clearfix">
				<div class="hint-text">Showing <b><c:out value="5" /></b> out of <b><c:out value="${l.size()}" /></b> entries</div>
				
				
				<ul class="pagination">
					<li class="page-item disabled"><form action="adminServletControlPageP" method="post" ><input type="hidden" name="numPage" value="${numPage}" ><input type="submit" value="Previous" ></form></li>
					<li class="page-item"><a href="#" class="page-link"><c:out value="${numPage}" /></a></li>
					
					<li class="page-item"><form action="adminServletControlPageN" method="post" ><input type="hidden" name="numPage" value="${numPage}" ><c:set var = "numPage" scope = "session" value="${numPage}" /><input type="submit" value="Next" ></form></li>
				</ul>
			</div>
		</div>
	</div>        
</div>
<!-- Edit Modal HTML -->
<div id="addEmployeeModal" class="modal fade">
	<div class="modal-dialog">
		<div class="modal-content">
			<form action="adminServletAdd" method="post">
				<div class="modal-header">						
					<h4 class="modal-title">Add Student</h4>
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">					
					<div class="form-group">
						<label>First Name :</label>
						<input type="text" class="form-control" name="FName" required>
					</div>
					<div class="form-group">
						<label>Last Name :</label>
						<input type="text" class="form-control" name="LName" required>
					</div>
					<div class="form-group">
						<label>CIN : </label>
						<input type="text" class="form-control" name="CIN" required>
					</div>
					<div class="form-group">
						<label>Inscription number :</label>
						<input type="text" class="form-control" name="InscID" required>
					</div>		
					<div class="form-group">
						<label>Class :</label>
						<input type="text" class="form-control" name="ClassII" required>
					</div>				
				</div>
				<div class="modal-footer">
					
					<input type="submit" class="btn btn-success" value="Add">
				</div>
			</form>
		</div>
	</div>
</div>
<!-- Edit Modal HTML -->
<c:forEach var="j" begin="0" end="${l.size()-1}">
<div id="editEmployeeModal${j}" class="modal fade">
	<div class="modal-dialog">
		<div class="modal-content">
			<form action="adminServletUpdate" method="post">
				<div class="modal-header">						
					<h4 class="modal-title">Edit Student</h4>
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">					
					<div class="form-group">
						<label>First Name :</label>
						<input type="text" class="form-control" value="${l.get(j).getFName()}" name="fnameU" required>
						<input type="hidden" name="idU" value="${l.get(j).getID()}" >
					</div>
					<div class="form-group">
						<label>Last Name :</label>
						<input type="text" class="form-control" value="${l.get(j).getLName()}" name="lnameU" required>
					</div>
					<div class="form-group">
						<label>CIN :</label>
						<input type="text" class="form-control" value="${l.get(j).getCIN()}" name="cinU" required>
					</div>
					<div class="form-group">
						<label>Inscription Number :</label>
						<input type="text" class="form-control" value="${l.get(j).getInscID()}" name="inscU" required>
					</div>
					<div class="form-group">
						<label>Class :</label>
						<input type="text" class="form-control" value="${l.get(j).getClassII()}" name="ClassII" required>
					</div>
										
				</div>
				<div class="modal-footer">
				
					<input type="submit" class="btn btn-info" value="Save">
				</div>
			</form>
		</div>
	</div>
</div>
</c:forEach>
<c:forEach var="k" begin="0" end="${l.size()-1}">

<!-- Delete Modal HTML -->
<div id="deleteEmployeeModal${k}" class="modal fade">
	<div class="modal-dialog">
		<div class="modal-content">
			<form action="adminServletRemove" method="post">
				<div class="modal-header">						
					<h4 class="modal-title">Delete Student</h4>
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<input type="hidden" name="idR" value="${l.get(k).getID()}" >
				</div>
				<div class="modal-body">					
					<p>Are you sure you want to delete this student ?</p>
					<p class="text-warning"><small>This action cannot be undone.</small></p>
				</div>
				<div class="modal-footer">
					<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
					<input type="submit" class="btn btn-danger" value="Delete">
				</div>
			</form>
		</div>
	</div>
</div>
</c:forEach>
<div id="deleteEmployeeModalAll" class="modal fade">
	<div class="modal-dialog">
		<div class="modal-content">
			<form action="adminServletRemoveAll" method="post">
				<div class="modal-header">						
					<h4 class="modal-title">Delete Student</h4>
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<input type="hidden" name="idR" value="${l.get(k).getID()}" >
				</div>
				<div class="modal-body">					
					<p>Are you sure you want to delete the selected student(s) ?</p>
					<p class="text-warning"><small>This action cannot be undone.</small></p>
				</div>
				<div class="modal-footer">
					<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
					<input type="submit" class="btn btn-danger" value="Delete">
				</div>
			</form>
		</div>
	</div>
</div>
</center>
</body>
</html>