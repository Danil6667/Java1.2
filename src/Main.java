public class Main {
        public static void main(String[] args) {

            Homeland homeland = new Homeland("Òóðåöêèé ");
            Homeland homeland1 = new Homeland("Òàøêåíñêèé ");
            Citrus citrus = new Citrus("Êèâè ", Color.GREEN, homeland,5);
            Lemon lemon = new Lemon("Ëèìîí ", Color.YELLOW, homeland1, 3, 120);
            Lemon lemon1 = new Lemon("Àïåëüñèí ", Color.RED, homeland,6,150 );


            System.out.println(citrus.printInfo());
            System.out.println(lemon.printInfo());
            System.out.println(lemon1.printInfo());

        }
    }


