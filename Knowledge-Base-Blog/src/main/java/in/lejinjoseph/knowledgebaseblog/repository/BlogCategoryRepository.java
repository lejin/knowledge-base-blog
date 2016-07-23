/**
 * 
 */
package in.lejinjoseph.knowledgebaseblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.lejinjoseph.knowledgebaseblog.model.BlogCategoryEntity;

/**
 * @author lejin
 *
 */
@Repository
public interface BlogCategoryRepository extends JpaRepository<BlogCategoryEntity, Integer> {

}
