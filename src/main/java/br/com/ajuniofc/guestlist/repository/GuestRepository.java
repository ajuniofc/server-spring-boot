package br.com.ajuniofc.guestlist.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.ajuniofc.guestlist.model.Guest;

public interface GuestRepository extends CrudRepository<Guest, Long>{

}
