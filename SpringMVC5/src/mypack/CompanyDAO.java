package mypack;

import java.util.List;

public interface CompanyDAO 
{
	List<?> getAllCompanies();
	void delete(int cid);
}
