package entities;

//Creare una classe Articolo (con variabili private e relativi metodi get e set per ogni attributo) 
//strutturata nel seguente modo:

public class Articolo 
{
	private int id;
	private String codice;
	private String descrizione;
	private int quantita;

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getCodice() 
	{
		return codice;
	}

	public void setCodice(String codice) 
	{
		this.codice = codice;
	}

	public String getDescrizione() 
	{
		return descrizione;
	}

	public void setDescrizione(String descrizione) 
	{
		this.descrizione = descrizione;
	}

	public int getQuantita() 
	{
		return quantita;
	}

	public void setQuantita(int quantita) 
	{
		this.quantita = quantita;
	}
	
	
	
	


}
