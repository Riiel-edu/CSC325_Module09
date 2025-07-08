import Clothing.Top;
import Factories.CasualFactory;
import Factories.PartyFactory;
import Factories.ProfessionalFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        ProfessionalFactory professionalFactory = new ProfessionalFactory();
        CasualFactory casualFactory = new CasualFactory();
        PartyFactory partyFactory = new PartyFactory();

        //Testing that each Factory creates the correct clothing parts
        System.out.println("Professional Factory\n--------------------------------");
        professionalFactory.pickTop().wearTop();
        professionalFactory.pickPants().wearPants();
        professionalFactory.pickShoes().wearShoes();
        System.out.println("--------------------------------\nFinished Professional Clothing\n");

        System.out.println("Casual Factory\n--------------------------------");
        casualFactory.pickTop().wearTop();
        casualFactory.pickPants().wearPants();
        casualFactory.pickShoes().wearShoes();
        System.out.println("--------------------------------\nFinished Casual Clothing\n");

        System.out.println("Party Factory\n--------------------------------");
        partyFactory.pickTop().wearTop();
        partyFactory.pickPants().wearPants();
        partyFactory.pickShoes().wearShoes();
        System.out.println("--------------------------------\nFinished Party Clothing\n");

    }
}