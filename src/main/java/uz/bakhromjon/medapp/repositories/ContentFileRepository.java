package uz.bakhromjon.medapp.repositories;

/**
 * @author : Bakhromjon Khasanboyev
 **/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.medapp.entities.ContentFile;
import uz.bakhromjon.medapp.repositories.base.BaseRepository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface ContentFileRepository extends JpaRepository<ContentFile, Long>, BaseRepository {
}
