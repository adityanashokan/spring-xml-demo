package com.stackroute.domain;

public class Movie {
    private Actor actor;

    public Movie(Actor actor){
        this.actor = actor;
    }

    public Movie() {
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display(){
        actor.display();
    }
}
