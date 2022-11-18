package uz.bakhromjon.medapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.medapp.entities.Article;
import uz.bakhromjon.medapp.repositories.base.BaseRepository;

import javax.transaction.Transactional;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Repository
@Transactional
public interface ArticleRepository extends JpaRepository<Article, Long>, BaseRepository {
}
