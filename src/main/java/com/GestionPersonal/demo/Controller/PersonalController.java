package com.GestionPersonal.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.GestionPersonal.demo.Repository.EmpresaRepository;
import com.GestionPersonal.demo.Service.PersonalService;
import com.GestionPersonal.demo.model.Empresa;
import com.GestionPersonal.demo.model.Personal;

@Controller
@RequestMapping("/personal")
public class PersonalController {

    @Autowired
    private PersonalService personalService;

    @Autowired
    private EmpresaRepository empresaRepository; 

    @GetMapping({"/", "/listar"})
    public String listarPersonal(Model model) {
        model.addAttribute("listaPersonal", personalService.listarTodos());
        return "listar"; 
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioRegistrar(Model model) {
        Personal personal = new Personal();
        
        personal.setEmpresa(new Empresa()); 
        
        model.addAttribute("personal", personal);
        model.addAttribute("empresas", empresaRepository.findAll());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardarPersonal(@ModelAttribute("personal") Personal personal) {
        personalService.guardar(personal);
        return "redirect:/personal/listar";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable("id") Integer id, Model model) {
        Personal personal = personalService.buscarPorId(id);

        if (personal.getEmpresa() == null) {
            personal.setEmpresa(new Empresa());
        }
        
        model.addAttribute("personal", personal);
        model.addAttribute("empresas", empresaRepository.findAll());
        return "formulario";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminarPersonal(@PathVariable("id") Integer id) {
        personalService.eliminar(id);
        return "redirect:/personal/listar";
    }
}