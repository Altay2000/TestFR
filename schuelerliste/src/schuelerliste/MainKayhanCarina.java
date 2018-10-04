package schuelerliste;

import java.util.Random;



public class MainKayhanCarina {

	public static void main(String[] args) {
    
	schlangenaufgabe();
	}
public static void listenaufgabe()
	{
	List<Integer> liste = new List<Integer>();
	listeFüllen(liste);
	listeAusgeben(liste);
	}

public static void listeFüllen(List<Integer> liste)
{
	Random r=new Random();
	for (int i=0;i<10;i++)
	{
	int n = r.nextInt(100);
	liste.append(n);
	
	}
}
public static void listeAusgeben(List<Integer> liste) {

	liste.toFirst();
	while(liste.hasAccess()) {
	
	System.out.println(liste.getContent());
	liste.next();
	}
}
public static void schlangenaufgabe() {
	Queue<Patient> schlange = new Queue<Patient>();
	schlangeFüllen(schlange);
	schlangeAusgeben(schlange);
}
public static void schlangeFüllen(Queue<Patient> schlange) {

	Patient eins = new Patient();
	Patient zwei = new Patient();
	Patient drei = new Patient();
	Patient vier = new Patient();
	Patient fuenf = new Patient();
    eins.setName("Frodo Beutlin");
    zwei.setName("Tom Marvolo Riddle");
    drei.setName("Geralt von Riva");
    vier.setName("Anakin Skywalker");
    fuenf.setName("John Little");
    
  
    
	schlange.enqueue(eins);
	schlange.enqueue(zwei);
	schlange.enqueue(drei);
	schlange.enqueue(vier);
	schlange.enqueue(fuenf);
}
public static void schlangeAusgeben(Queue<Patient> schlange){
while(!schlange.isEmpty()){
	Patient a = schlange.front();
	System.out.println(a.getName());
	schlange.dequeue();
}}
}
