package gg.fourstack.api.service;

import gg.fourstack.api.model.Player;
import gg.fourstack.api.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService extends BaseService<Player> {

}
