package MyPokemons;
import ru.ifmo.se.pokemon.*;

public class Hitmontop extends Tyrogue{
    public Hitmontop(String name,int level){
        super(name, level);
        setStats(50.0d,95.0d,95.0d,35.0d,110.0d,70.0d);
        setMove(new QuickAttack(),new Rest(),new Swagger(),new Confide());

    }
    class QuickAttack extends PhysicalMove {
        public QuickAttack(){
            super(Type.NORMAL, 40.0d, 100.0d);
        }
        protected int priority = super.priority + 1;
        @Override
        protected java.lang.String describe(){
            return("атака QuickAttack приоритет атаки +1");
        }
    }

}
