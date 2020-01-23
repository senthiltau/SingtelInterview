package com.singtel.interview.model;

import com.singtel.interview.model.enumeration.AnimalEnum;
import com.singtel.interview.model.enumeration.Language;
import com.singtel.interview.util.LanguageUtil;

public class Animal {

    private boolean canFly = false;
    private boolean canWalk = true;
    private boolean canSing = true;
    private boolean canSwim = false;
    private Language secondLanguage;

    public Language getSecondLanguage() {
        return secondLanguage;
    }

    public void setSecondLanguage(Language secondLanguage) {
        this.secondLanguage = secondLanguage;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanSing() {
        return canSing;
    }

    public void setCanSing(boolean canSing) {
        this.canSing = canSing;
    }

    public boolean isCanWalk() {
        return canWalk;
    }

    public void setCanWalk(boolean canWalk) {
        this.canWalk = canWalk;
    }

    public String walk() {
        return "I am walking";
    }

    public String sing() {
        return LanguageUtil.getSoundBySecondLanguage(getSecondLanguage(), AnimalEnum.DEFAULT);
    }

    public String fly() {
        return "I don't fly";
    }
}
