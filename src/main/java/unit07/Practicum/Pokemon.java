package unit07.Practicum;

public class Pokemon {
    private String name;
    private Pokemon_types type;
    private int level;
    public Pokemon(String name, Pokemon_types type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
    }

    public Pokemon(String name, Pokemon_types type) {
        this.name = name;
        this.type = type;
        this.level = 1;
    }

    public String getName() {
        return this.name;
    }

    public void changeName(String new_name) {
        this.name = new_name;
    }

    public Pokemon_types getType() {
        return this.type;
    }

    public int getLevel() {
        return this.level;
    }

    public void levelUp() {
        if(level < 100) {
            level++;
        }
    }

    @Override
    public String toString() {
        return "Pokemon{name=" + this.name + ", type=" + this.type + ", level=" + this.level + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pokemon) {
            Pokemon otherPokemon = (Pokemon)obj;
            return this.type == otherPokemon.getType() && this.level == otherPokemon.getLevel();        }
        else {
            return false;
        }
    }

    public static void main(String[] args) { //test code
        Pokemon pokemon1 = new Pokemon("Fishy", Pokemon_types.GRASS, 10);
        Pokemon pokemon2 = new Pokemon("Jeb", Pokemon_types.GRASS, 10);
        System.out.println(pokemon1.equals(pokemon2));
    }
}
