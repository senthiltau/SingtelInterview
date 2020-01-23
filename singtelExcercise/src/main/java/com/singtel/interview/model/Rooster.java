package com.singtel.interview.model;

import com.singtel.interview.Chicken;
import com.singtel.interview.model.enumeration.AnimalEnum;
import com.singtel.interview.model.enumeration.BirdSounds;
import com.singtel.interview.util.LanguageUtil;

public class Rooster extends Bird implements Chicken {

    public Rooster() {
        setCanFly(false);
    }

    @Override
    public String sing() {
        if(isSingInSecondLanguage()) {
            return LanguageUtil.getSoundBySecondLanguage(getSecondLanguage(), AnimalEnum.ROOSTER);
        }
        return BirdSounds.ROOSTER.getSound();
    }

    public String fly() {
        return null;
    }
}
