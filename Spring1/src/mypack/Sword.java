package mypack;

import org.springframework.stereotype.Component;

@Component(value="sword")
public class Sword implements Weapon{
	public void attack()
	{
		System.out.println("Sword attack");
	}
}
