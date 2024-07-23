<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.List" %>
<%@page import= "org.jorgeperalta.webapp.model.Juego"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark fixed-top position-relative">
            <div class="container-fluid">
                <a class="navbar-brand" href="./index.jsp">Sistema de VideoJuegos</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
                    <div class="offcanvas-header">
                        <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Sistema de VideoJuegos</h5>
                        <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                    </div>
                    <div class="offcanvas-body">
                        <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                            <li class="nav-item">
                                <a class="nav-link" href="./index.jsp">Inicio</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="./formulario-juegos/formulario-juegos.jsp">Formulario de juegos</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active" href="/juego-servlet">Lista de juegos</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>
        <div class="container position-relative mt-5"> 
           <table class="table table-success table-striped">
                <thead>
                    <tr>
                        <th scope="col">No. juego#</th>
                        <th scope="col">Nombre</th>
                        <th scope="col">Plataforma</th>
                        <th scope="col">Precio</th>
                    </tr>
                </thead>
                <tbody>
                    <% List<Juego> juegos = (List)request.getAttribute("juegos");%>
                    
                    <%for(Juego juego:juegos){ %>
                    <tr class="table-success">
                        <th scope="row"><%=juego.getJuegoId()%></th>
                        <th scope="row"><%=juego.getNombreJuego()%></th>
                        <th scope="row"><%=juego.getPlataformaJuego()%></th>
                        <th scope="row"><%=juego.getPrecio()%></th>
                    </tr>
                      <%  } %>
                </tbody>
                
            </table>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
