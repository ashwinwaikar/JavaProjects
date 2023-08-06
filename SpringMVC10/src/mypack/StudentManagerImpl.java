package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentManagerImpl implements StudentManager
{
	@Autowired
	StudentDAO sdao;
	
	@Override
	public void add(Student ref)
	{
			sdao.add(ref);
	}

}
