package by.epam.javatraining.yermalovich.task01.model.container;

import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrips;

public interface ActualOffers {

    void addTour(TouristTrips tour);
    void removeTour (TouristTrips tour);
    int numberOfTours ();

}
