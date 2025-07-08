package Factories;

import Clothing.*;

public class CasualFactory implements FashionFactory {

    @Override
    public Top pickTop() {
        return new CasualShirt();
    }

    @Override
    public Pants pickPants() {
        return new CasualPants();
    }

    @Override
    public Shoes pickShoes() {
        return new CasualShoes();
    }

}
