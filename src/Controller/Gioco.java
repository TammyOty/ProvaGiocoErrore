package Controller;

import modello.Combattimento;
import modello.Guerriero;
import modello.Comabts;

import java.util.Random;
import java.util.Scanner;

public class Gioco {
    public static void main(String[] args) throws InterruptedException {
    Guerriero orco = new Guerriero("Orco", 350, 55, 50 , 25);

    Guerriero umano = new Guerriero("Umano", 300, 40, 40 , 45);

    Guerriero elfo = new Guerriero("Elfo",350, 50, 45 , 50);

    Guerriero troll = new Guerriero("Troll", 350, 60, 55 , 25);

    Guerriero licantropo = new Guerriero("Licantropo", 300, 60, 45 , 55);

    Guerriero nano = new Guerriero("Nano", 350, 45, 60 , 25);

    Comabts c = new Comabts();

   /* int attacco = c.attacco(orco) - c.difesa(licantropo);
        System.out.println(licantropo.getVita() - attacco);
//lancia un dado, risultato da uno a 100 differenza saranno i punti sottratti vita


    */

        Scanner sc = new Scanner(System.in);
        String comando = "";
        String risposta = "";

        do {
            System.out.println("inserisci comando: ");
            comando = sc.nextLine();

            switch (comando){
                case "combattimento":
                    risposta = "inizia combattimento";
                    break;
                case "aiuto":
                     risposta = "inserisci combattimento se vuoi combattere oppure inserisci esci per uscire";
                     break;
                case "esci":
                    risposta = "Alla prossima volta Guerriero!";
                      break;
                default:
                     risposta = "comando errato riprova";
                     break;
            }

            System.out.println(risposta);

            if (comando.equalsIgnoreCase("Combattimento")){
                System.out.println("Scegli la razza: Orco, Umano, Elfo, Troll, Licantropo, Nano ");
                String razza = sc.nextLine();
                Guerriero giocatore = null;
                Guerriero nemico = null;

                switch (razza){
                    case "Orco":
                        giocatore = orco;
                        break;
                    case "Umano":
                        giocatore = umano;
                        break;
                    case "Elfo":
                        giocatore = elfo;
                        break;
                    case "Troll":
                        giocatore = troll;
                        break;
                    case "Licantropo":
                        giocatore = licantropo;
                        break;
                    case "Nano":
                        giocatore = nano;
                        break;
                    case "aiuto":
                        System.out.println("Devi scegliere una razza per proseguire");
                        break;
                    default:
                        System.out.println("La razza inserita non esiste");
                        break;
                }

                Random dado = new Random();

                int numeroNemico = dado.nextInt(6); //lo trasformiamo in int per non aver la virgola, 6 numero nemici

                switch (numeroNemico){
                    case 1:
                        nemico = orco;
                        break;
                    case 2:
                        nemico = umano;
                        break;
                    case 3:
                        nemico = elfo;
                        break;
                    case 4:
                        nemico = troll;
                        break;
                    case 5:
                        nemico = licantropo;
                        break;
                    case 6:
                        nemico = nano;
                        break;
                }
                System.out.println(giocatore.getSpecie() + " VS " + nemico.getSpecie());

                int vitaGiocatore = giocatore.getVita();
                int vitaNemico = nemico.getVita();

                while (vitaGiocatore > 0 && vitaNemico > 0){ //se una è falsa il gioco si ferma, quindi se è 0 o minore termina fight
                    System.out.println(vitaGiocatore + vitaNemico);

                    if (c.velocita(giocatore) > c.velocita(nemico));{

                         int attac = c.attacco(giocatore) - c.difesa(nemico);
                        System.out.println(attac);

                        if (attac > 0){

                            vitaNemico -= attac;

                            System.out.println(giocatore.getSpecie() + attac);
                            System.out.println(nemico.getSpecie() + vitaNemico);

                        } else {

                            System.out.println(nemico.getSpecie());
                        }

                    } else if (c.velocita(nemico) > c.velocita(giocatore)) {
                        int attac = c.attacco(nemico) - c.difesa(giocatore);
                        System.out.println(attac);

                        if (attac>0){
                            vitaGiocatore -= attac;

                            System.out.println(nemico.getSpecie() + attac);
                            System.out.println(giocatore.getSpecie() + vitaGiocatore);
                        }
                    }
                    else {

                        System.out.println("Colpi falliti");
                    }
                    Thread.sleep(2000);
                }
                if(vitaGiocatore > 0) {
                    System.out.println("Hai vinto guerriero " + vitaGiocatore);

                } else {

                    System.out.println("Sei solo un perdente " + vitaGiocatore);

                }
            }


        } while (!comando.equalsIgnoreCase("esci"));

    }

}
