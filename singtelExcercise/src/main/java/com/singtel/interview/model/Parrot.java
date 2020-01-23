package com.singtel.interview.model;

import com.singtel.interview.model.enumeration.Languages;

public class Parrot extends Bird {

    private Animal friendAnimal;

    @Override
    public String fly() {
        return super.fly();
    }

    @Override
    public String sing(Languages language) {
        return friendAnimal.sing(language);
    }

    public Animal getFriendAnimal() {
        return friendAnimal;
    }

    public void setFriendAnimal(Animal friendAnimal) {
        this.friendAnimal = friendAnimal;
    }
}
