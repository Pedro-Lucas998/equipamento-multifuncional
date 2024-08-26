package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    @Override // Override serve pra dizer que é uma sobrescrita do método que foi implementado ""herdado""
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("imprimindo via equipamento multifuncional");
    }
}
