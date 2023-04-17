package com.masai.crud.Blog.UseCases;

import com.masai.crud.Blog.DAO.TimelineDAOimpl;
import com.masai.crud.Blog.Model.Post;
import com.masai.crud.Blog.Model.Tag;

public class Find_tags {

	public static void main(String[] args) {
		
        TimelineDAOimpl tdi = new TimelineDAOimpl();
		
		Tag tg = new Tag();
		
		tg = tdi.getTags(1);
		System.out.println(tg);
		
		System.out.println("Tag id : "+tg.getTagId() + "Tag Title : "+tg.getTagName());

		
		if(!tg.getPosts().isEmpty()) {
			System.out.println("Post of this tag");
			tg.getPosts().forEach(t -> {
				System.out.println("Post id : "+t.getPostId());
				System.out.println("Post name : "+t.getTitle());
			});
		}
		
	}
	
}
