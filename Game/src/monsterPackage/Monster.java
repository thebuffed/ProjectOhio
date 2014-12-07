/**
 * 
 */
package monsterPackage;

import itemPackage.Item;

import java.util.ArrayList;

/**
 * The abstract class for all monsters in the game.
 * @author Michael Santoro
 *
 */
public abstract class Monster
{
	//The amount of health the monster has.
	private int health;
	
	//The amount of strength the monster has.
	private int strength;
	
	//The amount of defense a monster has.
	private int defense;
	
	//The amount of agility a monster has.
	private int agility;
	
	//The items a monster has.
	private ArrayList<Item> items;
	

	/**
	 * The constructor method for a monster.
	 */
	public Monster(int health, int strength, int defense, int agility, ArrayList<Item> items)
	{
		this.health = health;
		this.strength = strength;
		this.defense = defense;
		this.agility = agility;
		this.items = items;
	}
	
	//The method called for when the monster attacks.
	public abstract void attack();
	
	//The method called for when the monster defends.
	public abstract void defend();
	
	//The method called for when the monster drops items.
	public abstract void dropItems();

	/**
	 * Returns the monster's health.
	 * @return The health of the monster.
	 */
	public int getHealth()
	{
		return health;
	}

	/**
	 * Sets the monster's health.
	 * @param health The monster's health
	 */
	public void setHealth(int health)
	{
		this.health = health;
	}

	/**
	 * Returns the monster's strength.
	 * @return The strength of the monster.
	 */
	public int getStrength()
	{
		return strength;
	}

	/**
	 * Sets the monster's strength.
	 * @param strength The monster's strength.
	 */
	public void setStrength(int strength)
	{
		this.strength = strength;
	}

	/**
	 * Returns the monster's defense.
	 * @return The defense of the monster.
	 */
	public int getDefense()
	{
		return defense;
	}

	/**
	 * Sets the monster's defense.
	 * @param defense The monster's defense.
	 */
	public void setDefense(int defense)
	{
		this.defense = defense;
	}

	/**
	 * Returns the monster's agility.
	 * @return The agility of the monster.
	 */
	public int getAgility()
	{
		return agility;
	}

	/**
	 * Sets the monster's agility.
	 * @param agility The monster's agility.
	 */
	public void setAgility(int agility)
	{
		this.agility = agility;
	}

	/**
	 * The items that the monster has.
	 * @return The items that the monster has.
	 */
	public ArrayList<Item> getItems()
	{
		return items;
	}

	/**
	 * Sets the items that the monster has.
	 * @param items The items.
	 */
	public void setItems(ArrayList<Item> items)
	{
		this.items = items;
	}
	

}
