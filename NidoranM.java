package MyPokemons;
import ru.ifmo.se.pokemon.*;

public class NidoranM extends Pokemon{
    public NidoranM(String name,int level){
        super(name,level);
        setStats(46.0d,57.0d,40.0d,40.0d,40.0d,50.0d);
        setType(Type.POISON);
        setMove(new PoisonSting(), new Thunder());


    }
    class Thunder extends SpecialMove{
        public Thunder(){
            super(Type.ELECTRIC, 110.0d,70.0d);
        }
        @Override
        protected void applyOppEffects(Pokemon p)
        {
            Effect e = new Effect().chance(0.3).condition(Status.PARALYZE);
            p.addEffect(e);
        }
        @Override
        protected java.lang.String describe(){
            return ("атакует Thunder наносит дамаг и с вероятностью 30% парализует противника");
        }
    }
    class PoisonSting extends PhysicalMove {
        public PoisonSting()
        {
            super(Type.POISON, 15.0d,100.0d);
        }
        @Override
        protected void applyOppEffects(Pokemon p)
        {
            Effect e = new Effect().chance(0.3).condition(Status.POISON);
            p.addEffect(e);
        }
        @Override
        protected java.lang.String describe(){
            return ("атакует PoisonSting наносит дамаг и с вероятностью 30% отравляет противника");
        }
    }

}