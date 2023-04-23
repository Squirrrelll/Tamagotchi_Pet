package com.example.tamagotchi_pet;

public class Pet {
    // Переменные
    private String name;
    private String kind;
    private int time;
    private int food;
    private int water;
    private int sleep;
    private int happy;
    private int death;
    private int empty;
    private boolean wantfood;
    private boolean wantwater;
    private boolean wantbehappy;
    private boolean wantsleep;

    // Геттеры

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public int getFood() { return food; }

    public int getWater() { return water; }

    public int getSleep() { return sleep; }

    public int getHappy() { return happy; }

    public int getDeath() { return death; }
    // Сеттеры
    public void setName(String new_name) {
        name=new_name;
    }

    public void setKind(String new_kind) {
        kind=new_kind;
    }

    public void setFood(int new_food) { food=new_food; }

    public void setWater(int new_water) { water=new_water; }

    public void setSleep(int new_sleep) { sleep=new_sleep; }

    public void setHappy(int new_happy) { happy=new_happy; }

    public void setDeath(int new_death) { death=new_death; }
    // Конструктор класса питомца
    public Pet(String newName, String NewKind) {
        name = newName;
        kind = NewKind;
        time= 0;
        food = 61;
        water = 61;
        happy = 61;
        sleep=61;
        death = 0;
        empty =0;
        wantfood =false;
        wantwater = false;
        wantbehappy = false;
        wantsleep = false;
    }
    // Обновление показателей
    // TODO: отрегулировать изменение характеристик
    public void updateFood(int f) {

        if (food + f > 100) {
            food = 100;
            if (wantfood) wantfood = false;

        } else if (food + f <= 0) {
            food = 0;
            if (!wantfood) wantfood = true;

        } else {
            food += f;
            if (wantfood) wantfood = false;

        }
    }


    public void updateWater(int w) {
        if (water + w > 100) {
            water = 100;
            if (wantwater) wantwater=false;
        } else if (water + w <= 0) {
            water = 0;
            if (!wantwater) wantwater=true;
        } else {
            water += w;
            if (wantwater) wantwater=false;

        }

    }

    public void updateHappy(int h) {
        if (happy + h > 100){
            happy = 100;
            if (wantbehappy) wantbehappy=false;
        } else if (happy + h <= 0) {
            happy = 0;
            if (!wantbehappy) wantbehappy=true;
        } else{ happy += h;
            if (wantbehappy) wantbehappy=false;
        }
    }

    public void updateSleep (long s) {
        if (sleep + s > 100) {
            sleep = 100;
            if (wantsleep) wantsleep=false;
        } else if (sleep + s <= 0) {
            sleep = 0;
            if (!wantsleep)
                wantsleep = true;
        }
        else{ sleep += s;
            if (wantsleep)
                wantsleep=false;}

    }

    public void updateDeath(int d) {
        if (death + d > 100) {
            death = 100;
        } else if (death + d <= 0) {
            death = 0;
        } else {
            death += d;
        }
    }

}
