package fr.treeptik.service;

import java.util.List;

import org.hibernate.service.spi.ServiceException;

import fr.treeptik.model.Personne;

public interface PersonneService {

	Personne save(Personne personne) throws ServiceException;

	Personne update(Personne personne) throws ServiceException;

	void remove(Personne personne) throws ServiceException;

	Personne findById(Integer id) throws ServiceException;

	List<Personne> findAll() throws ServiceException;
	
}
