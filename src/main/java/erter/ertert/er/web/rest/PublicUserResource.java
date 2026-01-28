package erter.ertert.er.web.rest;

import erter.ertert.er.service.UserService;
import erter.ertert.er.service.dto.UserDTO;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.*;

@RestController
@RequestMapping("/api")
public class PublicUserResource {

    private final Logger log = LoggerFactory.getLogger(PublicUserResource.class);

    private final UserService userService;

    public PublicUserResource(
        UserService userService
    ) {
        this.userService = userService;
    }

    /**
     * {@code GET /users} : get all users with only public information - calling this method is allowed for anyone.
     */
    @GetMapping("/users")
    public List<UserDTO> getAllPublicUsers() {
        return userService.getAllPublicUsers();
    }



}
