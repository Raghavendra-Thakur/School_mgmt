<%@page import="com.SchoolManagement.DTO.Admin"%>
<%@page import="com.SchoolManagement.Serveice.AdminService"%>
<%@page import="com.SchoolManagement.DTO.student"%>
<%@page import="com.SchoolManagement.DAO.AdminDao" %>
<%@page import="java.util.List" %>
<%@page import="com.SchoolManagement.Servlet.StudentDisplayServlet" %>
<%@page import="com.SchoolManagement.Servlet.AdminServlet" %>

<%
	response.setHeader("Cache-Control", "no-cache , no-store");
	Admin admin = (Admin) session.getAttribute("AdminName");
	if(admin == null){
		response.sendRedirect("admin-login.jsp");
		}
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

</head>

<body style="background: linear-gradient(90deg, rgba(236,89,70,1) 0%, rgba(232,209,112,1) 100%);">

    <nav class="navbar navbar-light navbar-expand-lg bg-transparent">
        <div class="container-fluid">
            <a class="navbar-brand " href="#">School Management</a>


        </div>
        </div>
    </nav>


    <div class="container-fluid">
        <div class="row flex-nowrap">
            <div class="col-auto col-md-3 col-xl-2 px-sm-2 px-0 bg-transparent">
                <div class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2 text-white min-vh-100">
                    <a href="/"
                        class="d-flex align-items-center pb-3 mb-md-0 me-md-auto text-white text-decoration-none">
                        <span class="fs-5 d-none d-sm-inline">Menu</span>
                    </a>
                    <ul class="nav nav-pills flex-column mb-sm-auto mb-0 align-items-center align-items-sm-start"
                        id="menu">
                        <li class="nav-item">
                            <button class="btn btn-primary " id="btn" onclick="displayf1()"><a href="#"
                                    class="nav-link align-middle px-0" style="color: black;">
                                    Insert Student
                                </a></button>
                        </li>
                        <li class="nav-item mt-2">
                            <button class="btn btn-primary " id="btn" onclick="displayf2()"><a href="#"
                                    class="nav-link align-middle px-0" style="color: black;">
                                    Update Student
                                </a></button>
                        </li>
                        <li class="nav-item mt-2">
                            <button class="btn btn-primary " id="btn" onclick="displayf3()"><a href="#"
                                    class="nav-link align-middle px-0" style="color: black;">
                                    Delete Student
                                </a></button>
                        </li>
                </div>
            </div>
            <div class="col py-3">
                <br>
                <section id="insertforn" style="max-width: 30rem; display: block;">
                    <h1>STUDENT INSERT FORM</h1>
                    <form action="insert" method="post">
                        <div class="form-group">
                            <label for="exampleInputEmail1">Roll No</label>
                            <input type="text" class="form-control" placeholder="Enter Roll NO." name="rno">

                        </div>
                        <br>
                        <div class="form-group">
                            <label>Student Name</label>
                            <input type="text" class="form-control" placeholder="Name" name="name">
                        </div>
                        <br>
                        <div class="form-group">
                            <label>Student Phone No</label>
                            <input type="text" class="form-control" placeholder="Phone No" name="pno">
                        </div>
                        <br>
                        <div class="form-group">
                            <label for="exampleInputEmail1">Email address</label>
                            <input type="email" class="form-control" id="exampleInputEmail1"
                                aria-describedby="emailHelp" placeholder="Enter email" name="email">
                        </div>
                        <br>

                        <div class="form-group">
                            <label for="exampleInputEmail1">Date Of Birth</label>
                            <input type="date" class="form-control" name="dob">
                        </div>
                        <br>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" id="customRadioInline1" name="gender" class="custom-control-input mr-5"
                                value="male">
                            <label class="custom-control-label" for="customRadioInline1">Male</label>
                            <input type="radio" id="customRadioInline2" name="gender" class="custom-control-input ms-5"
                                value="female">
                            <label class="custom-control-label" for="customRadioInline2">Female</label>
                        </div>
                        <br>
                        <div class="form-group">
                            <label>Address</label>
                            <input type="text" class="form-control" placeholder="Address" name="ads">
                        </div>
                        <br>

                        <button type="submit" class="btn btn-primary">Submit</button>
                    </form>
                </section>
                <section id="updateform" style="max-width: 30rem; display: none;">
                    <h1>STUDENT UPDATE FORM</h1>
                    <form action="update" method="post">
                        <div class="form-group">
                            <label for="exampleInputEmail1">Roll No Of Student To be Updated</label>
                            <input type="text" class="form-control" placeholder="Enter Roll NO." name="rno">

                        </div>
                        <br>
                        <div class="form-group">
                            <label>Student Name</label>
                            <input type="text" class="form-control" placeholder="Name" name="name">
                        </div>
                        <br>
                        <div class="form-group">
                            <label>Student Phone No</label>
                            <input type="text" class="form-control" placeholder="Phone No" name="pno">
                        </div>
                        <br>
                        <div class="form-group">
                            <label for="exampleInputEmail1">Email address</label>
                            <input type="email" class="form-control" id="exampleInputEmail1"
                                aria-describedby="emailHelp" placeholder="Enter email" name="email">
                        </div>
                        <br>

                        <div class="form-group">
                            <label for="exampleInputEmail1">Date Of Birth</label>
                            <input type="date" class="form-control" name="dob">
                        </div>
                        <br>
                        <div class="custom-control custom-radio custom-control-inline">
                            <input type="radio" id="customRadioInline1" name="gender" class="custom-control-input mr-5"
                                value="male">
                            <label class="custom-control-label" for="customRadioInline1">Male</label>
                            <input type="radio" id="customRadioInline2" name="gender" class="custom-control-input ms-5"
                                value="female">
                            <label class="custom-control-label" for="customRadioInline2">Female</label>
                        </div>
                        <br>
                        <div class="form-group">
                            <label>Address</label>
                            <input type="text" class="form-control" placeholder="Address" name="ads">
                        </div>
                        <br>

                        <button type="submit" class="btn btn-primary">Submit</button>
                    </form>
                </section>

                <section id="deleteform" style="max-width: 30rem; display: none;">
                    <h1>STUDENT DELETE </h1>
                    <form action="delete" method="post">
                        <div class="form-group">
                            <label for="exampleInputEmail1">Roll No Of Student To be Deleted</label>
                            <input type="text" class="form-control" placeholder="Enter Roll NO." name="rno1"><br>
                            <button type="submit" class="btn btn-primary">Submit</button>

                        </div>
                    </form>
                </section>
            </div>
            <% 
		AdminService adser = new AdminService();
		student student = new student();
		List<student> students =  adser.displayStudent();
	
	%>
            <div class="col py-3">
                <section >
                    <h1 class="mt-3">Student Data</h1>

                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th>Roll No.</th>
                                <th>Name</th>
                                <th>Phone No.</th>
                                <th>Email ID</th>
                                <th>Date of Birth</th>
                                <th>Gender</th>
                                <th>Address</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%for (student stud : students ) {%>
                                <tr>
                                    <th>
                                        <%=stud.getRno()%>
                                    </th>
                                    <th>
                                        <%=stud.getName()%>
                                    </th>
                                    <th>
                                        <%=stud.getPno()%>
                                    </th>
                                    <th>
                                        <%=stud.getEmail()%>
                                    </th>
                                    <th>
                                        <%=stud.getDob()%>
                                    </th>
                                    <th>
                                        <%=stud.getGender()%>
                                    </th>
                                    <th>
                                        <%=stud.getAddress()%>
                                    </th>

                                <tr>
                                    <%}%>
                        </tbody>
                    </table>
                </section>
            </div>
        </div>
    </div>



    <script>
        function displayf1() {
            var x = document.getElementById("insertforn");
            x.style.display = "block";

            var y = document.getElementById("updateform");
            y.style.display = "none";
            var z = document.getElementById("deleteform");
            z.style.display = "none";
        }

        function displayf2() {
            var x = document.getElementById("updateform");
            x.style.display = "block";

            var y = document.getElementById("insertforn");
            y.style.display = "none";
            var z = document.getElementById("deleteform");
            z.style.display = "none";
        }
        function displayf3() {
            var x = document.getElementById("deleteform");
            x.style.display = "block";

            var y = document.getElementById("insertforn");
            y.style.display = "none";
            var z = document.getElementById("updateform");
            z.style.display = "none";
        }
    </script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>





</body>

</html>













