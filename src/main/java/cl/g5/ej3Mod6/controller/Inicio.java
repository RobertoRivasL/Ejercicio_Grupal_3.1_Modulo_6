package cl.g5.ej3Mod6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Inicio {

    @GetMapping
    public String getHome() {
        //---metodo con acceso get, que retorna un string (direcciona a un html)
        return "index";
    }
}

// Compare this snippet from src\main\java\cl\g5\ej3Mod6\controller\Inicio.java:
// package cl.g5.ej3Mod6.controller;
//
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
//  import org.springframework.web.bind.annotation.RestController;
//  import org.springframework.web.bind.annotation.RestController;
//  import org.springframework.web.bind.annotation.RequestMapping;
//  import org.springframework.web.bind.annotation.GetMapping;
//  import org.springframework.web.bind.annotation.PostMapping;
//  import org.springframework.web.bind.annotation.PutMapping;
//  import org.springframework.web.bind.annotation.DeleteMapping;
//  import org.springframework.web.bind.annotation.PatchMapping;
//  import org.springframework.web.bind.annotation.RequestBody;
//  import org.springframework.web.bind.annotation.RequestParam;
//  import org.springframework.web.bind.annotation.PathVariable;

// @RestController
// @RequestMapping("/api")
// public class Inicio {
//   @GetMapping
//   public String getHome(){
//     //---metodo con acceso get, que retorna un string (direcciona a un html)
//     return "index";
//   }
//   @PostMapping
//   public String postHome(){
//     //---metodo con acceso post, que retorna un string (direcciona a un html)
//     return "index";
//   }
//   @PutMapping
//   public String putHome(){
//     //---metodo con acceso put, que retorna un string (direcciona a un html)
//     return "index";
//   }
//   @DeleteMapping
//   public String deleteHome(){
//     //---metodo con acceso delete, que retorna un string (direcciona a un html)
//     return "index";
//   }
//   @PatchMapping
//   public String patchHome(){
//     //---metodo con acceso patch, que retorna un string (direcciona a un html)
//     return "index";
//   }
//   @GetMapping("/parametros")
//   public String getParametros(@RequestParam String nombre, @RequestParam String apellido){
//     //---metodo con acceso get, que retorna un string (direcciona a un html)
//     return "index";
//   }
//   @GetMapping("/parametros/{id}")
//   public String getParametros(@PathVariable String id){
//     //---metodo con acceso get, que retorna un string (direcciona a un html)
//     return "index";
//   }
//   @PostMapping("/parametros")
//   public String postParametros(@RequestBody String body){
//     //---metodo con acceso post, que retorna un string (direcciona a un html)
//     return "index";
//   }
//   @PutMapping("/parametros")
//   public String putParametros(@RequestBody String body){
//     //---metodo con acceso put, que retorna un string (direcciona a un html)
//     return "index";
//   }
//   @DeleteMapping("/parametros")
//   public String deleteParametros(@RequestBody String body){
//     //---metodo con acceso delete, que retorna un string (direcciona a un html)
//     return "index";
//   }
//   @PatchMapping("/parametros")
//   public String patchParametros(@RequestBody String body){
//     //---metodo con acceso patch, que retorna un string (direcciona a un html)
//     return "index";
//   }
// }
//

