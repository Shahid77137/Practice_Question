package com.masai.crud.Blog.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tagId;
    private String tagName;
	
    @ManyToMany(mappedBy = "tags",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    private List<Post> posts = new ArrayList<Post>();

    public Tag() {};
    
	public Tag(int tagId, String tagName, List<Post> posts) {
		super();
		this.tagId = tagId;
		this.tagName = tagName;
		this.posts = posts;
	}

	public int getTagId() {
		return tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

}
