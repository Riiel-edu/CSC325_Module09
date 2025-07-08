package Factories;

import Clothing.*;

public class PartyFactory implements FashionFactory {

    @Override
    public Top pickTop() {
        return new PartyShirt();
    }

    @Override
    public Pants pickPants() {
        return new PartyPants();
    }

    @Override
    public Shoes pickShoes() {
        return new PartyShoes();
    }

}
