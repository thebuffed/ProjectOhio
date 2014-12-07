package itemPackage;
/**
 * Item abstract class
 * Potions, Weapons, Armor, Food
 * @author Eric
 */
public abstract class Item {
	
	//Amount the item increases user health
	private int health;
	
	//Amount the item increases user strength
	private int strength;
	
	//Amount the item increases user defense
	private int defense;
	
	//Amount the item increases user agility
	private int agility;
	
	//True/False whether the item can be equipped to the user
	private boolean equippable;
	
	//True/False whether the item can be activated or is passive
	private boolean usable;
	
	//True/False whether the item can be used for crafting
	private boolean craftable;
	
	//Lore about the item
	private String info; 
	
	/**
	 * Constructor
	 */
	public Item(int health, int strength, int defense, int agility, boolean equippable, boolean usable, boolean craftable, String info) {
		this.health = health;
		this.strength = strength;
		this.defense = defense;
		this.agility = agility;
		this.equippable = equippable;
		this.usable = usable;
		this.craftable = craftable;
		this.info = info;
	}
	
	/**
	 * Determines if the item can equipped,
	 * then equips it
	 */
	public abstract void equip();
	
	/**
	 * Determines if the item can be activated,
	 * then activates it
	 */
	public abstract void use();
	
	/**
	 * Removes the item from the user's inventory
	 */
	public abstract void drop();
	
	/**
	 * Gives the item to another person
	 */
	public abstract void give();

	/**
	 * Returns the health effect
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Sets the health effect
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * Returns the strength effect
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * Sets the strength effect
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

	/**
	 * Returns the defense effect
	 * @return the defense
	 */
	public int getDefense() {
		return defense;
	}

	/**
	 * Sets the defense effect
	 * @param defense the defense to set
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}

	/**
	 * Returns the agility effect
	 * @return the agility
	 */
	public int getAgility() {
		return agility;
	}

	/**
	 * Sets the agility effect
	 * @param agility the agility to set
	 */
	public void setAgility(int agility) {
		this.agility = agility;
	}

	/**
	 * Returns the boolean equippable
	 * @return the equippable
	 */
	public boolean isEquippable() {
		return equippable;
	}

	/**
	 * Sets the boolean equippable
	 * @param equippable the equippable to set
	 */
	public void setEquippable(boolean equippable) {
		this.equippable = equippable;
	}

	/**
	 * Returns the boolean usable
	 * @return the usable
	 */
	public boolean isUsable() {
		return usable;
	}

	/**
	 * Sets the boolean usable
	 * @param usable the usable to set
	 */
	public void setUsable(boolean usable) {
		this.usable = usable;
	}

	/**
	 * Returns the boolean craftable
	 * @return the craftable
	 */
	public boolean isCraftable() {
		return craftable;
	}

	/**
	 * Sets the boolean craftable
	 * @param craftable the craftable to set
	 */
	public void setCraftable(boolean craftable) {
		this.craftable = craftable;
	}

	/**
	 * Returns the info/lore
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * Sets the info/lore
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
