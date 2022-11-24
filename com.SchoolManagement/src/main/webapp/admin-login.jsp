<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

    <title>Admin Login</title>
</head>

<body style="background: linear-gradient(90deg, rgba(236,89,70,1) 0%, rgba(232,209,112,1) 100%);">
    <nav class="navbar navbar-light navbar-expand-lg bg-transparent">
        <div class="container-fluid">
            <a class="navbar-brand " href="#">School Management</a>


        </div>
    
    </nav>
    
        <section  class="d-flex justify-content-center">
            <h1>Welcome To Admin Login</h1>
        </section>

        <section class="d-flex justify-content-center " >
            
                    <div class="card text-center ">
                        <div class="card-body" style="box-shadow: rgba(0, 0, 0, 0.55) 0px 5px 15px;">
                            <h5 class="card-title ">Login As Admin</h5>
                            <img style="height:20rem ;" src="asset/admin.png" class="card-img-top pt-2 " alt="admin">
                            <br>
                            <form action="login" method="post">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">User Name</label>
                                    <input type="text" name="username" class="form-control" id="exampleInputEmail1"
                                        aria-describedby="emailHelp" placeholder="Enter Username">
                                </div><br>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input type="password" name="password" class="form-control"
                                        id="exampleInputPassword1" placeholder="Password">
                                </div>
                                <br>
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </form>
                        </div>
                    </div>
               
            </div>

        </section>
    


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>

</html>