package main.Ejercicio_9;

import java.util.Stack;

public class Navegador {
    Stack<String> historial = new Stack<>();

    public void visitarPagina(String url) {
        historial.push(url);
        System.out.println("Visitando: " + url);
    }

    public String retroceder() {
        if (historial.size() > 1) {
            historial.pop();
            return "Regresando a: " + historial.peek();
        }
        return "No hay páginas anteriores";
    }
}
