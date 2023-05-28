<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient-JSP</title>
</head>
<body>
<h2>Hey Sanu!</h2>

<!-- Add Patient Button -->
<form action="/addPatient">
    <input type="submit" value="Add Patient">
</form>

<!-- Delete Patient Button -->
<form action="/deletePatient">
    <input type="submit" value="Delete Patient">
</form>

<!-- Update Patient Button -->
<form action="/updatePatient">
    <input type="submit" value="Update Patient">
</form>

<!-- View Patient Button -->
<form action="/patients">
    <input type="submit" value="View Patients">
</form>

<h2>List of Patients:</h2>
<table>
    <thead>
        <tr>
            <th>patientId</th>
            <th>patientName</th>
            <th>gender</th>
            <th>dob</th>
            <th>mobileNo</th>
            <th>address</th>
            <th>insurance</th>
            <th>disease</th>
            <th>depAdmin</th>
            <!-- Add more columns as per your patient model -->
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${patients}" var="patient">
            <tr>
                <td>${patient.patientId}</td>
                <td>${patient.patientName}</td>
                <td>${patient.gender}</td>
                <td>${patient.dob}</td>
                <td>${patient.mobileNo}</td>
                <td>${patient.address}</td>
                <td>${patient.insurance}</td>
                <td>${patient.disease}</td>
                <td>${patient.depAdmin}</td>
                <!-- Add more columns as per your patient model -->
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
