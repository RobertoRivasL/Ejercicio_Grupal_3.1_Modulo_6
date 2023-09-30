package cl.g5.ej3Mod6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactoController {

    @GetMapping("/contacto")
    public String mostrarPaginaContacto() {
        return "contacto";
    }

    @PostMapping("/formularioContacto")

    public String postFormularioContacto(@RequestParam(name = "nombre") String nombre,
                                         @RequestParam(name = "correo") String correo,
                                         @RequestParam(name = "mensaje") String mensaje,
                                         Model model) {

        model.addAttribute("nombre", nombre);
        model.addAttribute("correo", correo);
        model.addAttribute("mensaje", mensaje);

        System.out.print("Nombre: " + nombre + " Correo: " + correo + " Mensaje: " + mensaje);

        return "contacto";
    }

}


// Compare this snippet from src/main/java/com/example/demo/controllers/CrearClienteController.java:
// package com.example.demo.controllers;
//
// import com.example.demo.models.Cliente;
// import com.example.demo.models.Contenedor;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
//
// @Controller
// public class CrearClienteController {
//
//     @GetMapping("/crearCliente")
//     public String mostrarPaginaCliente() {
//         return "crearClienteView";
//     }
//
//     @PostMapping("/formularioCliente")
//
//     public String postFormularioCliente(@RequestParam("rut") String rut,
//                                         @RequestParam("nombre") String nombre,
//                                         @RequestParam("apellido") String apellido,
//                                         @RequestParam("fechaNacimiento") String fechaNacimiento,
//                                         @RequestParam("telefono") String telefono,
//                                         @RequestParam("correo") String correo,
//                                         Model model) {
//
//         model.addAttribute("rut", rut);
//         model.addAttribute("nombre", nombre);
//         model.addAttribute("apellido", apellido);
//         model.addAttribute("fechaNacimiento", fechaNacimiento);
//         model.addAttribute("telefono", telefono);
//         model.addAttribute("correo", correo);
//      Cliente cliente = new Cliente(rut, nombre, apellido, fechaNacimiento, telefono, correo);
//      Contenedor.agregarCliente(cliente);
//
//         return "crearClienteView";
//     }
//
//
// }
// Compare this snippet from src/main/java/com/example/demo/controllers/CrearUsuarioController.java:
// package com.example.demo.controllers;
//
// import com.example.demo.models.Contenedor;
// import com.example.demo.models.Usuario;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
//
// @Controller
// public class CrearUsuarioController {
//
//     @GetMapping("/crearUsuario")
//     public String mostrarPaginaUsuario() {
//         return "crearUsuarioView";
//     }
//
//     @PostMapping("/formularioUsuario")
//
//     public String postFormularioUsuario(@RequestParam("rut") String rut,
//                                         @RequestParam("nombre") String nombre,
//                                         @RequestParam("apellido") String apellido,
//                                         @RequestParam("fechaNacimiento") String fechaNacimiento,
//                                         @RequestParam("telefono") String telefono,
//                                         @RequestParam("correo") String correo,
//                                         @RequestParam("nombreUsuario") String nombreUsuario,
//                                         @RequestParam("contrasena") String contrasena,
//                                         Model model) {
//
//         model.addAttribute("rut", rut);
//         model.addAttribute("nombre", nombre);
//         model.addAttribute("apellido", apellido);
//         model.addAttribute("fechaNacimiento", fechaNacimiento);
//         model.addAttribute("telefono", telefono);
//         model.addAttribute("correo", correo);
//         model.addAttribute("nombreUsuario", nombreUsuario);
//         model.addAttribute("contrasena", contrasena);
//
//         Usuario usuario = new Usuario(rut, nombre, apellido, fechaNacimiento, telefono, correo, nombreUsuario, contrasena);
//         Contenedor.agregarUsuario(usuario);
//
//         return "crearUsuarioView";
//     }
//
//
// }
// Compare this snippet from src/main/java/com/example/demo/controllers/CrearVisitaController.java:
// package com.example.demo.controllers;
//
// import com.example.demo.models.Contenedor;
// import com.example.demo.models.Visita;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
//
// @Controller
// public class CrearVisitaController {
//
//     @GetMapping("/crearVisita")
//     public String mostrarPaginaVisita() {
//         return "crearVisitaView";
//     }
//
//     @PostMapping("/formularioVisita")
//
//     public String postFormularioVisita(@RequestParam("rutCliente") String rutCliente,
//                                         @RequestParam("dia") String dia,
//                                         @RequestParam("hora") String hora,
//                                         @RequestParam("motivo") String motivo,
//                                         Model model) {
//
//         model.addAttribute("rutCliente", rutCliente);
//         model.addAttribute("dia", dia);
//         model.addAttribute("hora", hora);
//         model.addAttribute("motivo", motivo);
//
//         Visita visita = new Visita(rutCliente, dia, hora, motivo);
//         Contenedor.agregarVisita(visita);
//
//         return "crearVisitaView";
//     }
//
//
// }
// Compare this snippet from src/main/java/com/example/demo/controllers/InicioController.java:
// package com.example.demo.controllers;
//
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
//
// @Controller
// public class InicioController {
//
//     @GetMapping("/")
//     public String mostrarPaginaInicio(Model model) {
//         model.addAttribute("mensaje", "Bienvenido a la página de inicio");
//         return "inicioView";
//     }
//
// }
// Compare this snippet from src/main/java/com/example/demo/controllers/ListarClientesController.java:
// package com.example.demo.controllers;
//
// import com.example.demo.models.Cliente;
// import com.example.demo.models.Contenedor;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
//
// import java.util.ArrayList;
//
// @Controller
// public class ListarClientesController {
//
//     @GetMapping("/listarClientes")
//     public String mostrarPaginaListarClientes(Model model) {
//         ArrayList<Cliente> clientes = Contenedor.getClientes();
//         model.addAttribute("clientes", clientes);
//         return "listarClientesView";
//     }
//
// }
// Compare this snippet from src/main/java/com/example/demo/controllers/ListarUsuariosController.java:
// package com.example.demo.controllers;
//
// import com.example.demo.models.Contenedor;
// import com.example.demo.models.Usuario;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
//
// import java.util.ArrayList;
//
// @Controller
// public class ListarUsuariosController {
//
//     @GetMapping("/listarUsuarios")
//     public String mostrarPaginaListarUsuarios(Model model) {
//         ArrayList<Usuario> usuarios = Contenedor.getUsuarios();
//         model.addAttribute("usuarios", usuarios);
//         return "listarUsuariosView";
//     }
//
// }
// Compare this snippet from src/main/java/com/example/demo/controllers/ListarVisitasController.java:
// package com.example.demo.controllers;
//
// import com.example.demo.models.Contenedor;
// import com.example.demo.models.Visita;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
//
// import java.util.ArrayList;
//
// @Controller
// public class ListarVisitasController {
//
//     @GetMapping("/listarVisitas")
//     public String mostrarPaginaListarVisitas(Model model) {
//         ArrayList<Visita> visitas = Contenedor.getVisitas();
//         model.addAttribute("visitas", visitas);
//         return "listarVisitasView";
//     }
//
// }
// Compare this snippet from src/main/java/com/example/demo/controllers/ModificarClienteController.java:
// package com.example.demo.controllers;
//
// import com.example.demo.models.Cliente;
// import com.example.demo.models.Contenedor;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
//
// @Controller
// public class ModificarClienteController {
//
//     @GetMapping("/modificarCliente")
//     public String mostrarPaginaModificarCliente() {
//         return "modificarClienteView";
//     }
//
//     @PostMapping("/formularioModificarCliente")
//
//     public String postFormularioModificarCliente(@RequestParam("rut") String rut,
//                                         @RequestParam("nombre") String nombre,
//                                         @RequestParam("apellido") String apellido,
//                                         @RequestParam("fechaNacimiento") String fechaNacimiento,
//                                         @RequestParam("telefono") String telefono,
//                                         @RequestParam("correo") String correo,
//                                         Model model) {
//
//         model.addAttribute("rut", rut);
//         model.addAttribute("nombre", nombre);
//         model.addAttribute("apellido", apellido);
//         model.addAttribute("fechaNacimiento", fechaNacimiento);
//         model.addAttribute("telefono", telefono);
//         model.addAttribute("correo", correo);
//
//         Cliente cliente = new Cliente(rut, nombre, apellido, fechaNacimiento, telefono, correo);
//         Contenedor.modificarCliente(cliente);
//
//         return "modificarClienteView";
//     }
//
//
// }
// Compare this snippet from src/main/java/com/example/demo/controllers/ModificarUsuarioController.java:
// package com.example.demo.controllers;
//
// import com.example.demo.models.Contenedor;

