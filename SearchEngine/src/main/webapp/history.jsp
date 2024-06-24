<%@page import = "java.util.ArrayList"%>
<%@page import = "com.Accio.HistoryResults"%>


<html>
<head>
<link rel = "stylesheet" type = "text/css" href = "style.css">
</head>
<body>
<h1>Simple Search Engine</h1>
<form action="Search">
    <input type = "text" name = "keyword"></input>
    <button type = "submit">Search</button>
</form>
<form action = "History">
    <button type = "submit">History</button>
</form>

    <table border = 2 class = "resultTable">
        <tr>
            <th>Keyword</th>
            <th>Link</th>
        </tr>
        <%
            ArrayList<HistoryResults> results = (ArrayList<HistoryResults>)request.getAttribute("results");
            for(HistoryResults result : results){
        %>
        <tr>
            <td><%out.println(result.getKeyword());%></td>
            <td><a href = "<%out.println(result.getLink());%>"><%out.println(result.getLink());%></a></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>