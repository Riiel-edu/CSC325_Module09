package Factories;

import Clothing.*;

public class ProfessionalFactory implements FashionFactory {

    @Override
    public Top pickTop() {
        return new DressShirt();
    }

    @Override
    public Pants pickPants() {
        return new DressPants();
    }

    @Override
    public Shoes pickShoes() {
        return new DressShoes();
    }

}
