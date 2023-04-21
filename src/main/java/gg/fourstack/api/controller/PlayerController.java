package gg.fourstack.api.controller;

import gg.fourstack.api.model.Player;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/players")
public class PlayerController extends BaseController<Player> {

}