package tr.com.wokintech.model;

public class Bedroom extends Room{

    private Bed bed;
    private Wardrobe wardrobe;


    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, Carpet carpet, Bed bed, Wardrobe wardrobe) {
        super(name, wall1, wall2, wall3, wall4, ceiling, lamp, carpet);
        this.bed = bed;
        this.wardrobe = wardrobe;
    }

    public Bed getBed() {
        return bed;
    }


    public Wardrobe getWardrobe() {
        return wardrobe;
    }

}
