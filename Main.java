import MyPokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Corsola p1 = new Corsola("Корсола", 50);
        Tyrogue p2 = new Tyrogue("Тирогуе", 1);
        NidoranM p3 = new NidoranM("НидоранM",1);
        Hitmontop p4 = new Hitmontop("Хитмонтоп", 20);
        Nidorino p5 = new Nidorino("Нидорино", 50);
        Nidoking p6 = new Nidoking("Нидоринкинг", 50);
        b.addFoe(p3);
        b.addAlly(p1);
        b.addFoe(p5);
        b.addFoe(p6);
        b.addAlly(p4);
        b.addAlly(p2);
        b.go();
    }
}