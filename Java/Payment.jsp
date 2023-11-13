<%@ page import="java.io.IOException" %>
<%@ page import="java.net.URI" %>
<%@ page import="java.net.URISyntaxException" %>
<%@ page import="java.net.http.HttpClient" %>
<%@ page import="java.net.http.HttpRequest" %>
<%@ page import="java.net.http.HttpResponse" %>
<%@ page import="java.nio.charset.StandardCharsets" %>
<%@ page import="java.util.Base64" %>

<html>
<head>
    <title>Payment Form</title>
</head>
<body>
<form method="post" action="Payment.jsp">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br><br>
    <label for="amount">Amount:</label>
    <input type="text" id="amount" name="amount"><br><br>
    <label for="password">Password:</label>
    <input type="text" id="password" name="password"><br><br>
    <input type="submit" value="Submit">
</form>

<%
    if (request.getMethod().equals("POST")) {
        String url = "http://192.168.1.73:8081";
        String username = "ronald";
        String password = "ronald";
        String requestBody = "name=" + request.getParameter("name") + "&amount=" + request.getParameter("amount") + "&password=" + request.getParameter("password");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder()
                .uri(new URI(url))
                .header("Authorization", "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes(StandardCharsets.UTF_8)))
                .header("Content-Type", "application/x-www-form-urlencoded")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpResponse<String> res = client.send(request, HttpResponse.BodyHandlers.ofString());
        out.println(res.body());
    }
%>
</body>
</html>
