package gg.fourstack.api.service;

import gg.fourstack.api.model.Match;
import gg.fourstack.api.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService extends BaseService<Match> {

}
