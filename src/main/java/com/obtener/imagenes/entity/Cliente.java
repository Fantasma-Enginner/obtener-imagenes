package com.obtener.imagenes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	private Long lanecode;
	
	@NotNull
	@Column(name = "transactiondate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date transactiondate;
	
	@NotNull
	@Column(name = "transactiontime")
	@Temporal(TemporalType.TIME)
	@DateTimeFormat(pattern = " hh:mm:ss")
	private Date transactiontime;

	
	private String foto;
	


	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public Long getLanecode() {
		return lanecode;
	}

	public void setLanecode(Long lanecode) {
		this.lanecode = lanecode;
	}

	public Date getTransactiondate() {
		return transactiondate;
	}

	public void setTransactiondate(Date transactiondate) {
		this.transactiondate = transactiondate;
	}

	public Date getTransactiontime() {
		return transactiontime;
	}

	public void setTransactiontime(Date transactiontime) {
		this.transactiontime = transactiontime;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

}
