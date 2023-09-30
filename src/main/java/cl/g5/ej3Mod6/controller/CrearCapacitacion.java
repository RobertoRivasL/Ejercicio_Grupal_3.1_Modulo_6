package cl.g5.ej3Mod6.controller;

import cl.g5.ej3Mod6.model.dto.CapacitacionDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/capacitacion")
public class CrearCapacitacion {

    private List<CapacitacionDTO> caps = new ArrayList<>();

    @GetMapping
    public String formCapacitacion() {
        return "crearCapacitacion";
    }

    @GetMapping("/lista")
    public String listaCapacitaciones(Model model) {
        model.addAttribute("listaCaps", caps);
        return "capacitaciones";
    }

    @PostMapping("/crear")
    public String crearCapacitacion(@RequestParam("nombre") String nombre,
                                    @RequestParam("detalle") String detalle,
                                    @RequestParam("fecha") String fecha,
                                    @RequestParam("hora") String hora,
                                    @RequestParam("lugar") String lugar,
                                    @RequestParam("duracion") int duracion,
                                    @RequestParam("cantidad") int cantidad,
                                    Model model) {
        CapacitacionDTO nuevaCapacitacion = new CapacitacionDTO(nombre, detalle, fecha, hora, lugar, duracion, cantidad);
        caps.add(nuevaCapacitacion);
        model.addAttribute("listaCaps", caps);
        return "capacitaciones";
    }
}