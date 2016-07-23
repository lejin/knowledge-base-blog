/**
 * 
 */
package in.lejinjoseph.knowledgebaseblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.lejinjoseph.knowledgebaseblog.model.BlogCategoryEntity;
import in.lejinjoseph.knowledgebaseblog.repository.BlogCategoryRepository;

/**
 * @author lejin
 *
 */
@RestController
public class CategoryController {
	@Autowired
	BlogCategoryRepository blogCategoryRepository;
	
@RequestMapping("/hai")	
public List<BlogCategoryEntity> getCategories(){
	return blogCategoryRepository.findAll();
}
}
