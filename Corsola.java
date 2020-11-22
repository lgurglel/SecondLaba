package MyPokemons;
import ru.ifmo.se.pokemon.*;

public class Corsola extends Pokemon {
    public Corsola (String name, int level){
        super(name,level);
        setStats (65.0,55.0,95.0,65.0,95.0,35.0);
        setType (Type.WATER, Type.ROCK);
        setMove (new Boulldoze(),new Refresh(),new Psychic(),new ConfuseRay());
    }
    class Boulldoze extends PhysicalMove{
        public Boulldoze(){
            super(Type.GROUND,60,100);
        }

        @Override
        protected void applyOppEffects(Pokemon p){
            if (p.getStat(Stat.SPEED) > -6 ) {
                p.setMod(Stat.SPEED,  -1);
            }

        }
        @Override
        protected java.lang.String describe() {
            return ("Атакует Bulldoze наносит домаг и уменьшает скорость противника на 1");
        }

    }
    class Refresh extends StatusMove{
        public Refresh(){
            super(Type.NORMAL,0.0d,0.0d);
        }
        @Override
        protected void applySelfEffects(Pokemon p)
        {
            Status cond = p.getCondition();
            if (cond == Status.BURN ||cond == Status.PARALYZE ||cond == Status.POISON) {
                Effect e = new Effect();
                e.condition(Status.NORMAL);
                p.setCondition(e);
            }
        }
        @Override
        protected java.lang.String describe(){
            return("Атакует Refresh избавляется от эффектов горения, отравления и паралича");
        }
    }
    class Psychic extends SpecialMove {
        public Psychic(){super(Type.PSYCHIC,90.0d,100.0d);}
        @Override
        protected void applyOppEffects(Pokemon p)
        {
            Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
            p.addEffect(e);
        }

        @Override
        protected java.lang.String describe(){
            return ("Атакует Psychic и снижает специальную защиту противника на 1 стадию");
        }
    }
    class ConfuseRay extends StatusMove{
        public ConfuseRay(){
            super(Type.GHOST, 0.0d, 100.0d);
        }

        @Override
        protected void applyOppEffects(Pokemon p)
        {
            Effect.confuse(p);
        }
        @Override
        protected java.lang.String describe(){
            return("Атакует Confuse Ray вводит противника в конфуз");
        }
    }
}