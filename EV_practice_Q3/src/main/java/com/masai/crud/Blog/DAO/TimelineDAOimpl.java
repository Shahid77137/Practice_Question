package com.masai.crud.Blog.DAO;

import javax.persistence.EntityManager;

import com.masai.crud.Blog.Model.Post;
import com.masai.crud.Blog.Model.Tag;
import com.masai.crud.Blog.Util.EMUtils;

public class TimelineDAOimpl implements TimelineDAO{

	public void addPost(Post post) {
		// TODO Auto-generated method stub
		
		EntityManager em = EMUtils.getEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(post);
		
		em.getTransaction().commit();
		em.close();
		
	}

	public Post getPost(int postId) {
		// TODO Auto-generated method stub
		
       EntityManager em = EMUtils.getEntityManager();
		
       Post pst = em.find(Post.class,postId);

		return pst;
	}

	public Tag getTags(int tagId) {
		// TODO Auto-generated method stub
		
		 EntityManager em = EMUtils.getEntityManager();
			
	       Tag tg = em.find(Tag.class,tagId);

			return tg;

	}

}
