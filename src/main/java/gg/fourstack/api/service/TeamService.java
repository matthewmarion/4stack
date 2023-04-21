package gg.fourstack.api.service;

import gg.fourstack.api.model.Team;
import gg.fourstack.api.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService extends BaseService<Team> {

}
