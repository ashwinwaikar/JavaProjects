package mypack;

import org.springframework.stereotype.Component;

@Component(value="gun")
public class Gun implements Weapon{
	
	
	public void attack()
	{
		System.out.println("Gun attack");
	}
}
