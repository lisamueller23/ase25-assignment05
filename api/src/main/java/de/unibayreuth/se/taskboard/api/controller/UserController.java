package de.unibayreuth.se.taskboard.api.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import de.unibayreuth.se.taskboard.api.dtos.UserDto;
import de.unibayreuth.se.taskboard.business.ports.UserService;

import java.util.List;
import java.util.UUID;

@OpenAPIDefinition(
        info = @Info(
                title = "TaskBoard",
                version = "0.0.1"
        )
)
@Tag(name = "Users")
@Controller
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // TODO: Add GET /api/users endpoint to retrieve all users.
    @GetMapping
    @ResponseBody
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    // TODO: Add GET /api/users/{id} endpoint to retrieve a user by ID.
    @GetMapping("/{id}")
    @ResponseBody
    public UserDto getUserById(@PathVariable("id") UUID id) {
        return userService.getUserById(id);
    }

    // TODO: Add POST /api/users endpoint to create a new user based on a provided user DTO.
    @PostMapping
    @ResponseBody
    public UserDto createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }
}
