package fr.steph.fruitmarket.modelmarket;

import java.util.ArrayList;

public interface FruitDAO {

	public ArrayList<Fruit> findAll() throws Exception;
	//public void create(Fruit fruit);
	//public Fruit findByName(String fruitName);
}
