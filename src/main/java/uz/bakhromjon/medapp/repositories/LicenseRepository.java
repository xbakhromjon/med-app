package uz.bakhromjon.medapp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.medapp.entities.Company;
import uz.bakhromjon.medapp.entities.License;
import uz.bakhromjon.medapp.repositories.base.BaseRepository;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Repository
@Transactional
public interface LicenseRepository extends JpaRepository<License, Long>, BaseRepository {
    @Query(nativeQuery = true, value = """
            update license set is_deleted = true where id = :id
            """)
    @Modifying
    void delete(Long id);

    Optional<License> findByIdAndIsDeleted(Long id, Boolean isDeleted);
}

