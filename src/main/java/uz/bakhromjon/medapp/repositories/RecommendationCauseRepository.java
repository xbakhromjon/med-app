package uz.bakhromjon.medapp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.medapp.entities.RecommendationCause;
import uz.bakhromjon.medapp.repositories.base.BaseRepository;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Repository
@Transactional
public interface RecommendationCauseRepository extends JpaRepository<RecommendationCause, Long>, BaseRepository {

    Optional<RecommendationCause> findByIdAndIsDeleted(Long id, boolean isDeleted);
}

