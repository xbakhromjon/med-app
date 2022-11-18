package uz.bakhromjon.medapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.medapp.entities.Article;
import uz.bakhromjon.medapp.entities.Vacancy;
import uz.bakhromjon.medapp.repositories.base.BaseRepository;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Repository
@Transactional
public interface VacancyRepository extends JpaRepository<Vacancy, Long>, BaseRepository {
    @Query(nativeQuery = true, value = """
            select * from vacancy where id = :id and not is_deleted
            """)
    Optional<Vacancy> findByIdAndNotDeleted(Long id);

}
