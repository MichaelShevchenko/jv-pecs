package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();

        bulldozers.add(new Bulldozer());
        bulldozers.add(new Bulldozer());
        bulldozers.add(new Bulldozer());
        /*bulldozers.add(new Bulldozer("fast", "Yellow"));
        bulldozers.add(new Bulldozer("old", "Black"));
        bulldozers.add(new Bulldozer("compact", "Red"));*/
        return bulldozers;

    }
}
