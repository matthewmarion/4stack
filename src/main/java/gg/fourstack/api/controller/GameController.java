package gg.fourstack.api.controller;

import gg.fourstack.api.model.Game;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/games")
public class GameController extends BaseController<Game> {

}

