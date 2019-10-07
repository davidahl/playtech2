package com.playtech.player.controller;
import com.playtech.player.data.Player;
import com.playtech.player.data.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @GetMapping("/players")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Player> players() {
        System.out.println(playerService.getPlayers());
        return playerService.getPlayers();

    }

    @GetMapping("/players/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Player onePlayer(@PathVariable Integer id) {
        return playerService.getPlayer(id);
    }
}
