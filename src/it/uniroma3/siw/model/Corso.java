package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Corso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private LocalDate dataInizio;
	
	private Period durata;
	
	/*Questa associazione la lascio con tipo di fetch pari a lazy perche' sarebbe troppo costoso
	 * prendere tutti gli studenti ogni volta che cerco un corso, non e' detto che sia un'informazione che mi serve*/
	@ManyToMany
	private List<Allievo> studenti;
	
	@ManyToOne
	private Docente professore;
	

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

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public Period getDurata() {
		return durata;
	}

	public void setDurata(Period durata) {
		this.durata = durata;
	}

	public List<Allievo> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Allievo> studenti) {
		this.studenti = studenti;
	}

	public Docente getProfessore() {
		return professore;
	}

	public void setProfessore(Docente professore) {
		this.professore = professore;
	}
	

}
