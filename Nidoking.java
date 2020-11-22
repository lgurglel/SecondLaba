package MyPokemons;
import ru.ifmo.se.pokemon.*;

public class Nidoking extends Nidorino {
    public Nidoking(String name,int level){
        super(name, level);
        setStats(81.0d,102.0d,77.0d,85.0d,75.0d,85.0d);
        setMove(new DoubleKick(),new Flatter(), new PoisonSting(), new Thunder());
        setType(Type.POISON,Type.GROUND);
    }
    class DoubleKick extends PhysicalMove{
        public DoubleKick(){
            super(Type.FIGHTING,30.0d,100.0d,0,2);
        }

        @Override
        protected java.lang.String describe(){
            return ("атакует Double Kick ");
        }
    }
}
