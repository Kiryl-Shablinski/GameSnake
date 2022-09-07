package oop;

public class Adress {

    private  String street;
      private  String house;

    public Adress(String street, String house) {
        this.street = street;
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) return false;
        if (obj == this) return true;
        Adress adress = (Adress) obj;

        return adress.street.equals(this.street) && adress.house.equals(this.house);
    }
}
