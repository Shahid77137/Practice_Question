package com.masai.crud.Blog.UseCases;

import java.time.LocalDateTime;

import com.masai.crud.Blog.DAO.TimelineDAOimpl;
import com.masai.crud.Blog.Model.Post;
import com.masai.crud.Blog.Model.Tag;

public class Add_Post {

	public static void main(String[] args) {
		
		TimelineDAOimpl tdi = new TimelineDAOimpl();
		
		Post pt = new Post();
		
		pt.setTitle("SuperCars");
		pt.setDescription("Ferrari  is the best supercar maker");
		pt.setPostedAt(LocalDateTime.now());
        pt.setLastUpdatedAt(LocalDateTime.now());
        
        Tag tags1 = new Tag();
        tags1.setTagName("Ferrari Roma");
        tags1.getPosts().add(pt);
        pt.getTags().add(tags1);
        
        Tag tags2 = new Tag();
        tags2.setTagName("Ferrari 488 Pista");
        tags2.getPosts().add(pt);
        pt.getTags().add(tags2);
        
        Tag tags3 = new Tag();
        tags3.setTagName("Ferrari 812 Competizione");
        tags3.getPosts().add(pt);
        pt.getTags().add(tags3);
        
        tdi.addPost(pt);
        
	}
	
}
