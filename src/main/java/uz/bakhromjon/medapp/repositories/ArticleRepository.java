package uz.bakhromjon.medapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.medapp.entities.Article;
import uz.bakhromjon.medapp.repositories.base.BaseRepository;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Repository
@Transactional
public interface ArticleRepository extends JpaRepository<Article, Long>, BaseRepository {

    @Query(nativeQuery = true, value = """
            update article set is_deleted = true where id = :id
            """)
    @Modifying
    void delete(Long id);

    @Query(nativeQuery = true, value = """
            select * from article where id = :id and not is_deleted
            """)
    Optional<Article> findByIdAndNotDeleted(Long id);
}
