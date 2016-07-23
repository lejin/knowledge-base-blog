package in.lejinjoseph.knowledgebaseblog.model;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "blog_post_to_category")
public class CategoryBlogMappingEntity {

	@JoinColumn(name = "category_id")
	@OneToOne
	protected BlogCategoryEntity category;

	@JoinColumn(name = "post_id")
	@ManyToOne(fetch = FetchType.LAZY)
	protected List<BlogPostEntity> blogPosts;

	/**
	 * @return the category
	 */
	public BlogCategoryEntity getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(BlogCategoryEntity category) {
		this.category = category;
	}

	/**
	 * @return the blogPosts
	 */
	public List<BlogPostEntity> getBlogPosts() {
		return blogPosts;
	}

	/**
	 * @param blogPosts
	 *            the blogPosts to set
	 */
	public void setBlogPosts(List<BlogPostEntity> blogPosts) {
		this.blogPosts = blogPosts;
	}

}
