package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Allievo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String cognome;
	
	private LocalDate dataNascita;
	
	private String luogoNascita;
	
	@Column(unique=true)
	private String matricola;
	
	private String email;
	
	@ManyToOne
	private Societa societa;
	
	/*Ho posto il tipo di fetch per l'associazione da allievo a corso pari a eager perche' quando 
	 * cerco uno studente molto probabilmente mi interessa sapere quali corsi segue */
	@ManyToMany(mappedBy = "studenti", fetch = FetchType.EAGER)
	private List<Corso> corsiSeguiti;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Societa getSocieta() {
		return societa;
	}

	public void setSocieta(Societa societa) {
		this.societa = societa;
	}

	public List<Corso> getCorsiSeguiti() {
		return corsiSeguiti;
	}

	public void setCorsiSeguiti(List<Corso> corsiSeguiti) {
		this.corsiSeguiti = corsiSeguiti;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
}
