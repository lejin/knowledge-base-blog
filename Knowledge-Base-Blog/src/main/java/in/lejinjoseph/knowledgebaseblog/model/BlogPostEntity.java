/**
 * 
 */
package in.lejinjoseph.knowledgebaseblog.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author lejin
 *
 */

@Table(name = "blog_post")
@Entity
public class BlogPostEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Integer id;

	@Column(name = "title")
	protected String title;

	@Column(name = "article")
	protected String article;

	@Column(name = "title_clean")
	protected String cleanTitle;

	@Column(name = "file")
	protected String file;

	@OneToOne
	@JoinColumn(name="author_id")
	protected KnowledgeBaseUserEntity user;

	@Column(name = "date_published")
	protected LocalDateTime publishedDate;

	@Column(name = "banner_image")
	protected String bannerImage;

	@Column(name = "featured")
	protected int featured;

	@Column(name = "enabled")
	protected int enabled;

	@Column(name = "comments_enabled")
	protected int commentsEnabled;

	@Column(name = "views")
	protected int views;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the article
	 */
	public String getArticle() {
		return article;
	}

	/**
	 * @param article the article to set
	 */
	public void setArticle(String article) {
		this.article = article;
	}

	/**
	 * @return the cleanTitle
	 */
	public String getCleanTitle() {
		return cleanTitle;
	}

	/**
	 * @param cleanTitle the cleanTitle to set
	 */
	public void setCleanTitle(String cleanTitle) {
		this.cleanTitle = cleanTitle;
	}

	/**
	 * @return the file
	 */
	public String getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(String file) {
		this.file = file;
	}

	/**
	 * @return the user
	 */
	public KnowledgeBaseUserEntity getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(KnowledgeBaseUserEntity user) {
		this.user = user;
	}

	/**
	 * @return the publishedDate
	 */
	public LocalDateTime getPublishedDate() {
		return publishedDate;
	}

	/**
	 * @param publishedDate the publishedDate to set
	 */
	public void setPublishedDate(LocalDateTime publishedDate) {
		this.publishedDate = publishedDate;
	}

	/**
	 * @return the bannerImage
	 */
	public String getBannerImage() {
		return bannerImage;
	}

	/**
	 * @param bannerImage the bannerImage to set
	 */
	public void setBannerImage(String bannerImage) {
		this.bannerImage = bannerImage;
	}

	/**
	 * @return the featured
	 */
	public int getFeatured() {
		return featured;
	}

	/**
	 * @param featured the featured to set
	 */
	public void setFeatured(int featured) {
		this.featured = featured;
	}

	/**
	 * @return the enabled
	 */
	public int getEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the commentsEnabled
	 */
	public int getCommentsEnabled() {
		return commentsEnabled;
	}

	/**
	 * @param commentsEnabled the commentsEnabled to set
	 */
	public void setCommentsEnabled(int commentsEnabled) {
		this.commentsEnabled = commentsEnabled;
	}

	/**
	 * @return the views
	 */
	public int getViews() {
		return views;
	}

	/**
	 * @param views the views to set
	 */
	public void setViews(int views) {
		this.views = views;
	}
}
