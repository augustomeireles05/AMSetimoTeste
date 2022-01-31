<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Projeto Final</title>

<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<!-- Begin Header -->
    <nav class="navbar navbar-dark bg-success" aria-label="First navbar example">
        <div class="container-fluid">
        	<div class="col-4 col-md-4 col-xl-4">
        	<a class="navbar-brand" href="./index.jsp">Raia Drogasil</a>
            <a class="navbar-brand" href="./formulario.jsp">Usuário</a>
        	</div>
            
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample01"
                aria-controls="navbarsExample01" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarsExample01">
                <ul class="navbar-nav me-auto mb-2">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled">Disabled</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="dropdown01" data-bs-toggle="dropdown"
                            aria-expanded="false">Dropdown</a>
                        <ul class="dropdown-menu" aria-labelledby="dropdown01">
                            <li><a class="dropdown-item" href="#">Action</a></li>
                            <li><a class="dropdown-item" href="#">Another action</a></li>
                            <li><a class="dropdown-item" href="#">Something else here</a></li>
                        </ul>
                    </li>
                </ul>
                <form>
                    <input class="form-control" type="text" placeholder="Search" aria-label="Search">
                </form>
            </div>
        </div>
    </nav>
    <!-- End Header -->

    <!-- Begin Table -->
    <div class="col-10 col-md-10 col-lg-10 container mt-3">
        <h3 class="card-title text-center">Lista de usuários</h3>
        <hr>
        <table class="table caption-top">
            <div class="d-grid gap-2 d-md-block p-2">
                <a href="./formulario.jsp">
                    <button class="btn btn-primary mb-3" type="button">Adicionar Usuário</button>
                </a>
            </div>
            <thead>
            <tbody>
                <tr>
                    
                </tr>
            </tbody>

            <tr>
                <th scope="col">ID</th>
                <th scope="col">NOME</th>
                <th scope="col">EMAIL</th>
                <th scope="col">PAÍS</th>
                <th scope="col">AÇÕES</th>
            </tr>
            </thead>
            
            <tbody method="form" action="ServletProjetoFinal">
            
                <tr>
                    <th value="id">1</th>
                    <td value="nome">Raphael</td>
                    <td value="email">raphael@teste.com</td>
                    <td value="pais">Brasil</td>
                    <div class="col-12 col-md-10 col-lg-10">
                        <td>
                            <a href="#" class="link-primary text-decoration-none">Alterar</a>
                        </td>
                        <td>
                            <a href="#" class="link-primary text-decoration-none">Remover</a>
                        </td>
                    </div>

                </tr>
                
                

            </tbody>
            
            
            
        </table>
    </div>
    <!-- End Table -->

</body>
</html>