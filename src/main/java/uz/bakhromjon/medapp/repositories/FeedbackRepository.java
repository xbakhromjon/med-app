package uz.bakhromjon.medapp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.medapp.entities.Company;
import uz.bakhromjon.medapp.entities.Feedback;
import uz.bakhromjon.medapp.repositories.base.BaseRepository;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Repository
@Transactional
public interface FeedbackRepository extends JpaRepository<Feedback, Long>, BaseRepository {

    Optional<Feedback> findByIdAndIsDeleted(Long id, Boolean isDeleted);

    @Query(nativeQuery = true, value = """
            update feedback set is_deleted = true where id = :id
            """)
    @Modifying
    void delete(Long id);
}

