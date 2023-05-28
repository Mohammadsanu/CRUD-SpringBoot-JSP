<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Patient</title>
</head>
<body>
    <h2>Update Patient</h2>

    <form id="updateForm" method="POST">
        <!-- Form fields for updating a patient -->
        <!-- Example: -->
        <label for="patientName">Patient Name:</label>
        <input type="text" id="patientName" name="patientName" value="${patient.patientName}" required><br><br>

        <input type="hidden" name="patientId" value="${patientId}">
        <input type="hidden" name="_method" value="PUT">
        <input type="submit" value="Submit">
    </form>

    <script>
        document.getElementById("updateForm").addEventListener("submit", function(event) {
            event.preventDefault(); // Prevent the default form submission

            var formData = new FormData(event.target);

            var xhr = new XMLHttpRequest();
            xhr.open("POST", "/updatePatient", true);
            xhr.setRequestHeader("X-Requested-With", "XMLHttpRequest");
            xhr.onreadystatechange = function() {
                if (xhr.readyState === 4) {
                    if (xhr.status === 200) {
                        window.location.href = "/patients";
                    } else {
                        // Handle error case
                        console.log("Error: " + xhr.status);
                    }
                }
            };
            xhr.send(formData);
        });
    </script>
</body>
</html>
