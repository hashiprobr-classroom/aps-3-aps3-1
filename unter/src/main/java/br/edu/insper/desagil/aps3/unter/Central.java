package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;

public class Central {
    private List<Corrida> corridas;

    public Central() {
        this.corridas = new ArrayList<>();
    }

    public void adiciona(Corrida corrida) {
        this.corridas.add(corrida);
    }

    public double mediaPassageiro(String cpf) {
        int soma = 0;
        int count = 0;

        for (Corrida corrida : corridas) {
            if (corrida.getPassageiro().getCpf().equals(cpf)) {
                int nota = corrida.getNotaPassageiro();
                if (nota > 0) {
                    soma += nota;
                    count++;
                }
            }
        }

        return count > 0 ? (double) soma / count : 0.0;
    }

    public double mediaMotorista(String cpf) {
        int soma = 0;
        int count = 0;

        for (Corrida corrida : corridas) {
            Motorista motorista = corrida.getMotorista();
            if (motorista != null && motorista.getCpf().equals(cpf)) {
                int nota = corrida.getNotaMotorista();
                if (nota > 0) {
                    soma += nota;
                    count++;
                }
            }
        }

        return count > 0 ? (double) soma / count : 0.0;
    }
}
