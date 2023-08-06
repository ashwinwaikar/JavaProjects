package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentManagerImpl implements StudentManager {
	@Autowired
	StudentRepository repository;

	@Override
	public void add(Student ref) {
		System.out.println(repository.getClass().getName());
		repository.save(ref);
	}
}
