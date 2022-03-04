package com.company;

public class Main {

            public static void main(String[] args) {

                Lamp bedroomLamp = new Lamp();

                System.out.println("The bedroom lamp is currently set to " + bedroomLamp.getPower());

                bedroomLamp.switchOn();

                System.out.println("The bedroom lamp is currently set to " + bedroomLamp.getPower());

                bedroomLamp.brighten();
                bedroomLamp.brighten();
                bedroomLamp.brighten();

                System.out.println("The bedroom lamp is currently set to a brighteness of " + bedroomLamp.getBrightness());

                TV frontRoom = new TV();

                System.out.println("The TV in the front room is currently set to " + frontRoom.getPower());

                frontRoom.turnUp();

                System.out.println("The TV in the front room volume is currently set to " + frontRoom.getVolume());

                radio kitchenRadio = new radio();
                System.out.println("The kitchen radio is currently set to " + kitchenRadio.getPower());

                kitchenRadio.switchOn();

                System.out.println("The kitchen radio is currently set to " + kitchenRadio.getPower());
            }
        }
        class Device{
            int power;

            Device()
            {
                power = 0;
            }

            int getPower()
            {
                return power;
            }

            void switchOn()
            {
                power = 1;
            }

            void switchOff()
            {
                power = 0;
            }

        }

        class Lamp extends Device{

            int brightness;

            Lamp()
            {
                super();
                brightness = 0;
            }

            int getBrightness(){
                return brightness;
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

        class TV extends Device{

            int channel = 0;
            int volume = 0;

            TV(){
                super();
                channel = 0;
                volume = 0;
            }

            int getChannel()
            {
                return channel;
            }

            int getVolume()
            {
                return volume;
            }

            void turnUp()
            {
                volume = volume + 5;
            }

            void turnDown()
            {
                volume = volume - 5;
            }

            void channelUp()
            {
                channel = channel + 1;
            }

            void channelDown()
            {
                channel = channel - 1;
            }

        }

class radio extends Device{

    int frequency;
    int volume;

    radio()
    {
        super();
        frequency = 1;
        volume = 1;
    }

    int getFrequency(){
        return frequency;
    }
    int getVolume() {
        return volume;

    }
    void volumeup()
    {
        volume = volume + 1;
    }

    void volumedown()
    {
        volume = volume - 1;
    }

    void frequencyup()
    {
        frequency = frequency + 1;
    }

    void frequencydown()
    {
        frequency = frequency - 1;
    }
}


