package gg.fourstack.api.service;

import gg.fourstack.api.model.GameType;
import gg.fourstack.api.repository.GameTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameTypeService extends BaseService<GameType>{

}
