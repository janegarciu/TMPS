import FactoryCreator.AbstractFactory;
import FactoryCreator.FactoryCreator;
import HumanBuilder.Human;
import HumanBuilder.HumanBuilder;
import HumanBuilder.HumanType;
import FactoryCreator.HumanTypeSpecifications;

public class Main {
    public static void main(String[] args) {
        Human prototype = AbstractFactory.getPrototype(HumanType.European);
        if (prototype != null) {
            System.out.println("Prototype found!");
            prototype.setEyeColor("blue");
            prototype.setHairColor("blond");
            System.out.println(prototype.toString());
        }
        FactoryCreator creator = FactoryCreator.getInstance();
        AbstractFactory humanFactory = creator.getHumanTypeBuilder(HumanType.African);
        HumanBuilder humanBuilder = humanFactory.getHumanBuilder(HumanTypeSpecifications.negroidBrownEyes);
        humanBuilder .specifySkinColor("dark");
        humanBuilder .specifyHairColor("brunette");
        humanBuilder .returnHumanDescription();
        System.out.println(humanBuilder .getHuman().toString());

    }
}
