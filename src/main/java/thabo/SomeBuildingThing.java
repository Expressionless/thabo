package thabo;

public class SomeBuildingThing {
    
    private Name name;

    public SomeBuildingThing() {
        this(null);
    }

    public SomeBuildingThing(String tag) {
        if(tag != null)
            this.name = new Name(tag);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " -> " + name.tag;
    }

    private class Name {
        private String tag;

        public Name(String tag) {
            this.tag = tag;
        }
    }
}
