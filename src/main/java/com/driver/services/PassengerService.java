package com.driver.services;


import com.driver.model.Passenger;
import com.driver.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    public Integer addPassenger(Passenger passenger){
        //Add the passenger Object in the passengerDb and return the passengerId that has been generated
       // Passenger updatedPassenger = passengerRepository.save(passenger);

        passengerRepository.save(passenger);

        //return updatedPassenger.getPassengerId();



        return  passenger.getPassengerId();
    }

}
