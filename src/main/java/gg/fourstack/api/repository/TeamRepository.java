package gg.fourstack.api.repository;

import gg.fourstack.api.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends BaseRepository<Team> { }
