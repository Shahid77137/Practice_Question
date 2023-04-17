package com.masai.Scholar.DAO;

import com.masai.Scholar.Model.DayScholar;
import com.masai.Scholar.Model.Hosteller;

public interface StudentDAO {

    public String insertingDayScholar(DayScholar ds);
    
    public String insertingHosteller(Hosteller hs);
    
    public Hosteller getHosteller(String name);
    
    public DayScholar getDayScholar(String name);
	
}
