package com.blogApp.amol.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.blogApp.amol.dto.RoleDTO;
import com.blogApp.amol.service.RoleService;

import java.util.List;

@Controller
@RequestMapping("api/v1/roles")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public ResponseEntity<List<RoleDTO>> findAll() {
        return ResponseEntity.ok(roleService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoleDTO> findById(@PathVariable final Integer id) {
        return ResponseEntity.ok(roleService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Integer> create(@RequestBody RoleDTO roleDTO) {
        Integer id = roleService.create(roleDTO);
        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }
}
