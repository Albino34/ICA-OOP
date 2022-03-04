class Main {
    public static void main(String[] args) {

        Lamp bedroomLamp = new Lamp();

        System.out.println("The bedroom lamp is currently set to " + bedroomLamp.getPower());

        bedroomLamp.switchOn();

        System.out.println("The bedroom lamp is currently set to " + bedroomLamp.getPower());

        bedroomLamp.brighten();
        bedroomLamp.brighten();
        bedroomLamp.brighten();

        System.out.println("The bedroom lamp is currently set to a brighteness of " + bedroomLamp.getBrightness());

    }
}

class Lamp{
    int power;
    int brightness;

    Lamp()
    {
        power = 0;
        brightness = 0;
    }

    int getPower()
    {
        return power;
    }

    int getBrightness(){
        return brightness;
    }

    void switchOn()
    {
        power = 1;
    }

    void switchOff()
    {
        power = 0;
    }

    void brighten()
    {
        brightness = brightness + 10;
    }

    void dim()
    {
        brightness = brightness - 10;
    }
}

