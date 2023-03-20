package RepositoryDemo;

public interface IEntityRepository<T extends IEntity> {
	
	
	//generic constraints -- generic k�s�tlar
	// Veri taban� nesnesi ile ilgili olmayan class'lar� bu repository' ye g�ndermemek i�in generic constraints kullan�r�z
	void add(T entity);
	void delete(T entity);
	void update(T entity);
	T getAll();
	
	
	
}
