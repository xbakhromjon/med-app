package uz.bakhromjon.medapp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.medapp.entities.HearAboutClinic;
import uz.bakhromjon.medapp.repositories.base.BaseRepository;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Repository
@Transactional
public interface HearAboutClinicRepository extends JpaRepository<HearAboutClinic, Long>, BaseRepository {
    Optional<HearAboutClinic> findByIdAndIsDeleted(Long id, boolean isDeleted);

    @Query(nativeQuery = true, value = """
            update hear_about_clinic set is_deleted = true where id = :id
            """)
    @Modifying
    void delete(Long id);
}