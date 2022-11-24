# School Management System

School Management System is a simple CRUD operation program where Admin can 
Add Student , Update Student and Delete student


## Setting Up Project
 **Step 1**
 
 First clone this repositery to local or download zip of this 
 repositery

 - This is web-app created using servlet jsp and mySql as database

- for runing this web-app we need IDE for that we are using eclipse

- it also requires server so we are using tomcat version 9 

 **Step 2**


 
 

Download Eclipse IDE from below link

   https://www.eclipse.org/downloads

After Downloading the eclipse Start installation by locating installer in your download folder
     
installer choose Eclipse IDE for Enterprise Java and Web Developers

![Screenshot from 2022-11-24 18-52-52](https://user-images.githubusercontent.com/114403369/203810821-30901da3-034a-4155-9f12-98077fc85fe4.png)





after installing eclipse 

- go to files there is option open project from file on clicking that

- choose com.schoolmanagment folder from repositery download it will 
open the project in eclipse


 
[adding-project.webm](https://user-images.githubusercontent.com/114403369/203860124-f76d2838-cdee-4992-b212-cea754e01cef.webm)



**Step 3**

Apache Tomcat v9 from below link

   https://tomcat.apache.org/download-90.cgi

after that select as per your operating system if using windows 11 64 bit choose 64-bit Windows zip

  ![Screenshot from 2022-11-24 19-11-02](https://user-images.githubusercontent.com/114403369/203806301-467855b9-38a6-498a-bb83-90689d9e1ba0.png)


- now in opening eclipse there you can add tomcat server in server tab 

- in server tab there is option for adding tomcat server click on that it will open New server window

- Choose apache in apache choose apache 9 then press next click on add 

- after in the window select tomacat installation directory

- choose the folder from repositery named as apache-tomcat-9 or you can download from above link


[tomcatsetup.webm](https://user-images.githubusercontent.com/114403369/203860203-42ef3b5e-3b55-4674-b090-26d9a3f55f21.webm)


 **Step 4**

Now download MySql Installer from below link 
    
   https://dev.mysql.com/downloads/installer/
    
after downloading start installation and choose server and workbench from option

note:- **please enter username and password as 'root'
and host as localhost**

if your changing the username and password changes should be made in DAO package

after installing mysql work bench and server


- create one schema name as 'school'

- after creating scemaa set that schema as default

- after that go to server option and click on import data

- in that select school folder from repositery by doing this it will import admin and student table in database

- here you have successfully done my sql setup


[mysqlsetup.webm](https://user-images.githubusercontent.com/114403369/203860255-2408a41c-52d7-44a9-bf6a-9fcae8f70e58.webm)


 **Step 5**

- After completing all the steps please go open the eclispse

- There navigate to com.SchoolManagement/src/main/webapp/admin-login.jsp

- after that right click on **admin-login.jsp** and in run as there is a run on server option

- then app will open on default browser

[runningwebapp.webm](https://user-images.githubusercontent.com/114403369/203860273-7c32d317-a7fb-4ad9-8edb-40314e9dcd80.webm)


## Disclaimer

This project is still in devlopment there are some bugs

  **Known bugs**

  1. you cant enter 10 digit phone no in phone no section enter 4 digit for now 




