package com.GestionPersonal.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionPersonal.demo.Repository.PersonalRepository;
import com.GestionPersonal.demo.model.Personal;

import java.util.List;

@Service
public class PersonalService {

    @Autowired
    private PersonalRepository personalRepository;

    public List<Personal> listarTodos() {
        return personalRepository.findAll();
    }

    public void guardar(Personal personal) {
        personalRepository.save(personal);
    }

    public Personal buscarPorId(Integer id) {
        return personalRepository.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        personalRepository.deleteById(id);
    }
}
