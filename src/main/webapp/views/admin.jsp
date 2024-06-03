<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="../views/css/style.css">
</head>
<body>
    <div class="container-fluid h-100">
        <div class="row h-100">
            <jsp:include page="../views/admin/header.jsp"></jsp:include>
            <div class="col-10">
                <div><jsp:include page="../views/admin/nav.jsp"></jsp:include></div>
                <div> 
                    <c:import url="${showPage}" />
                </div>
            </div>
        </div>
        <!-- footer -->
        <div class="row">
            <jsp:include page="../views/admin/footer.jsp"></jsp:include>
        </div>
        <script src="../views/js/admin.js"></script>
        <script src="https://kit.fontawesome.com/03099bb746.js" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    </div>
</body>
</html>
