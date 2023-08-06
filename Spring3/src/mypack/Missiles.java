package mypack;

import org.springframework.stereotype.Component;

@Component(value="missiles")
public class Missiles implements Weapon {
	public void attack()
	{
		System.out.println("Missiles attack");
	}
}
