import java.util.Map;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		Grafo grafo = new Grafo();

		// inserindo as arestas

		int x;

		while (true) {

			x = Integer.parseInt(JOptionPane.showInputDialog(
					"Atividade 4 Selmini \n \n1. Inserir novas cidades no mapa (origem, destino e distância) \n\n2. Calcular e exibir a rota e a distância entre duas cidades \n \n3. Finalizar"));

			if (x == 1) {

				Aresta a = new Aresta();
				String o, d;
				int p;

				o = JOptionPane.showInputDialog("Insira a origem:");
				d = JOptionPane.showInputDialog("Insira o destino:");
				p = Integer.parseInt(JOptionPane.showInputDialog("Insira a distância (em Km)"));

				a.setOrigem(o);
				a.setDestino(d);
				a.setPeso(p);

				grafo.adicionarAresta(a);

				Aresta a1 = new Aresta();

				a1.setOrigem(d);
				a1.setDestino(o);
				a1.setPeso(p);

				grafo.adicionarAresta(a1);

			} else if (x == 2) {

				// chamar o método para calcular o caminho mínimo
				String origem = JOptionPane.showInputDialog("Insira uma cidade de origem");
				String destino = JOptionPane.showInputDialog("Insira a cidade de destino");
				Map<String, Integer> caminhoMinimo = grafo.calcularCaminhoMinimo(origem);

				// Imprimir o caminho mínimo do nó de origem até todos os outros nós


					int distancia = caminhoMinimo.get(destino);

					JOptionPane.showMessageDialog(null,
							"Distância de " + origem + " até " + destino + ": " + distancia + " Km");


			} else if (x == 3) {

				JOptionPane.showMessageDialog(null, "Operação finalizado com sucesso!");
				break;

			} else {

				JOptionPane.showMessageDialog(null, "Insira uma operação válida");

			}

		}

	}
}
