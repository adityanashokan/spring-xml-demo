package com.stackroute.domain;

public class Movie {
    private int movieId;
    private Actor actor;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getActorDetails(){
        return actor.getActorDetails();
    }
}
