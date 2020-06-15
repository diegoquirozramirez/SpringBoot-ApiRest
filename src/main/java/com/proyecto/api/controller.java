package com.proyecto.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/user"})
public class controller {
	@Autowired
	private userServices userServ;
	
	@Autowired
	ObjectMapper mapper;
	
	@GetMapping({"/listar"})
	public List<user>listar(){
		return userServ.listar();
	}
	
	@PostMapping({"/agregar"})
	public user agregar(@RequestBody user u) {
		return userServ.add(u);
	}
	
	@GetMapping(path = "/listar/{id}")
	public user listarId(@PathVariable("id")int id) {
		return userServ.listarId(id);
	}
	
	@PutMapping(path = "/actualizar/{id}")
	public user actualizar(@RequestBody user u, @PathVariable("id")int id) {
		u.setId(id);
		return userServ.editar(u);
	}
	
	@DeleteMapping(path = "eliminar/{id}")
	public user eliminar(@PathVariable("id")int id) {
		return userServ.delete(id);
	}

}
