package main;

import java.util.Scanner;

import entities.Articolo;

public class Main 
{

	public static void main(String[] args) 
	{
		//Creare un main che vi richieda di inizializzare un array di 3 articoli inserendo codice, descrizione 
		//e quantità da tastiera. L'id andrà invece assegnato dal programma
		//utilizzando un contatore (l'id deve essere pari all'indice dell'articolo nell'array + 1);
		
		Articolo[] articoli = new Articolo[3];
		int cont = 0;
		int posizione = 0;
		String codice;
		String descrizione;
		int quantita;
		int max = Integer.MIN_VALUE;
		Scanner tastiera = new Scanner(System.in);
		
		while(cont < 3)
		{
			System.out.println("Inserisci il codice dell'articolo " + (cont + 1));
			codice = tastiera.nextLine();
			
			System.out.println("Inserisci la descrizione dell'articolo " + (cont + 1));
			descrizione = tastiera.nextLine();
			
			System.out.println("Inserisci la quantità dell'articolo " + (cont + 1));
			quantita = Integer.parseInt(tastiera.nextLine());
			
			Articolo a = new Articolo();
			a.setId(cont+1);
			a.setCodice(codice);
			a.setDescrizione(descrizione);
			a.setQuantita(quantita);
			articoli[cont] = a;
			cont++;
		}
		
		//Una volta fatto il programma dovrà stampare a video tutti gli attributi 
		//(id, codice, descrizione e quantità) dell'articolo con quantità MAGGIORE.
		
		for(int i = 0; i < articoli.length; i++)
		{
			if(articoli[i].getQuantita() > max)
			{
				max = articoli[i].getQuantita();
				posizione = i;	
			}
		}
		
		System.out.println("Articolo con la quantità maggiore: \n" 						   +
						   "Id:" 			+ articoli[posizione].getId() 			+ "\n" + 
						   "Codice: " 		+ articoli[posizione].getCodice() 		+ "\n" +
						   "Descrizione: " 	+ articoli[posizione].getDescrizione() 	+ "\n" +
						   "Quantità: " 	+ articoli[posizione].getQuantita() 	+ "\n");
		tastiera.close();
	}

}
