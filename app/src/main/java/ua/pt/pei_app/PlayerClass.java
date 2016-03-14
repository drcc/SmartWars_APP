package ua.pt.pei_app;

/**
 * Created by drcc on 14/03/16.
 */
public class PlayerClass {
    int heartRate;
    double lat;
    double lng;

    public PlayerClass() {
        // empty default constructor, necessary for Firebase to be able to deserialize blog posts
    }

    public int getHeartRate() {
        return heartRate;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

}
