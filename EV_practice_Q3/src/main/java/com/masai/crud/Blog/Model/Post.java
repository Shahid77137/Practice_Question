package com.masai.crud.Blog.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postId;
	private String title;
	private String description;
	private LocalDateTime postedAt; //(Timestamp)
    private LocalDateTime lastUpdatedAt; //(Timestamp)
	
    @ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    @JoinTable(joinColumns =  @JoinColumn(name = "postId"),inverseJoinColumns = @JoinColumn(name = "tagId"))
    private List<Tag> tags = new ArrayList<Tag>();

    public Post() {};
    
	public Post(int postId, String title, String description, LocalDateTime postedAt, LocalDateTime lastUpdatedAt,
			List<Tag> tags) {
		super();
		this.postId = postId;
		this.title = title;
		this.description = description;
		this.postedAt = postedAt;
		this.lastUpdatedAt = lastUpdatedAt;
		this.tags = tags;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getPostedAt() {
		return postedAt;
	}

	public void setPostedAt(LocalDateTime postedAt) {
		this.postedAt = postedAt;
	}

	public LocalDateTime getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
 
}
