<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="en">
  
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content=
        "width=device-width, initial-scale=3.0">
    <title>Livraria Pipoca</title>
    <style>
        * {
            padding: 0;
            margin: 0;
            font-family: sans-serif;
        }
  
        body {
            background: #84ceff;
        }
  
        .container {
            text-align: center;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            width: 100%;
        }
  
        .container span {
            display: block;
        }
  
        .text1 {
            color: white;
            font-size: 70px;
            font-weight: 700;
            letter-spacing: 8px;
            margin-bottom: 0px;
            background: #84ceff;
            position: relative;
            animation: text 6s 1;
        }
  
        .text2 {
            font-size: 40px;
            color: #c64888;
          
        }
  
        @keyframes text {
            0% {
                color: black;
                margin-bottom: -80px;
            }
  
            30% {
                letter-spacing: 25px;
                margin-bottom: -80px;
            }
  
            85% {
                letter-spacing: 8px;
                margin-bottom: -80px;
            }
        }
    </style>
</head>
  
<body>

<center>
<img src="pipocagif.gif" class="img-fluid" width= "50%" height="50%" align ="middle"  margin = "end">
</center>
    <div class="container">
        <div class="row">
        <pre>

















</pre>
            <span class="text1"> Livraria</span>
            <span class="text2">Pipoca</span>
        </div>
    </div>
</body>
  <meta http-equiv="refresh" content="7;url=http://localhost:8080/ProjetoAlura01/formulario" />
</html>