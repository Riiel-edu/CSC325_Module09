package Factories;

import Clothing.Pants;
import Clothing.Shoes;
import Clothing.Top;

public interface FashionFactory {

    Top pickTop();

    Pants pickPants();

    Shoes pickShoes();

}
