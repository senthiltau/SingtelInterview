package com.singtel.interview.model;

public class Parrot extends Bird {

    private Animal friendAnimal;

    @Override
    public String fly() {
        return super.fly();
    }

    @Override
    public String sing() {
        return friendAnimal.sing();
    }

    public Animal getFriendAnimal() {
        return friendAnimal;
    }

    public void setFriendAnimal(Animal friendAnimal) {
        this.friendAnimal = friendAnimal;
    }
}
