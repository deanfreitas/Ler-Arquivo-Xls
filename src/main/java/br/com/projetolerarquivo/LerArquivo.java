package br.com.projetolerarquivo;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class LerArquivo {

	private static List<DadosArquivo> minhalista = new ArrayList<DadosArquivo>();

	public static void main(String[] args) throws IOException {
		arquivoExcel();
		System.out.println();
		for (DadosArquivo arquivo : minhalista) {
			System.out.println(arquivo.toString());
		}
	}

	public static void arquivoExcel() throws IOException {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream file = classloader.getResourceAsStream("TesteApachePoi.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(file);
		HSSFSheet sheet = workbook.getSheetAt(0);

		for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {
			HSSFRow row = sheet.getRow(i);
			System.out.println();
			DadosArquivo dadosLinha = new DadosArquivo();
			dadosLinha.setNome(row.getCell(0).toString());
			dadosLinha.setQuantidadePropostas(row.getCell(1).toString());
			dadosLinha.setCodigoBem(row.getCell(2).toString());
			dadosLinha.setDataInicioObra(row.getCell(3).toString());
			dadosLinha.setDataFimObra(row.getCell(4).toString());
			dadosLinha.setDiaBase(row.getCell(5).toString());
			dadosLinha.setTipoTerreno(row.getCell(6).toString());
			dadosLinha.setQtdContrapartida(row.getCell(7).toString());
			dadosLinha.setQtdCaucao(row.getCell(8).toString());
			dadosLinha.setValoresDespesasDiversas(row.getCell(9).toString());
			dadosLinha.setPercentuais(row.getCell(10).toString());
			dadosLinha.separarValoresDespesasDiversas();
			dadosLinha.separarListaPercentuais();
			minhalista.add(dadosLinha);
		}
		workbook.close();
	}
}
