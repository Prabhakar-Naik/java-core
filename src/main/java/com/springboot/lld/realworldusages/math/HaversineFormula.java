package com.springboot.lld.realworldusages.math;

/**
 * @author prabhakar, @Date 14-07-2025
 */

public class HaversineFormula {

    // Radius of sphere on which the points are, in this case Earth.
    private static final double SPHERE_RADIUS_IN_KM = 6372.8;

    /**
     * Haversine formula for calculating distance between two latitude, longitude points.
     *
     * @param latA  Latitude of point A
     * @param longA Longitude of point A
     * @param latB  Latitude of point B
     * @param longB Longitude of point B
     * @return the distance between the two points.
     */

    public static double findHaversineDistance(double latA, double longA, double latB, double longB) {
        if (isValidLatitude(latA) || isValidLatitude(latB)
                || isValidLongitude(longA) || isValidLongitude(longB))
            throw new IllegalArgumentException();

        // Calculate the latitude and longitude differences
        var latitudeDiff = Math.toRadians(latB - latA);
        var longitudeDiff = Math.toRadians(longB - longA);

        var latitudeA = Math.toRadians(latA);
        var latitudeB = Math.toRadians(latB);

        // Calculating the distance as per haversine formula
        var value = Math.pow(Math.sin(latitudeDiff / 2), 2)
                + Math.pow(Math.sin(longitudeDiff / 2), 2) * Math.cos(latitudeA) * Math.cos(latitudeB);
        var result = 2 * Math.asin(Math.sqrt(value));
        return SPHERE_RADIUS_IN_KM * result;
    }


    // Check for valid latitude value
    private static boolean isValidLatitude(double latitude) {
        return !(latitude >= -90) || !(latitude <= 90);
    }

    // Check for valid longitude value
    private static boolean isValidLongitude(double longitude) {
        return !(longitude >= -180) || !(longitude <= 180);
    }

    /**
     * Tests for {@link HaversineFormula#findHaversineDistance(double, double, double,
     * double)}.
     */

//    @Test
//    void testFindHaversineDistance() {
//        var distance1 = HaversineFormula
//                .findHaversineDistance(28.7041, 77.1025, 30.9661, 76.5231);
//        assertEquals(257.7, distance1, 0.1);
//
//        var distance2 = HaversineFormula
//                .findHaversineDistance(
//                        -17.947826, 177.221232, -16.603513, -179.779055
//                );
//        assertEquals(351.9, distance2, 0.1);
//    }


    // Test for out of range inputs, as latitudes should be in range [-90,90] and longitudes in
    // [-180,180]
    
//    @Test
//    void testFindHaversineDistanceInvalidRange() {
//        Assertions.assertThrows(IllegalArgumentException.class,
//                () -> {
//                    HaversineFormula.findHaversineDistance(666, 0, 0, 0);
//                });
//    }

}
