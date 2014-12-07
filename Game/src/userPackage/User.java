/**
 * 
 */
package userPackage;

import itemPackage.Item;

import java.util.ArrayList;

/**
 * The class to represent the user/player of the game.
 * @author Michael Santoro
 *
 */
public class User
{
	//The health of the user.
	private int health;
	
	//The strength of the user.
	private int strength;
	
	//The defense of the user.
	private int defense;
	
	//The agility of the user.
	private int agility;
	
	//The experience of the user.
	private int experience;
	
	//The name of the user.
	private String name;
	
	//The items that the user has.
	private ArrayList<Item> items;

	/**
	 * The constructor of the user.
	 */
	public User(int health, int strength, int defense, int agility,
			int experience, String name, ArrayList<Item> items)
	{
		this.health = health;
		this.strength = strength;
		this.defense = defense;
		this.agility = agility;
		this.experience = experience;
		this.name = name;
		this.items = items;
	}
	
	//The method called for when the user attacks.
	public void attack()
	{
		
	}
	
	//The method called for when the user defends.
	public void defend()
	{
		
	}
	
	//The method called for when the user dies.
	public void die()
	{
		
	}

	/**
	 * Returns the user's health.
	 * @return The health
	 */
	public int getHealth()
	{
		return health;
	}

	/**
	 * Sets the user's health.
	 * @param health The health to set
	 */
	public void setHealth(int health)
	{
		this.health = health;
	}

	/**
	 * Returns the user's strength.
	 * @return The strength
	 */
	public int getStrength()
	{
		return strength;
	}

	/**
	 * Sets the user's strength.
	 * @param strength The strength to set
	 */
	public void setStrength(int strength)
	{
		this.strength = strength;
	}

	/**
	 * Returns the user's defense;
	 * @return The defense
	 */
	public int getDefense()
	{
		return defense;
	}

	/**
	 * Sets the user's defense.
	 * @param defense The defense to set
	 */
	public void setDefense(int defense)
	{
		this.defense = defense;
	}

	/**
	 * Returns the user's agility.
	 * @return The agility
	 */
	public int getAgility()
	{
		return agility;
	}

	/**
	 * Sets the user's agility.
	 * @param agility The agility to set
	 */
	public void setAgility(int agility)
	{
		this.agility = agility;
	}

	/**
	 * Returns the user's experience.
	 * @return The experience
	 */
	public int getExperience()
	{
		return experience;
	}

	/**
	 * Sets the user's experience.
	 * @param experience The experience to set
	 */
	public void setExperience(int experience)
	{
		this.experience = experience;
	}

	/**
	 * Returns the user's name.
	 * @return The name
	 */
	public String getName()
	{
		return name;
	}


	/**
	 * Returns the user's items.
	 * @return The items
	 */
	public ArrayList<Item> getItems()
	{
		return items;
	}

	/**
	 * Sets the user's items.
	 * @param items The items to set
	 */
	public void setItems(ArrayList<Item> items)
	{
		this.items = items;
	}

}
