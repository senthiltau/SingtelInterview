package com.singtel.interview.model;

import com.singtel.interview.Chicken;
import com.singtel.interview.model.enumeration.AnimalEnum;
import com.singtel.interview.util.LanguageUtil;

public class Rooster extends Bird implements Chicken {

    public Rooster() {
        setCanFly(false);
    }

    @Override
    public String sing() {
        return LanguageUtil.getSoundBySecondLanguage(getSecondLanguage(), AnimalEnum.ROOSTER);
    }

    public String fly() {
        return null;
    }
}
