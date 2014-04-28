package fr.treeptik.dao;

import java.util.List;

import fr.treeptik.exception.DAOException;

public interface GenericDAO<T, K> {

	public T save(T entity) throws DAOException;

	public T update(T entity) throws DAOException;

	public void remove(T entity) throws DAOException;

	public T findById(Integer id) throws DAOException;

	public List<T> findAll() throws DAOException;

	

}
