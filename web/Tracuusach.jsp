<%-- 
    Document   : Tracuusach
    Created on : Mar 24, 2022, 2:38:06 PM
    Author     : VAN TAI
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ThuVienSach</title>
        <meta charset="UTF-8">
        <link href="styles/user.css" rel="stylesheet" type="text/css"/>
       
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="styles/fontawesome-free-6.0.0-web/css/all.min.css">
        
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;600;700&family=Roboto:wght@300;400;500;700&display=swap" rel="stylesheet">
    </head>
    <body>
        
        <section class="header">
        <nav>
            <a href=""><i class="fa-solid fa-book"></i> Bookshop</a>
            <div class="nav-links">
                <ul>                                   
                   <li><a href="http://localhost:8080/1Webthuvien1/user.html">Thoát</a></li>                   
                </ul>
            </div>
        </nav> 
            <style>
            table ,th,td{
                border: 1px solid white;
                text-align: center;
            }
            form{
                text-align: center;             
            }
            table{
                width: 80%;
                color: white
            }
        </style>
        <form class="form" action="formtracuu" method="post">
            Name<input type="text" name="name">
            <input type="submit" value="Search">
        </form>
        <table class="table" boder="1">
            <thead>
                <tr>
                    <th>Mã sách</th>
                    <th>Tên sách</th>
                    <th>Tác giả</th>
                    <th>Nhà xuất bản</th>
                    <th>Năm xuất bản</th>
                    <th>Tình trạng</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listBook}" var="E">
                <tr>
                    <td>${E.Masach}</td>
                    <td>${E.Tensach}</td>
                    <td>${E.Tacgia}</td>
                    <td>${E.Nxb}</td> 
                    <td>${E.Namxb}</td>      
                    <td>${E.Tinhtrang}</td>      
                </tr>
                </c:forEach>
            </tbody>
        </table>
               
    </section>
        

    </body>
</html>
