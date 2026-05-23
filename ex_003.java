package Sistema_de_Agendamento_Médico_refactor;

import java.util.Random;
import java.util.Scanner;

class Paciente {

    private String cpf;
    private String nome;
    private String especialidade;
    private boolean cadastrado;

    Paciente() {

        cpf = "";
        nome = "";
        especialidade = "";
        cadastrado = false;
    }

    Paciente(String cpf,
             String nome,
             String especialidade,
             boolean cadastrado) {

        this.cpf = cpf;
        this.nome = nome;
        this.especialidade = especialidade;
        this.cadastrado = cadastrado;
    }

    public String getCpf() {

        return cpf;
    }

    public String getNome() {

        return nome;
    }

    public String getEspecialidade() {

        return especialidade;
    }

    public boolean isCadastrado() {

        return cadastrado;
    }
}

class Agendamento {

    void agendarConsulta(Paciente paciente) {

        if (!paciente.isCadastrado()) {

            System.out.println("Paciente não cadastrado.");
            return;
        }

        Random random = new Random();

        String[] horarios = new String[3];

        for (int i = 0; i < 3; i++) {

            int hora = random.nextInt(8) + 8;

            int minuto;

            if (random.nextBoolean()) {
                minuto = 0;
            } else {
                minuto = 30;
            }

            horarios[i] = String.format("%02d:%02d", hora, minuto);
        }

        System.out.println("\nHorários disponíveis:");

        for (int i = 0; i < horarios.length; i++) {

            System.out.println((i + 1) + " - " + horarios[i]);
        }

        Scanner sc = new Scanner(System.in);

        int escolha = 0;

        while (escolha < 1 || escolha > 3) {

            System.out.print("\nEscolha um horário: ");
            escolha = sc.nextInt();
        }

        System.out.println("Consulta agendada com sucesso.");
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("CPF: " + paciente.getCpf());
        System.out.println("Especialidade: " + paciente.getEspecialidade());
        System.out.println("Horário marcado: " + horarios[escolha - 1]);
    }
}

