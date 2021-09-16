package componentes;

import java.text.NumberFormat;
import java.text.ParsePosition;

public class MeuCampoNumerico extends MeuJTextField {
    public MeuCampoNumerico(Integer tamanho, String dica, Boolean obrigatorio) {
        super(10, dica, obrigatorio);
    }

    public Boolean eValido() {
        String conteudo = getText();

        if (isNumeric(conteudo)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNumeric(String str) {
        ParsePosition pos = new ParsePosition(0);
        NumberFormat.getInstance().parse(str, pos);
        return str.length() == pos.getIndex();
    }
}