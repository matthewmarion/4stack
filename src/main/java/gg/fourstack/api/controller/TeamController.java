package gg.fourstack.api.controller;

import gg.fourstack.api.model.Team;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/teams")
public class TeamController extends BaseController<Team> {
}
