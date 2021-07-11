public class Hund {
    String name;

    public static void main(String[] args){
        Hund hund1 = new Hund();
        hund1.bellen();
        hund1.name = "fred";

        Hund[] meineHunde = new Hund[3];
        meineHunde[0] = new Hund();
        meineHunde[1] = new Hund();
        meineHunde[2] = hund1;

        meineHunde[0].name = "Bert";
        meineHunde[1].name = "Holo";

        System.out.println("Der Name des letzten Hundes lautet " +meineHunde[2].name);

        int x = 0;
        while (x < meineHunde.length) {
            meineHunde[x].bellen();
            x++;
        }
    }
    public void bellen(){
        System.out.println(name + " WanWanWan");
    }

    public void essen(){

    }
    public void katzeJagen(){

    }
}
