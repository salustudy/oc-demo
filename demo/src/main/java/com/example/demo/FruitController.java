package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
@RequestMapping(value = "/api/appDetails")
public class FruitController {
	@Autowired
    private ParamRepo repository;

    

    @GetMapping
    @ResponseBody
    public List<RefTbApplicationParamDtl> getAll() {
        return repository.findAll();
    }

	/*
	 * @ResponseStatus(HttpStatus.CREATED)
	 * 
	 * @PostMapping public String createFruit(@RequestBody(required = false) Fruit
	 * fruit) { repository.save(fruit); return "redirect:/"; }
	 * 
	 * @GetMapping("/{id}") public Fruit getFruit(@PathVariable("id") Long id) {
	 * return repository.findById(id).orElse(null); }
	 * 
	 * @PutMapping("/{id}") public Fruit updateFruit(@PathVariable("id") Long
	 * id, @RequestBody(required = false) Fruit fruit) { fruit.setId(id); return
	 * repository.save(fruit); }
	 * 
	 * @ResponseStatus(HttpStatus.NO_CONTENT)
	 * 
	 * @DeleteMapping("/{id}") public void delete(@PathVariable("id") Long id) {
	 * repository.deleteById(id); }
	 */

}