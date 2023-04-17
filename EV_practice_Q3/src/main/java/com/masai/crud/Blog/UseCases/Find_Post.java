package com.masai.crud.Blog.UseCases;

import com.masai.crud.Blog.DAO.TimelineDAO;
import com.masai.crud.Blog.DAO.TimelineDAOimpl;
import com.masai.crud.Blog.Model.Post;

public class Find_Post {

	public static void main(String[] args) {
		
		TimelineDAOimpl tdi = new TimelineDAOimpl();
		
		Post pst = new Post();
		
		pst = tdi.getPost(1);
		
		System.out.println("Post id : "+pst.getPostId() + "Post Title : "+pst.getTitle() + "Post Description : "+pst.getDescription() + "Posted at : "+pst.getPostedAt() + 
				"Post Last Updated at : "+pst.getLastUpdatedAt());

		
		if(!pst.getTags().isEmpty()) {
			System.out.println("Tags of this post");
			pst.getTags().forEach(t -> {
				System.out.println("Tag id : "+t.getTagId());
				System.out.println("Tag name : "+t.getTagName());
			});
		}
		
	}
	
}
