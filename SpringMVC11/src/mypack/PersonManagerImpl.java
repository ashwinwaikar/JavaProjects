package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonManagerImpl implements PersonManager {

	@Autowired
	PersonDAO pdao;

	@Override
	public void add(Person ref) {
		pdao.add(ref);
	}

}
