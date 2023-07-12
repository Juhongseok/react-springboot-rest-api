package com.jhs.rentbook.service;

import com.jhs.rentbook.domain.UserBookRental;

import java.util.List;

public interface BookRentalService {

    List<UserBookRental> findAllRentalInfo();

    Long returnBook(UserBookRental rental);

}