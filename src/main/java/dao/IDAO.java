package dao;

import java.util.List;

public interface IDAO<T,K> {

	String  loginBdd="root";
	String passwordBdd="";
	String urlBdd="jdbc:mysql://localhost:3306/projet_final?characterEncoding=UTF-8";
	
	public T findById(K id);
	public List<T> findAll();
	public void insert(T o);
	public void update(T o);
	public void delete(K id);
	
}
