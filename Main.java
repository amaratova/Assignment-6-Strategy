package com.assign6strategy;

public class Main {

    public static void main(String[] args) {
	    Strategy str = new GameStrategy();
	    Pegasus pegasus = new Pegasus(str);
	    pegasus.movement();

	    Trolls troll = new Trolls(str);
	    troll.movement();

	    Elves elf = new Elves(str);
	    elf.movement();

	    Nymph nymph = new Nymph(str);
	    nymph.movement();

	    Vampire vampire = new Vampire(str);
	    vampire.movement();

	    Orcs orc = new Orcs(str);
	    orc.movement();

    }
}
