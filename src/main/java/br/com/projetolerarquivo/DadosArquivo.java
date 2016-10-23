package br.com.projetolerarquivo;

import java.util.ArrayList;
import java.util.List;

public class DadosArquivo {
	private String nome;
	private String quantidadePropostas;
	private String codigoBem;
	private String dataInicioObra;
	private String dataFimObra;
	private String diaBase;
	private String tipoTerreno;
	private String qtdContrapartida;
	private String qtdCaucao;
	private String valoresDespesasDiversas;
	private String percentuais;
	private List<String> listaValoresDespesasDiversas = new ArrayList<String>();
	private List<String> listaPercentuais = new ArrayList<String>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQuantidadePropostas() {
		return quantidadePropostas;
	}

	public void setQuantidadePropostas(String quantidadePropostas) {
		this.quantidadePropostas = quantidadePropostas;
	}

	public String getCodigoBem() {
		return codigoBem;
	}

	public void setCodigoBem(String codigoBem) {
		this.codigoBem = codigoBem;
	}

	public String getDataInicioObra() {
		return dataInicioObra;
	}

	public void setDataInicioObra(String dataInicioObra) {
		this.dataInicioObra = dataInicioObra;
	}

	public String getDataFimObra() {
		return dataFimObra;
	}

	public void setDataFimObra(String dataFimObra) {
		this.dataFimObra = dataFimObra;
	}

	public String getDiaBase() {
		return diaBase;
	}

	public void setDiaBase(String diaBase) {
		this.diaBase = diaBase;
	}

	public String getTipoTerreno() {
		return tipoTerreno;
	}

	public void setTipoTerreno(String tipoTerreno) {
		this.tipoTerreno = tipoTerreno;
	}

	public String getQtdContrapartida() {
		return qtdContrapartida;
	}

	public void setQtdContrapartida(String qtdContrapartida) {
		this.qtdContrapartida = qtdContrapartida;
	}

	public String getQtdCaucao() {
		return qtdCaucao;
	}

	public void setQtdCaucao(String qtdCaucao) {
		this.qtdCaucao = qtdCaucao;
	}

	public String getValoresDespesasDiversas() {
		return valoresDespesasDiversas;
	}

	public void setValoresDespesasDiversas(String valoresDespesasDiversas) {
		this.valoresDespesasDiversas = valoresDespesasDiversas;
	}

	public String getPercentuais() {
		return percentuais;
	}

	public void setPercentuais(String percentuais) {
		this.percentuais = percentuais;
	}

	public void separarValoresDespesasDiversas() {
		for (String listaValoresDespesasDiversas1 : getValoresDespesasDiversas()
				.split(";")) {
			listaValoresDespesasDiversas.add(listaValoresDespesasDiversas1);
		}
		System.out.println();
		System.out.println(listaValoresDespesasDiversas);
	}

	public void separarListaPercentuais() {
		for (String listaPercentuais1 : getPercentuais().split(";")) {
			listaPercentuais.add(listaPercentuais1);
		}
		System.out.println();
		System.out.println(listaPercentuais);
	}

	@Override
	public String toString() {
		return "DadosArquivo [nome=" + nome + ", quantidadePropostas="
				+ quantidadePropostas + ", codigoBem=" + codigoBem
				+ ", dataInicioObra=" + dataInicioObra + ", dataFimObra="
				+ dataFimObra + ", diaBase=" + diaBase + ", tipoTerreno="
				+ tipoTerreno + ", qtdContrapartida=" + qtdContrapartida
				+ ", qtdCaucao=" + qtdCaucao + ", valoresDespesasDiversas="
				+ valoresDespesasDiversas + ", percentuais=" + percentuais
				+ ", listaValoresDespesasDiversas="
				+ listaValoresDespesasDiversas + ", listaPercentuais="
				+ listaPercentuais + "]";
	}

}