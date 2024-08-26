package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        //Impressora impressora = new Deskjet();
        EquipamentoMultifuncional em =  new EquipamentoMultifuncional();
        //Impressora impressora = new EquipamentoMultifuncional(); // O equipamento multifuncioal agora pode ser uma
        // impressora pois ele implementa a interface impressora

        Scanner scaner = new Scanner();

        Deskjet deskjet = new Deskjet();
        // Impressora impressora = deskjet; pode pois o deskjet represeta o papel de  uma impressora;
        // Digitalizadora digitalizadora = deskjet; Não pode, pois o deskjet não é uma digitalizadora

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;


        impressora.imprimir();
        // O objeto multifunional pode representar qualquer dos três papéis definidos dentro da estrutura de objetos.
        // ele é os três objetos.
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
