<%--
  Created by IntelliJ IDEA.
  User: conifer
  Date: 19/10/2018
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Loans Banking Summaray</title>
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
      <style>
          form{
              width: 30%;
              margin: auto;
          }
      </style>
  </head>
  <body>
  <form method="get" action="/sum">
      <caption>Loans Summaray</caption>
      <label>Loans</label>
      <input name="loans" type="number" size="30" />
      <label>Rate</label>
      <input name="rate" type="text" size="6" />
      <label>Months</label>
      <input name="months" type="number" size="3" />
      <button type="submit">Summaray</button>
  </form>
  </body>
</html>
