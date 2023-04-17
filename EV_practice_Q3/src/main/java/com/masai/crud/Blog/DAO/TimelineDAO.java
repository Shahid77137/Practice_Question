package com.masai.crud.Blog.DAO;

import com.masai.crud.Blog.Model.Post;
import com.masai.crud.Blog.Model.Tag;

public interface TimelineDAO {

	public void addPost(Post post); //[Points: 1 ]**
    //this method should add a post with 4 tags.

    public Post getPost(int postId); //[Points: 0.75 ]**
    //This method should get the Post along with the List of Tags.
    //If postId not exist then throw a PostNotFoundException

    public Tag getTags(int tagId); //[Points: 0.75 ]**
    //This method should get the Tag along with the List of Posts.
    //If tagId not exist then throw a TagNotFoundException
	
}
