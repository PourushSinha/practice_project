package com.pourush.parkinglot.models.parkingspot;

import com.pourush.parkinglot.constants.CommonConstants;

/**
 * Created by pourush.sinha on 25/03/19.
 */
public class HandicappedSpot extends ParkingSpot {

    public HandicappedSpot(){
        super(CommonConstants.parkingSpotType.HANDICAPPED);
    }
}
