package view;

import controller.EscalonadorController;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		EscalonadorController escalonador = new EscalonadorController();
		Fila filaProcessos = new Fila();
		String processos[] = { "word.exe;14", "excel.exe;35", "msedge.exe;27", "notepad.exe;52", 
				"chrome.exe;18", "calc.exe;25" };
		for (String processo : processos) {
			filaProcessos.insert(processo);
		}
		
		escalonador.escalonar(filaProcessos);

	}

}
