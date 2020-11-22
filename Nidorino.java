package MyPokemons;
import ru.ifmo.se.pokemon.*;

public class Nidorino extends NidoranM {
    public Nidorino (String name, int level){
        super(name,level);
        setStats(61.0d,72.0d,57.0d,55.0d,55.0d,65.0d);
        setMove(new Flatter(), new PoisonSting(), new Thunder());
    }
    class Flatter extends StatusMove{
        public Flatter(){
            super(Type.DARK,0.0d,100.0d);
        }
        @Override
        protected void applyOppEffects(Pokemon p)
        {
            Effect.confuse(p);
            Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 2);
            p.addEffect(e);
        }
        @Override
        protected java.lang.String describe(){
            return ("Атакует Flatter вводит противника в конфуз, но увеличивает его специальную атаку на 2 позиции");
        }

    }

}
