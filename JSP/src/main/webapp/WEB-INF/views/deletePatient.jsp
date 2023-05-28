<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Patient</title>
</head>
<body>
    <h2>Delete Patient</h2>

    <form action="/deletePatient/{patientId}" method="DELETE">
        <!-- Form fields for deleting a patient -->
        <!-- Example: -->
        <label for="patientId">Patient ID:</label>
        <input type="text" id="patientId" name="patientId" required><br><br>

        <input type="submit" value="Submit">
    </form>

</body>
</html>
