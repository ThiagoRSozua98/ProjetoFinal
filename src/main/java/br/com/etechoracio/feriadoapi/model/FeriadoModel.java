package br.com.etechoracio.feriadoapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.feriadoapi.enums.TipoFeriadoenum;

@Entity 
@Table(name="projferiado")
public class FeriadoModel {

	@Id
	@GeneratedValue
	@Column(name="id_feriado")
	private Long id;
	
	@GeneratedValue
	@Column (name="tipo_feriado")
	private TipoFeriadoenum tipoferiado;
	
	@Column (name="descricao_feriado")
	private String DescricaoFeriado;
	
	@Column (name="data_feriado")
	private Date DataFeriado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoFeriadoenum getTipoferiado() {
		return tipoferiado;
	}

	public void setTipoferiado(TipoFeriadoenum tipoferiado) {
		this.tipoferiado = tipoferiado;
	}

	public String getDescricaoFeriado() {
		return DescricaoFeriado;
	}

	public void setDescricaoFeriado(String descricaoFeriado) {
		DescricaoFeriado = descricaoFeriado;
	}

	public Date getDataFeriado() {
		return DataFeriado;
	}

	public void setDataFeriado(Date dataFeriado) {
		DataFeriado = dataFeriado;
	}
	
	
	
	
}
