<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Patient</title>
</head>
<body>
    <h2>Add Patient</h2>

    <form action="/addPatient" method="POST">
        <label for="patientName">Patient Name:</label>
        <input type="text" id="patientName" name="patientName" required><br><br>

        <label for="gender">Gender:</label>
        <select id="gender" name="gender" required>
            <option value="Male">Male</option>
            <option value="Female">Female</option>
            <option value="Other">Other</option>
        </select><br><br>

        <label for="dob">Date of Birth:</label>
        <input type="date" id="dob" name="dob" required><br><br>

        <label for="mobileNo">Mobile Number:</label>
        <input type="text" id="mobileNo" name="mobileNo" required><br><br>

        <label for="address">Address:</label>
        <textarea id="address" name="address" rows="4" cols="50" required></textarea><br><br>

        <label for="insurance">Insurance:</label>
        <input type="text" id="insurance" name="insurance" required><br><br>

        <label for="disease">Disease:</label>
        <input type="text" id="disease" name="disease" required><br><br>

        <label for="depAdmin">Dependent Admin:</label>
        <input type="text" id="depAdmin" name="depAdmin" required><br><br>

        <input type="submit" value="Submit">
    </form>

</body>
</html>
