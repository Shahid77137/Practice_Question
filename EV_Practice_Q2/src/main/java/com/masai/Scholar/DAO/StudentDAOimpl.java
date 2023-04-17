package com.masai.Scholar.DAO;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.Scholar.Exception.StudentException;
import com.masai.Scholar.Model.DayScholar;
import com.masai.Scholar.Model.Hosteller;
import com.masai.Scholar.Util.EMUtils;

public class StudentDAOimpl implements StudentDAO{

	public String insertingDayScholar(DayScholar ds) {
		// TODO Auto-generated method stub
		
		EntityManager em = EMUtils.getEntityManager();
		
		DayScholar ds1 = em.find(DayScholar.class, ds.getId());
		if(ds1 != null)
			throw new StudentException("Student already exist by this Id");
		Query query = em.createQuery("INSERT INTO DAYSCHOLAR(NAME,ADDRESS,EXAMFEE,TRANSPORTFEE) VALUES(:NAME,:ADDRESS,:EXAMFEE,:TRANSPORTFEE)");
		
		em.getTransaction().begin();
		query.setParameter("NAME", ds.getName());
		query.setParameter("ADDRESS", ds.getAddress());
		query.setParameter("EXAMFEE", ds.getExamfee());
		query.setParameter("TRANSPORTFEE", ds.getTransportfee());
        int x = query.executeUpdate();
		
		em.persist(ds1);
		
		em.getTransaction().commit();
		em.close();
		if(x > 0)
		return ds1.getName()+" Dayscholar inserted successfully";
		else throw new StudentException("Something went wrong");
	}

	public String insertingHosteller(Hosteller hs) {
		// TODO Auto-generated method stub
		
		EntityManager em = EMUtils.getEntityManager();
		
		Hosteller hs1 = em.find(Hosteller.class, hs.getId());
		if(hs1 != null)
			throw new StudentException("Student already exist by this Id");
		Query query = em.createQuery("INSERT INTO HOSTELLER(NAME,ADDRESS,EXAMFEE,HOSTELFEE) VALUES(:NAME,:ADDRESS,:EXAMFEE,:HOSTELFEE)");
		
		query.setParameter("NAME", hs.getName());
		query.setParameter("ADDRESS", hs.getAddress());
		query.setParameter("EXAMFEE", hs.getExamfee());
		query.setParameter("HOSTELFEE", hs.getHostelfee());

		em.getTransaction().begin();
		 int x = query.executeUpdate();
		em.persist(hs1);
		
		em.getTransaction().commit();
		em.close();
		
		
		if(x > 0)
			return hs1.getName()+" Hosteller inserted successfully";
			else throw new StudentException("Something went wrong");


	}

	@Override
	public Hosteller getHosteller(String name) {
		EntityManager em = EMUtils.getEntityManager();
		
		Hosteller hos = null;
		String jpqlquery = "select s from student s where s.name = :name";
		TypedQuery<Hosteller> query = em.createQuery(jpqlquery, Hosteller.class);
		query.setParameter("name", name);
		try {
			hos = query.getSingleResult();
			
		}catch (Exception e) {
			throw new StudentException(e.getMessage());
		}finally {
			em.close();
		}
		
		return hos;
	}

	@Override
	public DayScholar getDayScholar(String name) {
		EntityManager em = EMUtils.getEntityManager();
		
		DayScholar scholar = null;
		String jpqlquery = "select s from student s where s.name = :name";
		TypedQuery<DayScholar> query = em.createQuery(jpqlquery, DayScholar.class);
		query.setParameter("name", name);
		try {
			scholar = query.getSingleResult();
			
		}catch (Exception e) {
			throw new StudentException(e.getMessage());
		}finally {
			em.close();
		}
		
		return scholar;
	}

}
