package MyPokemons;

import ru.ifmo.se.pokemon.*;

public class Tyrogue extends Pokemon {
    public Tyrogue (String name, int level){
        super(name,level);
        setStats (35.0d,35.0d,35.0d,35.0d,35.0d,35.0d);
        setType (Type.FIGHTING);
        setMove (new Rest(),new Swagger(),new Confide());
    }
    class Rest extends StatusMove{
        public Rest() {
            super(Type.PSYCHIC, 0.0d, 0.0d);
        }
        @Override
        protected void applySelfEffects(Pokemon p)
        {
            p.restore();
            Effect e = new Effect().turns(2).condition(Status.SLEEP);
            p.addEffect(e);
        }
        @Override
        protected boolean checkAccuracy(Pokemon att, Pokemon def){
            return true;
        }
        @Override
        protected java.lang.String describe(){
            return("атакаует Rest покемон спит 2 хода и полностью выздоравливает");}
    }
    class Swagger extends StatusMove{
        public Swagger(){
            super(Type.NORMAL, 0.0d, 85.0d);
        }

        @Override
        protected void applyOppEffects(Pokemon p)
        {
            Effect.confuse(p);
            Effect e = new Effect().turns(-1).stat(Stat.ATTACK, 2);
            p.addEffect(e);
        }
        @Override
        protected java.lang.String describe(){ return("Атакует Swagger увеличивает атаку и конфузит");    }
    }
    class Confide extends StatusMove{
        public Confide(){
            super(Type.NORMAL, 0.0d, 0.0d);
        }
        @Override
        protected void applyOppEffects(Pokemon p)
        {
            Effect e = new Effect().turns(-1).stat(Stat.SPECIAL_ATTACK , 1);
            p.addEffect(e);;
        }
        @Override
        protected boolean checkAccuracy(Pokemon att, Pokemon def){
            return true;
        }

        @Override
        protected java.lang.String describe(){
            return("атакует StatusMove Confide наностид дамаг, но увеличивает силу специальной атаки противника на 1 ");
        }
    }
}
