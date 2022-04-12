<%-- 
    Document   : Thongtinsach
    Created on : Mar 8, 2022, 10:57:47 PM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles/thongtinsach.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <section class="header">
            <div class="block"> 
                <div>
                <h1>Thông tin sách</h1>
                <label>Mã sách: </label>
                <span>${book.iD}</span><br>
                <label>Tên sách: </label>
                <span>${book.tenSach}</span><br>
                <label>Tác giả: </label>
                <span>${book.tacGia}</span><br>
                <label>Thể loại: </label>
                <span>${book.theLoai}</span><br>
                <label>Nhà xuất bản: </label>
                <span>${book.nhaXB}</span><br>
                <label>Năm xuất bản: </label>
                <span>${book.namXB}</span><br>
                <label>Số lượng sách còn lại: </label> 
                <span>${book.soLuongCon}</span><br>
                <label>Tóm tắt sách: </label>   
                <span>${book.sum}</span><br>
                </div>
                <div>
                    <h1>Phiếu mượn sách</h1>
                <select name="time" class="tl"> 
                    <option value="">Số ngày</option>
                    <option value="Sach Giao Khoa">3</option>
                    <option value="Giao trinh dai hoc">5</option>
                    <option value="Trinh Tham">7</option>
                    <option value="Haha">9</option>
                </select><br>
                <select name="cachthuc" class="tl"> 
                    <option value="">Cách thức mượn</option>
                    <option value="Online">Online</option>
                    <option value="Offline">Offline</option>
                </select>
                </div>    
            </div>
            <div>
                
            </div>
        </section>
    </body>
</html>
