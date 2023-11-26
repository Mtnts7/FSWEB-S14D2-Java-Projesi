import tr.com.wokintech.model.*;
import tr.com.wokintech.model.enums.Lamptype;
import tr.com.wokintech.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

    Room bedroom = new Bedroom("yatak odası",
                      new Wall("doğu"),
                      new Wall("batı"),
                      new Wall("kuzey"),
                      new Wall("güney"),
                      new Ceiling(275, PaintColor.BLUE),
                      new Lamp(20,true, Lamptype.TABLE,false),
                      new Carpet(100,150,PaintColor.RED),
                      new Bed("çift kişilik",2,80,1,1),
                      new Wardrobe(150,120,10.5));

    bedroom.getCarpet().lying();
    bedroom.getCeiling().create();
    bedroom.getLamp().status();
    bedroom.getLamp().toggle();
    bedroom.getLamp().status();

    }
}